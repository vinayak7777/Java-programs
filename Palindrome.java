import java.util.*;
public class Palindrome {
	
	public static void main (String[] args) {
		boolean res=true;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a string to check whether it is a palindrome:");
		String s1=s.nextLine();
		int l=s1.length();
		for(int i=0;i<=l/2;i++)
		{
			if(s1.charAt(i)!=s1.charAt(l-1-i))
			{
				res=false;
				break;
			}
		}
		if(res==true)
		System.out.println(s1+" is a palindrome");
		else
		System.out.println(s1+" is not a palindrome");
	}
}

