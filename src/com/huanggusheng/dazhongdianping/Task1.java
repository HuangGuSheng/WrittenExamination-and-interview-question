package com.huanggusheng.dazhongdianping;

import java.util.Scanner;

/**
 * ����һ���ַ�����ȥ��������@,ֻ����һ���������
 * �������룺@@@@@@abcd@@@ef@g@@
 * ���������@abcd@ef@g@
 * @author Huang
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�����ַ���:");
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
