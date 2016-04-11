package com.everelegance.study.note2;

public class TestStringMethod {

	public static void main(String[] args) {
		
		String requestUrl = "https: //mmbiz.qlogo.cn/mmbiz/o8jk4Xrkia61ibN2ObKAWadqvdvPRBGBXK3DS1Ggbeb2D3e4mLNT8mVL2cSnVuAqroqyckiaAAs7NowYH0YxBIFkA/0?wx_fmt=jpeg";
		String qq = requestUrl.substring(0, 6);
		String url = requestUrl.substring(7);
		String imageUrl = qq + url;
		String urls = requestUrl.replaceAll(" ", "");//这是用于去除字符串中所有的空格（相比之前的方法简单）
		System.out.println(qq);
		System.out.println(url);
		System.out.println(imageUrl);
		System.out.println(urls);
	}
}
