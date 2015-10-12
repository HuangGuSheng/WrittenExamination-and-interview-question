package com.huanggusheng.meituxiuxiu;

/**
 * 打印九九乘法表，要求不能用for和while
 * @author Huang
 *
 */
public class MultiplicationTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MultiplicationTables mt = new MultiplicationTables();
		mt.printTable();
	}
	
	/**
	 * 既然不能用for，while，那就用递归来解决好了
	 */
	int i = 1,j = 1;
	public void printTable(){
		if(j < 10){
			if(i == j){
				System.out.println(i+"*"+j+"="+i*j);
				j++;
				i = 1;
			}else{
				System.out.print(i+"*"+j+"="+i*j+" ");
				i++;
			}
			printTable();
		}
	}

}
