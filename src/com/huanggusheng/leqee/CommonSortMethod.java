package com.huanggusheng.leqee;

import java.util.ArrayList;

/**
 * �������Թ���дһ��ð������ûд����~~~
 * �����Ѽ��ֳ��������򶼿���һ�飬����дһд������
 * @author 	�ƹ���
 */

public class CommonSortMethod {

	/**
	 * ð������
	 */
	public void bubbleSort(ArrayList<Integer> list){
		int temp;
		int flag = 1;
		for(int i = 1; i < list.size()&& flag == 1; i++){
			flag = 0;
			for(int j = 0; j < list.size() - i; j++){
				if(list.get(j) > list.get(j+1)){
					flag = 1;
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
//		System.out.println(list.toString());
	}
	
	/**
	 * ֱ�Ӳ�������
	 */
	public void insertSort(ArrayList<Integer> list){
		int temp,j;
		for(int i = 0; i < list.size() - 1;i ++){
			temp = list.get(i+1);
			j = i;
			while(j > -1&&temp < list.get(j)){
				list.set(j+1,list.get(j));
				j--;
			}
			list.set(j+1, temp);
		}
//		System.out.println(list.toString());
	}

	/**
	 * ϣ������
	 */
	public void shellSort(ArrayList<Integer> list){
		int temp,j;
		int span = list.size()/2;
		while(span > 0){
			for(int k = 0;k < span ; k ++){
				for(int i = k; i < list.size() - span;i=i+span){
					temp = list.get(i+span);
					j = i;
					while(j >-1 && temp < list.get(j)){
						list.set(j+span,list.get(j));
						j = j - span;
					}
					list.set(j+span, temp);
				}
			}
			span =span/2;
			}			
			//System.out.println(list.toString());
		}
	
	/**
	 * ѡ������
	 */
	public void selectSort(ArrayList<Integer> list){
		int temp,small,m = 0;
//����һ
//		for(int i = 0 ; i < list.size() -1 ; i ++){
//			small = list.get(i);
//			for(int j = i + 1; j < list.size()-1; j ++){
//				if(list.get(j)<small) {
//					small = list.get(j);
//					m = j;
//				}
//				temp = list.get(i);
//				list.set(i, small);
//				list.set(m, temp);
//			}
//		}
//����������ʵ���~��
		for(int i = 0; i < list.size() - 1; i++){
			small = i;
			for(int j = i + 1; j < list.size() -1; j++){
				if(list.get(j)<list.get(small)) {
					small = j;
				}
				if(small !=i){
					temp = list.get(i);
					list.set(i, list.get(small));
					list.set(small, temp);	
				}
			}
			
		}
		System.out.println(list.toString());
	}
	
	
	
	
}
