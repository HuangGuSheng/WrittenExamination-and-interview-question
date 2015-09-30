package com.huanggusheng.mogujie;

import java.util.Scanner;

public class Question_1 {


		/**
		 * @param args
		 */
		public static void main(String[] args) {
			boolean flag = false;
			char [] array=new char[]{'a','b','c','d','e','f','g',
					'h','j','k','l','m','n','o','p','q','r','s','t',
					'u','v','w','x','y','z'}; 
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.println("ÇëÊäÈë¼ì²â×Ö·û´®:");
			String string1 = sc.nextLine();        //µÃµ½ÊäÈë×Ö·û´®
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
				return true;
				
			}else{
				return false;
			}
		}
	}


