package com.cn.hnust.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.websocket.Encoder.BinaryStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.ImgDao;
import com.cn.hnust.pojo.Img;
import com.cn.hnust.service.ImgService;

@Service
public class ImgSeviceImpl implements ImgService {
	@Autowired
	private ImgDao imgDao;

	public void addImage(Img img) {
		imgDao.insertImg(img);
		
	}



}
