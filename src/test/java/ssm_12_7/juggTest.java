package ssm_12_7;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class juggTest  {
	public static  void main(String []args)throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook(); //建立新 HSSFWorkbook 对象
		HSSFSheet sheet = wb.createSheet("new sheet"); //建立新的 sheet 对象
		HSSFSheet sheet2 = wb.createSheet("new sheet2"); //建立新的 sheet 对象
		HSSFRow row = sheet.createRow((short)0);
		HSSFRow row2 = sheet.createRow((short)1);
		HSSFRow row3 = sheet.createRow((short)2);
		
		//在 sheet 里创建一行，参数为行号（第一行，此处可想象成数组）
		HSSFCell cell = row.createCell((short)0);		
		//在 row 里建立新 cell（单元格），参数为列号（第一列）
		cell.setCellValue(1); //设置 cell 的整数类型的值
		row.createCell((short)1).setCellValue(1.2); //设置 cell 浮点类型的值
		row.createCell((short)2).setCellValue("test"); //设置 cell 字符类型的值
		row.createCell((short)3).setCellValue(true); //设置 cell 布尔类型的值
		
		HSSFCell cell2 = row.createCell((short)2);
		cell2.setCellValue(2);
		row2.createCell((short)1).setCellValue("你好");
		row2.createCell((short)2).setCellValue("你好");
		row2.createCell((short)3).setCellValue("你好");
		row2.createCell((short)4).setCellValue("你好");
		
		HSSFCell cell3 = row.createCell((short)2);
		cell3.setCellValue(0);
		row2.createCell((short)4).setCellValue("你好");
		
		
		
		HSSFCellStyle cellStyle = wb.createCellStyle(); //建立新的 cell 样式
		cellStyle.setDataFormat(HSSFDataFormat. getBuiltinFormat("m/d/yy h:mm"));
		//设置 cell 样式为定制的日期格式
		HSSFCell dCell =row.createCell((short)4);
		dCell.setCellValue(new Date()); //设置 cell 为日期类型的值
		dCell.setCellStyle(cellStyle); //设置该 cell 日期的显示格式
		
		HSSFCell csCell =row.createCell((short)5);
		
		//csCell.setEncoding(HSSFCell.ENCODING_UTF_16);
		//设置 cell 编码解决中文高位字节截断
		csCell.setCellValue("中文测试_Chinese Words Test"); //设置中西文结合字符串
		row.createCell((short)6).setCellType(HSSFCell.CELL_TYPE_ERROR);
		//建立错误 cell
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\1\\Desktop\\1.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}
