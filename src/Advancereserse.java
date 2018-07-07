
public class Advancereserse {
	public static void main(String[] args) {

		String s1="i love my india"; String rev = "";
		String token[]=s1.split(" ");
		for(int i=token.length-1; i>=0;i--)
		{
			rev+=(token[i]+" ");
		
			
		}
		System.out.println(rev);
	}
	}

