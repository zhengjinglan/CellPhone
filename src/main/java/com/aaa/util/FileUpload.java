package com.aaa.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	public static List<String> uplaods(MultipartFile[] photo,
			HttpServletRequest request) {
		List<String> lists = new ArrayList<String>();
		for (MultipartFile multipartFile : photo) {

			lists.add(upload(multipartFile, request));
		}
		return lists;
	}

	public static String upload(MultipartFile photo, HttpServletRequest request) {

		// 获取磁盘目录
		String photoName = "";
		String photoName2 = "";
		String path = request.getSession().getServletContext()
				.getRealPath("image");
		if (!photo.getOriginalFilename().equals("")) {
			photoName = path + "/" + UUID.randomUUID() + "_"
					+ photo.getOriginalFilename();
			File file = new File(photoName);
			file.mkdirs();
			photoName2 = UUID.randomUUID() + "_" + photo.getOriginalFilename();

			try {
				photo.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return photoName2;
	}
}
