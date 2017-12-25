package com.cn.hnust.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cn.hnust.pojo.Img;
import com.cn.hnust.service.ImgService;

@Controller
public class ImgController {
	@Autowired
	private ImgService imgService;
    @RequestMapping("/upload")
	public String uploadImg(MultipartFile pic1,HttpServletRequest request,Model model) throws Exception, IOException{
    			
		//String path = request.getSession().getServletContext().getRealPath("/uploadImages");
		String path = "\\WEB-INF\\images";
    	String fileName =UUID.randomUUID() + 
			pic1.getOriginalFilename().substring(pic1.getOriginalFilename()
					.lastIndexOf("."));	//把.xxx后缀截取出来加上随机的UUID	
		File dir = new File(path, fileName);	
		if (!dir.exists()) {
			dir.mkdirs();
		}
		// MultipartFile自带的解析方法
		pic1.transferTo(dir);
		Img img = new Img ();
		img.setImgPath(path);
		img.setName(fileName);
		imgService.addImage(img);
		model.addAttribute("img", img);//为前端展示图片准备数据
		return "main";

    }

}
