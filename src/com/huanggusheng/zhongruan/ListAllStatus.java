package com.huanggusheng.zhongruan;

/**
 * 2016春季 中软笔试编程题目：
 * 两队进行对抗比赛，每队5人，甲队A,B，C,D,E，乙队J,K,L,M,N
 * A不能和J比赛，M不能和D，E比赛，请列出所有可能的情况。
 * @author Huang
 *
 */
public class ListAllStatus {

	public static void main(String args[]){
		char[] A = {'A','B','C','D','E'};
		char[] B = {'J','K','L','M','N'};
		//遍历所有情况
		int i = 0;
		int j,k,l,m,n;
		for(j = 0; j <= 4;j++){
			if(j == 0) continue;
			
			for(k = 0; k <= 4;k++){
				if(k == j) continue;
				
				for(l = 0; l <= 4;l++){
					if(l == k || l == j) continue;
					
					for(m = 0; m <= 4;m++){
						if(m == l || m == 3 || m ==j || m == k) continue;
						
						for(n = 0; n <= 4;n++){
							if(n == m || n == j || n == l || n == k || n == 3) continue;
							i++;
							System.out.println("比赛对阵名单"+i);
							System.out.println(A[0]+"  VS  "+B[j]);
							System.out.println(A[1]+"  VS  "+B[k]);
							System.out.println(A[2]+"  VS  "+B[l]);
							System.out.println(A[3]+"  VS  "+B[m]);
							System.out.println(A[4]+"  VS  "+B[n]);
						}
					}
				}
			}
		}
	}
}
