package com.javaIntro;

public class Ganga {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println (Class.forName("com.javaIntro.Ganga"));
		System.out.println (Class.forName("java.lang.String"));
		
	}

}
