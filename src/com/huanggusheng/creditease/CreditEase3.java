package com.huanggusheng.creditease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem  Description:
Ҫ��  m  ����ˮ����  n  ����ͬ�������У����������㹻�󣩣������е������ǿյģ��ʹ��ж����ֲ�ͬ�ĵ���������k��ʾ��5��1��1��1��5��1��  1,1,5  ��ͬһ�ֵ�����

Input:  
��һ���ǲ������ݵ���Ŀ  x��0  <=  x  <=  20��������ÿ�о�������������m��n���Կո�ֿ���1<=m��n<=10��

Output:  
�������ÿ������m��n����һ�������Ӧ��k��
����ʾ����

1
7 3

���ʾ����

8


 * @author Huang
 *
 */
public class CreditEase3 {
	
	private int testCount;    //����������Ŀ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditEase3 c = new CreditEase3();
		int[][] data = c.getData();
		//c.getResult(data);
	}
	/**
	 * ��ʼ������
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
