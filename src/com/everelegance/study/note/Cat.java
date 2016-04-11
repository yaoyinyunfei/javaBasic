package com.everelegance.study.note;

public class Cat extends Animals{

	public String name;
	
	private int age;
	
	private void miaow(){
		System.out.println("喵");
	}
	
	//重写
	@Override
	public void eat(){
		System.out.println("喵吃鱼");
	}
	
	//重载
	protected void eat(String food){
		
		System.out.println(food);
	}
}
