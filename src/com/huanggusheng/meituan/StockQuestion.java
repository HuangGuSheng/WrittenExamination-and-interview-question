package com.huanggusheng.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class StockQuestion {
    
	//不会~~
	
	/**
	 *  在股市的交易日中，人们可以进行股票的买卖，假设在一天中最多可以进行两次买卖
	 *  （0 <=买卖次数 <= 2），但买卖的规则是一笔成交后进行另一笔（即按照买->
	 *  卖->买->卖的顺序）。给出一天中股票价格变化序列prices，请写一个程序计算
	 *  在一天中可以获得的最大收益。请采用时间复杂度尽量低的算法实现。
	 *  示例参数:
	 *  股票价格
	 *  [10,22,5,75,65,80]
	 *  示例返回值:
	 *  最大收益
	 *  87
	 *  (10买，22卖，5买，80卖)
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
		System.out.println("请输入价格次数：");
		Scanner scanner = new Scanner(System.in);
		priceCount = scanner.nextInt();
		System.out.println("请输入每次的价格");
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
