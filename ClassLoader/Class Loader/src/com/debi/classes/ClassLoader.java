package com.debi.classes;

import javax.xml.XMLConstants;

public class ClassLoader {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(ClassLoader.class.getClassLoader());
		String a=XMLConstants.FEATURE_SECURE_PROCESSING;
		System.out.println(XMLConstants.class.getClassLoader());
		Class c=Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println(c.getClassLoader());
	}
}
