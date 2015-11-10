package com.huanggusheng.dazhongdianping;

import java.util.Scanner;

/**
 * 输入一个字符串，去除连续的@,只保留一个，并输出
 * 样例输入：@@@@@@abcd@@@ef@g@@
 * 样例输出：@abcd@ef@g@
 * @author Huang
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner sc = new Scanner(System.in);
		 System.out.println("输入字符串:");
		 String in = sc.next();
		 StringBuffer s = new StringBuffer();
		for(int i = 0;i<in.length() - 1;i++){
			if(in.charAt(i)=='@'&&in.charAt(i+1)!='@'){
				s.append(in.charAt(i));
				s.append(in.charAt(i+1));
			}else if(in.charAt(i)!='@'&&in.charAt(i+1)!='@'){
				s.append(in.charAt(i+1));
			}
		}
		 if(in.charAt(in.length()-1)=='@') s.append('@');
		
		System.out.println(s.toString());
	}
}
