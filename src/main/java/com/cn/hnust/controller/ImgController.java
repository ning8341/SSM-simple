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
					.lastIndexOf("."));	//��.xxx��׺��ȡ�������������UUID	
		File dir = new File(path, fileName);	
		if (!dir.exists()) {
			dir.mkdirs();
		}
		// MultipartFile�Դ��Ľ�������
		pic1.transferTo(dir);
		Img img = new Img ();
		img.setImgPath(path);
		img.setName(fileName);
		imgService.addImage(img);
		model.addAttribute("img", img);//Ϊǰ��չʾͼƬ׼������
		return "main";

    }

}
