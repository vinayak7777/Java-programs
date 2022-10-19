public class String_Reverse{  
public static void main(String args[]){  
String s1="hello guyz";  
System.out.println("Original: "+s1);
char[] arr=s1.toCharArray();
System.out.print("Reversed: ");
for (int i=(arr.length-1);i>=0;i--)
System.out.print(arr[i]);

}  
}  
