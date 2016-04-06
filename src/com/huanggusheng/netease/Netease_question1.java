package com.huanggusheng.netease;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.huanggusheng.leqee.Initdata;

/**
 * С�׾���������������Ϸ.��һ��,������һ�������������Ϸ,���Ľ�ɫ�ĳ�ʼ����ֵΪ a.�ڽ�������һ��ʱ����,
 * ��������������n������,ÿ������ķ�����Ϊb1,b2,b3...bn. ��������Ĺ��������biС�ڵ���С�׵ĵ�ǰ
 * ����ֵc,��ô���������ɴ�ܹ���,�� ��ʹ���Լ�������ֵ����bi;���bi����c,����Ҳ�ܴ�ܹ���,����������ֵ
 * ֻ������bi ��c�����Լ��.��ô��������,��һϵ�еĶ�����,С�׵���������ֵΪ����?

 * ��������:
 * ����ÿ������,��һ������������n(1��n<100000)��ʾ�����������a��ʾС�׵ĳ�ʼ����ֵ.
 * �ڶ���n������,b1,b2...bn(1��bi��n)��ʾÿ������ķ�����

 * �������:
 * ����ÿ������,���һ��.ÿ�н�����һ������,��ʾС�׵���������ֵ

  * ��������:
 * 3 50
 * 50 105 200
 * 5 20
 * 30 20 15 40 100

 * �������:

 * 110
 * 205
 * @author Huang
 *
 */
public class Netease_question1 {
	
	private int monsterCount ;
	private int heroInitialAbility ;
	private int[] monsterDefence ;
	
	/*
	 * ��ʼ������
	 */
	public void initData(){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Monster count and hero initial ability:  ");
		monsterCount = sc1.nextInt();
		heroInitialAbility = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Every monster defence:  ");
		monsterDefence = new int[monsterCount];
		for(int i = 0 ;i < monsterDefence.length ; i++){
			monsterDefence[i] = sc2.nextInt();
		}
		System.out.println(Arrays.toString(monsterDefence));
	}
	
	/*
	 * ������
	 */
	public void getResult(){
		for(int n = 0; n < monsterCount ; n ++){
			if(heroInitialAbility >= monsterDefence[n]){
				//��������Ĺ��������biС�ڵ���С�׵ĵ�ǰ����ֵc,��ô���������ɴ�ܹ���,�� ��ʹ���Լ�������ֵ����bi
				heroInitialAbility = heroInitialAbility + monsterDefence[n];
			}else {
				//���bi����c,����Ҳ�ܴ�ܹ���,����������ֵ ֻ������bi ��c�����Լ��
				heroInitialAbility += getCommonisor(heroInitialAbility, monsterDefence[n]);
			}
		}
		System.out.println(heroInitialAbility);
	}
	 
	/*
	 * �����Լ��
	 * ŷ����¶��� :�� a=b��r+q ��gcd(a, b) = gcd(b, q).
	 */
	public static int getCommonisor(int a , int b){
		if(b == 0) return a;
        else  return getCommonisor(b, a%b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Netease_question1 nq = new Netease_question1();
		nq.initData();
		nq.getResult();
	}
}
