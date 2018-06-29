package com.aaa.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	public static String uploadFile(MultipartFile upfile,String path){
		boolean rs=true;
		String saveName="";
		try {
			//判断是否有文件上传
			String oldName=upfile.getOriginalFilename();
			System.out.println(oldName+"*************");
			if(!"" .equals(oldName)){
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			//saveName = sdf.format(new Date()) + "_" + oldname;
			Integer i=oldName.lastIndexOf(".");
			String endStr=oldName.substring(i);
				saveName=UUID.randomUUID()+endStr;
			System.out.println("新文件名称"+saveName);
			
			//获取保存路劲
			File f=new File(path+"/"+saveName);
			upfile.transferTo(f);
			}
		} catch (Exception e) {
			rs=false;
		}
		if(rs){
			return path+"/"+saveName;
		}else{
			return "";
		}
		
		
	}
	public static String uploadFile(MultipartFile[] upfiles,String path){
		String rs = "";
		for (MultipartFile upfile : upfiles) {
			rs = rs + uploadFile(upfile, path) + ";";
		}
		return rs;
		
	} 
	

}
