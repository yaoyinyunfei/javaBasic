package com.everelegance.study.note;

import com.everelegance.study.note1.Dog;

public class TestObject {


	public static void main(String[] agrs){
		Animals animal = new Animals();
		//animal.eat();//动物都需要进食
		//animal.sleep();//动物都睡觉
		
		Cat cat = new Cat();
		//miaow()是不能直接去调去不了的，是私有化的
		cat.eat();//喵吃鱼(重写了父类的方法)
		//cat.sleep();//动物都睡觉
		//cat.eat("finish");//finish(注：protected)
		
		Animals ani = new Cat();
		//ani.eat();//喵吃鱼
		
		Dog dog = new Dog();
		//bark()方法调用不了，因为是protected
		//dog.eat();//够吃骨头
		
	}
	
}
