package com.huanggusheng.mogujie;

import java.util.Arrays;
import java.util.Scanner;

//没想出来，是属于哪类问题呢~

/** 
 * 这个题目也没记~大概意思是学校要组织出去玩，班级数为n，每车最大的载客数为m，
 * 一个班的人上车以后下个班的人才能上车，若果车没做满则优先坐满该车，程序要求输入
 * 班级数和车最大载客数，并输入每个班的人数，输出需要多少辆车
 * 示例输入：
 *  4 3
 *  2 3 2 1
 *  示例输出
 *  3
 * @author Huang
 */
public class Question_2 {

	
	
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
