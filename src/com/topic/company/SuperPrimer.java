package com.topic.company;

import java.util.Scanner;
/**
 * ��������:p ^ q = n
 * �ж����������Ƿ�Ϊ����
 * @author elotoma
 *
 */
public class SuperPrimer {
	public static void main(String[] args) {
		 Scanner sin = new Scanner(System.in);
		 
		 long n =sin.nextLong(); 
		 
		 if(n < 3){
			 System.out.println("NA");
			 return;
		 }
		 
		 long p = 1;
		 for(int i = 2; i < n; i++) {
			 if(n % i == 0) {
				 p = i;
				 break;
			 }
		 }
		 int q = 0;
		 while(n % p == 0 && n > 0){
			 n = n / p;
			 q ++;
		 }
		 if(n != 1) {
			 System.out.println("NA");
			 return;
		 }
		 
		 System.out.println(p + " " + q);
	}
}
