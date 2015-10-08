package com.huanggusheng.meituan;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 题目要求
 * 输入{
 * 	[ 1, 2, 3, 4]
 * 	[ 5, 6, 7, 8]
 * 	[ 9,10,11,12]
 *  [13,14,15,16]
 * }
 * 输出[4, 3, 8, 2, 7, 12, 1, 6, 11, 16, 5, 10, 15, 9, 14, 13]
 * @author Huang
 *
 */
public class Main {

	private  int[] aaa(int[][] arr) {
		// TODO 自动生成的方法存根
		int[] result = new int[arr.length*arr.length];        //返回结果
		int j = 0; 
		int k = arr.length - 1;
		int flag = 0;
		for(int i = 0 ; i < result.length ; i++){
			result[i] = arr[j][k];
				if(j == (arr.length - 1) ){
					k = 0;
					flag --;
					j = j-flag;
				}else if(k == (arr.length - 1)){
					j = 0;
					flag ++;
					k= k - flag;;
				}else{
					j++;
					k++;
				}
			}
		return result;
	}
	
	public int[][] initData(){
		//int m = 3;
		//int n = 5;
		System.out.println("请输入行数和列数：");
		Scanner sc1 = new Scanner(System.in);
		int m = sc1.nextInt();
		int n = sc1.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("请输入数组:");
		Scanner sc2 = new Scanner(System.in);
		for(int i = 0; i < m; i++){
			for(int j = 0 ;j <n ; j++){
				arr[i][j] = sc2.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Main m = new Main();
		int[] result = m.aaa(m.initData());
	
		System.out.println(Arrays.toString(result));
	}	
}
