package com.everelegance.study.note2;

public class DataTransport {

	public static void main(String[] args) {
		
		byte a = 60;
		byte b = 33;
		byte c = (byte) (a + b);//强制转换
		int d = a + b;
		System.out.println("byte c: " + c);//93//强制转换
		System.out.println("int d: " + d);//93//系统将转换为int型运算
		
		float f = a + b;
		System.out.println("float f: " + f);//93.0//系统将转换为float型运算
		double g = a + b;
		System.out.println("double g: " + g);//93.0//系统将转换为double型运算
		
		float h =(float) ((a + b)*1.2);//强制转换
		System.out.println("float h: " + h);//111.6//强转
		
		double d1 = 1e200;
		System.out.println("double d1: " + d1);//1.0E200
		float j = (float)d1;//强制转换
		System.out.println("float j: " + j);//Infinity//会产生溢出
		
		int aa, dd, bb=10, cc=20;
		aa = bb++;
		dd = ++cc;
		System.out.println("bb++: " + aa);//10//++在后，先用后加
		System.out.println("++cc: " + dd);//20//++在前，先加后用
		
		boolean a1, b2, c1, c2, c3, c4, c5, c6;
		a1 = true;
		b2 = false;
		c1 = a1 & b2;
		c2 = a1 | b2;
		c3 = !a1;
		c4 = a1 && b2;
		c5 = a1 || b2;
		c6 = a1 ^ b2;
		
		System.out.println("a1 & b2: " + c1);
		System.out.println("a1 | b2: " + c2);
		System.out.println("!a1: " + c3);
		System.out.println("a1 && b2: " + c4);
		System.out.println("a1 || b2: " + c5);
		System.out.println("a1 ^ b2: " + c6);
		
		
	}
}
