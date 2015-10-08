package com.huanggusheng.leqee;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

	/**
	 * ������
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Initdata initdata = new Initdata();			//��ʼ������
		ArrayList<Integer> data = new ArrayList();
		CommonSortMethod cs = new CommonSortMethod();
		
        //ð���������
		data = initdata.InitArrayData();
		long time1 = System.currentTimeMillis();
		cs.bubbleSort(data);
		System.out.println("BubbleSort:"+(System.currentTimeMillis()-time1)/1000f+"s");
		
		//ֱ�Ӳ����������
		data = initdata.InitArrayData();
		long time2 = System.currentTimeMillis();
		cs.insertSort(data);
		System.out.println("InsertSort:"+(System.currentTimeMillis()-time2)/1000f+"s");
		
		//ϣ���������
		data = initdata.InitArrayData();
		long time3 = System.currentTimeMillis();
		cs.shellSort(data);
		System.out.println("ShellSort:"+(System.currentTimeMillis()-time3)/1000f+"s");
		
		//ϣ���������
		data = initdata.InitArrayData();
		long time4 = System.currentTimeMillis();
		cs.selectSort(data);
		System.out.println("selectSort:"+(System.currentTimeMillis()-time4)/1000f+"s");
		
        //�����������
		data = initdata.InitArrayData();
		long time5 = System.currentTimeMillis();
		cs.quickSort(data,0,data.size()-1);
		System.out.println("QuickSort:"+(System.currentTimeMillis()-time5
				)/1000f+"s");
	}

}
