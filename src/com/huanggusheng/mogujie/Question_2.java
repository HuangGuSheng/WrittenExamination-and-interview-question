package com.huanggusheng.mogujie;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {

	/** 
	 * 示例输入：
	 *  4 3
	 *  2 3 2 1
	 *  示例输出
	 *  3
	 * @param args
	 */
	int n;		//班级数
	int m; 		//每车最大载客数
	int[] arr = new int[n];
	public static void main(String[] args) {
		Question_2 main = new Question_2();
		main.initData();
		//main.getBusCount();
	}


	private void initData() {
		System.out.println("输入班级数和车最大载客数：");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		System.out.println("依次输入班级人数：");
		Scanner s= new Scanner(System.in);
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		}	
		getCount(arr);
	}

	private void getCount(int[] arr2) {
		// TODO 自动生成的方法存根
		
	}
	
}
