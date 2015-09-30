package com.huanggusheng.meituan;

import java.util.Arrays;
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

	private static int[] aaa(int[][] arr) {
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
	

	public static void main(String[] args) {

		int n = 4;
		int m = 1;
		int [][] arr = new int[n][n];
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				arr[i][j] = m;
				m++;
			}
		}
		
		int[] result = aaa(arr);
	
		System.out.println(Arrays.toString(result));
	}

	
}
