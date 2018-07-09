package com.aaa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtils {

	public static String uploadFile(MultipartFile upfile, String path) {
		boolean rs = true;
		String saveFileName = "";
		try {
			// 判断是否有上传的文件
			String oldfileName = upfile.getOriginalFilename();
			if (!"".equals(oldfileName)) {
				// 1.重命名
				// 获取源文件文件后缀 1.1.1.txt
				Integer i = oldfileName.lastIndexOf(".");
				String endStr = oldfileName.substring(i);
				// 新文件名

				saveFileName = UUID.randomUUID() + endStr;

				System.out.println("新文件名" + saveFileName);

				// 获取保存路径
				File f = new File(path + "/" + saveFileName);

				upfile.transferTo(f);
			}
		} catch (Exception e) {
			rs = false;
		}
		if (rs) {
			return path + "/" + saveFileName;
		} else {
			return "";
		}
	}

	public static String uploadFile(MultipartFile[] upfiles, String path) {
		String rs = "";
		for (MultipartFile upfile : upfiles) {
			rs = rs + uploadFile(upfile, path) + ";";
		}
		return rs;
	}
}
