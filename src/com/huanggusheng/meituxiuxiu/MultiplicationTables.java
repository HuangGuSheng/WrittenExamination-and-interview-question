package com.huanggusheng.meituxiuxiu;

/**
 * ��ӡ�žų˷���Ҫ������for��while
 * @author Huang
 *
 */
public class MultiplicationTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MultiplicationTables mt = new MultiplicationTables();
		mt.printTable();
	}
	
	/**
	 * ��Ȼ������for��while���Ǿ��õݹ����������
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
