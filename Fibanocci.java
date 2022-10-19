import java.util.Scanner;
class Fibanocci
{
	public static void main(String[] args)
	{
	int t1=0,t2=1,t3;
	Scanner s=new Scanner(System.in);
	System.out.println("How many terms you want to have: ");
	int n=s.nextInt();
	System.out.print(t1+","+t2);
	for(int i=1;i<=(n-2);i++)
	{
		t3=t1+t2;
		System.out.print(","+t3);
		t1=t2;
		t2=t3;
	}
			
}
}
