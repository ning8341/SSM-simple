package com.cn.hnust.service.impl;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;
import com.cn.hnust.utils.PasswordUtil;

@Service("UserService")
public class UserSeviceImpl implements UserService {
	@Resource
	private UserDao userDao;

	/**
	 * 根据姓名查用户，用户名设计成唯一
	 * 
	 * @param username
	 * @return
	 */
	public User getUserByName(String username) {
		User user = userDao.selectUserByName(username);
		return user;
	}

	// 登录
	public boolean login(String userName, String password) {
		// 登录
		User user = userDao.selectUserByName(userName);

		if (user != null) {
			if (user.getUserName().equals(userName) && PasswordUtil.verify(password, PasswordUtil.generate(password))) {

				return true;
			}
		}
		return false;

	}

	// 注册
	public void register(User user) {
		// 把密码用MD5加盐加密，防密码破解
		user.setPassword(PasswordUtil.generate(user.getPassword()));
		userDao.insertUser(user);
	}

	// 查询
	public User reLogin(String userName) {
		User user = userDao.selectUserByName(userName);
		return user;
	}

	// 页面展示excel或者是导出excel
	public void export(String[] titles) {
		try {
			// 创建excel文件
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 建立新的sheet对象
			HSSFSheet hssfSheet = workbook.createSheet("sheet1");
			// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
			HSSFRow hssfRow = hssfSheet.createRow(0);
			// 第四步，创建单元格，并设置值表头 设置表头居中
			HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
			// 居中样式
			hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			HSSFCell hssfCell = null;
			for (int i = 0; i < titles.length; i++) {
				hssfCell = hssfRow.createCell(i);// 列索引从0开始
				hssfCell.setCellValue(titles[i]);// 列名1
				hssfCell.setCellStyle(hssfCellStyle);// 列居中显示
			}
			// 第五步，写入实体数据
			List<User> users = userDao.queryUser();
			if (users != null && !users.isEmpty()) {
				for (int i = 0; i < users.size(); i++) {
					hssfRow = hssfSheet.createRow(i + 1);
					User user = users.get(i);
					// 第六步，创建单元格，并设置值
					int userid = 0;
					if (user.getId() != 0) {
						userid = user.getId();
					}
					hssfRow.createCell(0).setCellValue(userid);
					String userName = "";
					if (user.getUserName() != null) {
						System.out.println(user.getUserName());
						userName = user.getUserName();
					}
					hssfRow.createCell(1).setCellValue(userName);
					String password = "";
					if (user.getPassword() != null) {
						password = user.getPassword();
					}
					hssfRow.createCell(2).setCellValue(password);

					String email = "";
					if (user.getEmail() != null) {
						email = user.getEmail();
					}
					hssfRow.createCell(3).setCellValue(email);

					int phoneNumber = 0;
					if (user.getPhoneNumber() != 0) {
						phoneNumber = user.getPhoneNumber();
					}
					hssfRow.createCell(4).setCellValue(phoneNumber);
				}
			}

			// 第七步，将文件输出到客户端浏览器 || 使用下载
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("d:\\2.xls");// 指定路径与名字和格式
				workbook.write(fileOutputStream);// 将数据写出去
				fileOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
