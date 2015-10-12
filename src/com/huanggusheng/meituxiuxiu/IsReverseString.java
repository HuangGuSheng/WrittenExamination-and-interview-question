package com.huanggusheng.meituxiuxiu;

import java.util.Scanner;

/**
 * 检测字符串翻转后是否是否一样，比如aba这种
 * @author Huang
 *
 */
public class IsReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入检测字符串：");
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
