package com.baidu.utils;

import java.security.MessageDigest;

/**
 * @author liwen
 * @version 2018年6月13日下午2:35:33
 * 说明:32位小写md5加密
 */
public class MD5Util {

	public static String getMD5(String str){
		 MessageDigest md5; 
		 try {
			 
			md5 = MessageDigest.getInstance("MD5");
			byte[] md5Bytes = md5.digest(str.getBytes());  
            StringBuffer hexValue = new StringBuffer();  
            for (int i = 0; i < md5Bytes.length; i++) {  
                int val = ((int) md5Bytes[i]) & 0xff;  
                if (val < 16)  
                    hexValue.append("0");  
                hexValue.append(Integer.toHexString(val));  
            }  
            str = hexValue.toString(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return str;
	}
	
}
