package com.huanggusheng.didi;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetZeroArray {

	/**
	 * ���Ϊ���������
		Time Limit: 2000/2000 MS (Java/Others) Memory Limit: 32768/32768 K (Java/Others)
		Problem Description:
		һ������ΪN�������а����������������㣬 ��ʵ��һ�������ҳ���ĺ�Ϊ������������顣
		����
		��������Ԫ����һ�У�Ԫ��֮���Կո�ָ�
		���
		��������Ԫ����һ�У�Ԫ��֮���Կո�ָ�

		��������
		1 2 3 4 -1 -2 -4 -3 1 2
		�������
		1 2 3 4 -1 -2 -4 -3
	 * @param args
	 */
	
	private boolean getMaxArr(int[] arr) {				//��������鿪ʼ��  ���Ϊ��������飬�ҵ���break
		boolean flag = false;
		a:
		for(int i = arr.length; i > 1; i--){              			
			for(int k = 0; k < arr.length-i+1;k++){
				int sum = 0;
				for(int j = k ; j < i + k; j++){
					sum += arr[j];					
				}
				System.out.println(sum);
				if(sum == 0){
					flag = true;
					System.out.println("��ĺ�Ϊ�������������Ϊ��");
					for(int m = k;m < i; m++){
						System.out.print(arr[m]+",");
					}
					break a;
				}	
			}			
		}
		return flag;
	}
	
	public static void main(String[] args) {
		GetZeroArray main = new GetZeroArray();
		System.out.println("���鳤�ȣ�");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("���������飺");
		int[] arr = new int[n];
		Scanner sc2 = new Scanner(System.in);
		for(int i = 0 ; i < n;i ++){
			arr[i] = sc.nextInt();
		}
		if(!main.getMaxArr(arr)) System.out.println("��û����ĺ�Ϊ�������������~");;
	}	
}
