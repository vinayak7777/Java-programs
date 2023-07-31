//Find GCD of two numbers
import java.util.Scanner;
class GCD{
	public static void main(String[] args){
		
		int gcd=0;
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		for(int i=1;i<=x && i<=y;i++){
			if((x%i==0) && (y%i==0)){
				gcd=i;
			}
		}
		
		System.out.println(gcd);
		
	}
}
		
			
