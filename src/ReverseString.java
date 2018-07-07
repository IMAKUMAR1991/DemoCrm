
public class ReverseString {

	public static void main(String[] args) {
		String s1="i love my india"; String rev="";
		String [] s2=s1.split(" ");
		for(int i=s2.length-1;i>=0;i--){
			rev+=(s2[i]+" ");
	}
		System.out.println(rev);
	}
}
