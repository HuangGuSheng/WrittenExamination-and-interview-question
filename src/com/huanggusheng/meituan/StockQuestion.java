package com.huanggusheng.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class StockQuestion {

	/**
	 *  �ڹ��еĽ������У����ǿ��Խ��й�Ʊ��������������һ���������Խ�����������
	 *  ��0 <=�������� <= 2�����������Ĺ�����һ�ʳɽ��������һ�ʣ���������->
	 *  ��->��->����˳�򣩡�����һ���й�Ʊ�۸�仯����prices����дһ���������
	 *  ��һ���п��Ի�õ�������档�����ʱ�临�ӶȾ����͵��㷨ʵ�֡�
	 *  ʾ������:
	 *  ��Ʊ�۸�
	 *  [10,22,5,75,65,80]
	 *  ʾ������ֵ:
	 *  �������
	 *  87
	 *  (10��22����5��80��)
	 * @param args
	 */
	
	
	private int priceCount;
	private static int[] prices;
	
	public int maxProfit(int[] prices){
		int maxProfit = 0;
		int chargeLimit = 2;
		return maxProfit;
		
	}
	
	public  void initDatas() {
		System.out.println("������۸������");
		Scanner scanner = new Scanner(System.in);
		priceCount = scanner.nextInt();
		System.out.println("������ÿ�εļ۸�");
		prices = new int[priceCount];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < priceCount ; i ++){
			prices[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(prices));
	}
	
	public static void main(String[] args) {
		StockQuestion sq = new StockQuestion();
		sq.initDatas();		
		sq.maxProfit(prices);
	}
}
