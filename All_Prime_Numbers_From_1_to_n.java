//Write a program to print the first n prime numbers.

import java.util.Scanner;
class All_Prime_Numbers_From_1_to_n{
	public static void main(String[] args){
		
		int temp=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want to find prime numbers");
		int num=scan.nextInt();
		for(int no=1;no<=num;no++){
			for(int i=2;i<=no-1;i++){
				
				if(no%i==0){
					temp=temp+1;
				}
			}
			
			if(temp==0){
				System.out.println(no);
			}
			
			else{
				temp=0;
			}
			
		}
		
	}
}
