
public class REveWTOlop {
	
	{
		int n = 1;
		 int c=fun(n);
		 }
		 public static int fun(int n)
		 {
		 if(n==101)
		 return 0;
		 else
		 {
		 System.out.print(n+" ");
		 return fun(n+1);
		 }
		 }
	
	
	public static void main(String[] args) {
		 REveWTOlop r1 = new REveWTOlop();
		 r1.fun(23);  //pass int value 
		
	}

}
