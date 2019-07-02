package com.cocoiso.utils;

import java.util.Random;
import java.util.UUID;

public class RandomIDUtils {

	/**
	 * 生成随机字符串（大写），32位的
	 * String
	 * @return
	 * 下午5:32:38
	 */
	public static String getStringUpperCase(){
		String string = UUID.randomUUID().toString().replace("-", "").toUpperCase();
		return string;
	}
	
	/**
	 * 生成随机字符串（小写），32位的
	 * String
	 * @return
	 * 下午5:35:12
	 */
	public static String getStringLowerCase(){
		String string = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		return string;
	}
	
	/**
	 * 生成随机整形类型
	 * int
	 * @return
	 * 下午5:35:28
	 */
	public static int getIntID(){
		// 系统毫秒
		long millis = System.nanoTime();
		// 加上两位随机数
		Random random = new Random();
		int two = random.nextInt(99);
		//截取前面4位数
		String submillis = String.valueOf(millis).substring(0, 4);
		// 如果不足两位前面补0
		String str = submillis + String.format("%02d", two);
		int id = new Integer(str);
		return id;
	}
	
	
}
