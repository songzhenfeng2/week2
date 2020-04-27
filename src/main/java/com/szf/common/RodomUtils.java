package com.szf.common;

import java.util.Random;

import javax.management.RuntimeErrorException;

public class RodomUtils {

	public static int radom(int min, int max) {
		// TODO Auto-generated method stub
		//判断输入数字是否合理
		if(max<=min) {
			throw new RuntimeException("请输入合理的数字");
		}
		Random r = new Random();
		int i = r.nextInt(max-1+min)+1;
		return i;
	}
	
	public static double getValue(final double min, final double max,final int scale){
		
		return 1.00;
	}


}
