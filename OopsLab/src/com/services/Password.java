package com.services;

import java.util.Random;

public class Password {
	public void createPassword() {
		String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String special="*&^%$#@!?<>)(";
		
		String combination=num+capital+small+special;
		int len=8;
		
		char[] password = new char[len];
		Random r =new Random();
		
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		
		System.out.println("Password--> "+new String (password));
		
	}

}
