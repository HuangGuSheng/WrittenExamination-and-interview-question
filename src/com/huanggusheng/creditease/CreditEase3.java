package com.huanggusheng.creditease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem  Description:
要把  m  升的水倒入  n  个相同的容器中（假设容器足够大），允许有的容器是空的，问共有多少种不同的倒法？（用k表示）5，1，1和1，5，1和  1,1,5  是同一种倒法。

Input:  
第一行是测试数据的数目  x（0  <=  x  <=  20）。以下每行均包含二个整数m和n，以空格分开。1<=m，n<=10。

Output:  
对输入的每行数据m和n，用一行输出相应的k。
输入示例：

1
7 3

输出示例：

8


 * @author Huang
 *
 */
public class CreditEase3 {
	
	private int testCount;    //测试数据数目
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditEase3 c = new CreditEase3();
		int[][] data = c.getData();
		//c.getResult(data);
	}
	/**
	 * 初始化数据
	 * @return
	 */
	public int[][] getData(){
		Scanner sc = new Scanner(System.in);
		testCount = sc.nextInt();
		int[][] arr = new int[testCount][2];
		for(int i = 0; i < testCount ; i ++){
			Scanner s = new Scanner(System.in);
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public void getResult(int[][] arr){
	
	}
}
