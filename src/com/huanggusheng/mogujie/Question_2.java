package com.huanggusheng.mogujie;

import java.util.Arrays;
import java.util.Scanner;

//û�����������������������~

/** 
 * �����ĿҲû��~�����˼��ѧУҪ��֯��ȥ�棬�༶��Ϊn��ÿ�������ؿ���Ϊm��
 * һ��������ϳ��Ժ��¸�����˲����ϳ���������û���������������ó�������Ҫ������
 * �༶���ͳ�����ؿ�����������ÿ����������������Ҫ��������
 * ʾ�����룺
 *  4 3
 *  2 3 2 1
 *  ʾ�����
 *  3
 * @author Huang
 */
public class Question_2 {

	
	
	int n;		//�༶��
	int m; 		//ÿ������ؿ���
	int[] arr = new int[n];
	public static void main(String[] args) {
		Question_2 main = new Question_2();
		main.initData();
		//main.getBusCount();
	}


	private void initData() {
		System.out.println("����༶���ͳ�����ؿ�����");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		System.out.println("��������༶������");
		Scanner s= new Scanner(System.in);
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		}	
		getCount(arr);
	}

	private void getCount(int[] arr2) {
		// TODO �Զ����ɵķ������
		
	}
	
}
