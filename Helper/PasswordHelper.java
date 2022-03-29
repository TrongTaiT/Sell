/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.security.MessageDigest;

/**
 *
 * @author NguyenTruongChinh
 */
public class PasswordHelper {
    
    public static String doHashing(String password) {
		try {
			MessageDigest digs = MessageDigest.getInstance("MD5");
			digs.update(password.getBytes());
			byte[] resultByteArray = digs.digest();
			StringBuilder sb = 	new StringBuilder();
			for(byte b : resultByteArray) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
    
}
