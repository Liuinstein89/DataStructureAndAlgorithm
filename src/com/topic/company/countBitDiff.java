package com.topic.company;

public class countBitDiff {
	/**
	 * ��Ŀ����:
		��������10���ˣ�һ�ֶ������ƣ�һ�ֲ�����
		��ô��֪������int32����m��n�Ķ����Ʊ��, �ж��ٸ�λ(bit)��ͬô�� 
		
	      ��������:
		1999 2299
	      �������:
		7
	      ֪ʶ�㣺
	      1. ���λ����
	      2. ����һ�������ж������ַ����� ��1�� �ĸ����㷨
	 * @param args
	 */
	public static void main(String[] args) {
		countBitDiff aTest = new countBitDiff();
		System.out.println(aTest.countBitDiffs(1999, 2299));
	}
	
	public int countBitDiffs(int m, int n) {
		System.out.println("/n --------------------");
		System.out.println("m's binary string:   " + Integer.toBinaryString(m));
		System.out.println("n's binary string:  " + Integer.toBinaryString(n));
		int res = m ^ n;
        
		System.out.println("res's binary string:" + Integer.toBinaryString(res));
		System.out.println("--------------------");
		
		int count = 0;
        for(int i = 0; i < 32 && res!= 0; i++) {
        	// count += res % 2;
            // res /= 2;
        	
        	/* ������ ��ȥres���ұ�λ�� 1   
        	 * �磺������n = ...xxx(1)00...  ��������λΪ���ұߵ�1�� 
			 * ���ڣ�n-1 ����߸�mλ�϶����ֲ���,��λ����� ��Ϊ 0 , ��kλ��ȷ��
			 * ���� n-1 = ...xxx(0)xx... 
			 * ���ԣ� n & n-1 = ...xxx(0)00..., ���ұߵ�1������Ϊ0���ﵽĿ��
			 */
        	count ++ ;
        	res &= (res - 1);  
        }
        
        return count;
    }
}
