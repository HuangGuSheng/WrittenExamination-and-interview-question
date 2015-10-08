package com.huanggusheng.didi;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetZeroArray {

	/**
	 * 最长和为零的子数组
		Time Limit: 2000/2000 MS (Java/Others) Memory Limit: 32768/32768 K (Java/Others)
		Problem Description:
		一个长度为N的数组中包含正数，负数，零， 请实现一个函数找出最长的和为零的连续子数组。
		输入
		所有数组元素在一行，元素之间以空格分隔
		输出
		所有数组元素在一行，元素之间以空格分隔

		样例输入
		1 2 3 4 -1 -2 -4 -3 1 2
		样例输出
		1 2 3 4 -1 -2 -4 -3
	 * @param args
	 */
	
	private boolean getMaxArr(int[] arr) {				//从最长子数组开始找  最长和为零的子数组，找到就break
		boolean flag = false;
		a:
		for(int i = arr.length - 1; i > 1; i--){              			
			for(int k = 0; k < arr.length-i+1;k++){
				int sum = 0;
				for(int j = k ; j < i + k; j++){
					sum += arr[j];					
				}
				//System.out.println(sum);
				//if(sum == 0){
					flag = true;
					System.out.println("最长的和为零的连续子数组为：");
					for(int m = k;m < i; m++){
						System.out.print(arr[m]+" ");
					}
					System.out.println();
					//break a;
				//}
			}			
		}
		return flag;
	}
	
	public static void main(String[] args) {
		GetZeroArray main = new GetZeroArray();
		System.out.println("数组长度：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("请输入数组：");
		int[] arr = new int[n];
		Scanner sc2 = new Scanner(System.in);
		for(int i = 0 ; i < n;i ++){
			arr[i] = sc.nextInt();
		}
		if(!main.getMaxArr(arr)) System.out.println("并没有和为零的连续子数组~");;
	}	
}
