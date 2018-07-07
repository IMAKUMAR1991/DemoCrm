import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		String rev="";
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str=scn.next();
		int len=str.length();
		System.out.println(len+"  length of string ");
		
		for(int i=len-1;i>=0;i--){
		rev=rev+str.charAt(i);
	     }
		System.out.println(rev);
		}
}
