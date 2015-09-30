package com.huanggusheng.leqee;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Initdata {

	/**
	 * 构造测试数据
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public ArrayList<Integer> InitArrayData() throws NumberFormatException, IOException{
		ArrayList<Integer> arr = new ArrayList<>();		
		BufferedReader br = new BufferedReader(new InputStreamReader
				(new FileInputStream("source.txt")));
		String line ;
		while((line = br.readLine()) != null)
		{	
			if(line != null){
				int data = Integer.valueOf(line).intValue();
				arr.add(data);
			}
		}
		br.close();
		return arr;		
	}
}
