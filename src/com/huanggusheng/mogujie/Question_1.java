package com.huanggusheng.mogujie;

import java.util.Scanner;


/**
 * ���Ǹ�����Ŀ�ˣ���ŵ���˼��������һ���ַ������磺abc,testest,eoeo֮��ģ�
 * ����ܸ����ַ�����һ����ĸ��ʹ֮���жԳ��ԣ������YES���������NO���������룺"eoeo",
 * ����ĩβ��һ��e���"eoeoe",��ô���YES
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
			System.out.println("���������ַ���:");
			String string1 = sc.nextLine();        //�õ������ַ���
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


