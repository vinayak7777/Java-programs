import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial:");
		int num=s.nextInt();
		int answer=fact(num);
		System.out.println(answer);
		
	}
	static int fact(int n)
		{
			int output;
			if(n==1)
			return 1;
			else
			output=fact(n-1)*n;
			return output;
		}
}
