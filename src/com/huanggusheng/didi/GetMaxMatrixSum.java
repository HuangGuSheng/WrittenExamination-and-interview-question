package com.huanggusheng.didi;

import java.util.Arrays;
import java.util.Scanner;

public class GetMaxMatrixSum {

	/**
	 * 求一个矩阵中最大的2*2矩阵(元素和最大)的和。
	 * 如:
		1 2 0 3 4
		2 3 4 5 1
		1 1 5 3 0
		中最大的是:
		4 5
		5 3
		和为17
	 * @param args
	 */
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
	public int fun(int[][] arr){
		int max = 0;
		int temp ;
		for(int i = 0; i < arr.length - 1;i ++){
			for(int j = 0; j < arr[0].length - 1; j++){
				if((temp = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1]) > max){
					max = temp;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		GetMaxMatrixSum main = new GetMaxMatrixSum();		
		int data[][] = main.initData();	
		int result = main.fun(data);
		System.out.println(result);
	}
}
