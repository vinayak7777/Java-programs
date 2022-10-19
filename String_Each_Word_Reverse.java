public class String_Each_Word_Reverse{  
public static void main(String args[]){  
String s1="hello guyz";  
System.out.println("Original: "+s1);
String[] arr=s1.split(" ");
System.out.print("Reversed: ");
for(int i=0;i<arr.length;i++)
{
char[] c=arr[i].toCharArray();
for(int j=(c.length-1);j>=0;j--)
{
	System.out.print(c[j]);
}
System.out.print(" ");

}

}  
}  
