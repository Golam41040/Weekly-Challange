package com.revature;

public class CheckDigit {
	public static boolean check(Long number){
		
		
		int k=0;
		for(Long i=number;i>0L;i=i/10) {
			
			k++;

		}
		
		int[] arrayofInt= new int[k];
		
		
		k=0;
		for(Long i=number;i>0L;i=i/10) {
			
			int j= (int) (i%10);
			arrayofInt[k]= j;
			k++;

		}
		
		
		int cDigit= arrayofInt[k-1];
		int sum =0;
		
		for(int i=1;i<k;i++) {
			if((i+1)%2==0) {
				
				int temp = arrayofInt[i]*2;
				
				if(temp>=10 ) {
					temp= (temp%10)+1;
					sum= sum+temp;
				}
				
				else {
					
					sum= sum+temp;
				}
			}
			else {
				
				sum= sum+ arrayofInt[i];
			}
		}
		System.out.println(sum);
		int cDigit2= sum%10;
		cDigit2 = 10-cDigit2;
		if(cDigit==cDigit2) {
			return true;
		}
	
		return false;
	}
}
