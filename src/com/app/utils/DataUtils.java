package com.app.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class DataUtils {
	public static String generateHash(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		String presalt="1a2b3c4d";
		String postsalt="d4c3b2a1";
		int itr=1000;
		while(itr>0)
		{
			password=password.concat(presalt);
			
		    MessageDigest hash = MessageDigest.getInstance("SHA-256");	 
		    hash.reset();
		    hash.update(password.getBytes("UTF-8"));
			
		    password=new BigInteger(1, hash.digest()).toString(16);
			password=postsalt.concat(password);

			itr--;
		}
		return password;
	}
	
}
