package com.huanggusheng.meituxiuxiu;

import java.util.Scanner;

/**
 * ����ַ�����ת���Ƿ��Ƿ�һ��������aba����
 * @author Huang
 *
 */
public class IsReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("���������ַ�����");
		Scanner sc = new Scanner(System.in);
		String s = detect(sc.next())?"YES":"NO";
		System.out.println(s);
	}
	public static boolean detect(String str) {
		String s = new StringBuffer (str).reverse().toString();
			
			if(str.equals(s)){
				return true;
				
			}else{
				return false;
			}
		}

}
