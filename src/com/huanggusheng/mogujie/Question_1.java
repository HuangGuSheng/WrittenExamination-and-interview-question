package com.huanggusheng.mogujie;

import java.util.Scanner;


/**
 * 忘记复制题目了，大概的意思是让输入一个字符串，如：abc,testest,eoeo之类的，
 * 如果能给该字符串加一个字母，使之具有对称性，就输出YES，否则输出NO。比如输入："eoeo",
 * 可以末尾加一个e变成"eoeoe",那么输出YES
 * @author Huang
 *
 */
public class Question_1 {

		public static void main(String[] args) {
			boolean flag = false;
			char [] array=new char[]{'a','b','c','d','e','f','g',
					'h','j','k','l','m','n','o','p','q','r','s','t',
					'u','v','w','x','y','z'}; 
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入检测字符串:");
			String string1 = sc.nextLine();        //得到输入字符串
			StringBuffer sb ;
			
			over:
			for(int i = 0; i <= string1.length(); i ++){			
				for(int j = 0; j < array.length; j ++){
					sb = new StringBuffer(string1);
					str = new StringBuffer(sb.insert(i, array[j])).toString();
					if(detect(str)){
						System.out.println("YES");
						flag = true;
						break over;
					}
				}
			}
			if(flag == false){
				System.out.println("NO");
			}
		}
		
		private static boolean detect(String str) {
		String s = new StringBuffer (str).reverse().toString();
			
			if(str.equals(s)){
				System.out.println(s);
				return true;
				
			}else{
				return false;
			}
		}
	}


