package com.huanggusheng.zhongruan;

/**
 * 2016���� ������Ա����Ŀ��
 * ���ӽ��жԿ�������ÿ��5�ˣ��׶�A,B��C,D,E���Ҷ�J,K,L,M,N
 * A���ܺ�J������M���ܺ�D��E���������г����п��ܵ������
 * @author Huang
 *
 */
public class ListAllStatus {

	public static void main(String args[]){
		char[] A = {'A','B','C','D','E'};
		char[] B = {'J','K','L','M','N'};
		//�����������
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
							System.out.println("������������"+i);
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
