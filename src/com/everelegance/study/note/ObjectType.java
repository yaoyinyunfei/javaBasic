package com.everelegance.study.note;

public class ObjectType {

	
	public static void main(String[] args){
		
		int a = 2;
		
		Integer i = a;
		
		System.out.println(i);
		
		Integer ii = 3;
		int b = ii;
		
		System.out.println(b);
		
		Integer i1 = 256;
		Integer i2 = 256;
		if(i1 == i2 ){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		
	}
	
}
