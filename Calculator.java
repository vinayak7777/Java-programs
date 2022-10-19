import java.util.*;
class Calculator
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter two numbers:");
int n1=s.nextInt();
int n2=s.nextInt();
System.out.println("Enter an operator");
char op=s.next().charAt(0);
switch(op)
{
	case '+':int sum=n1+n2;
				System.out.println("Result: "+sum);
				break;
	case '-': int sub=n1-n2;
				System.out.println("Result: "+sub);
				break;
	case '*': int mul=n1*n2;
				System.out.println("Result: "+mul);
				break;
	case '/': int div=n1/n2;
				System.out.println("Result: "+div);
				break;
	default:    System.out.println("Invalid operator");
				break;
}


}
}
