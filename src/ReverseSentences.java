
public class ReverseSentences {

	public static void main(String[] args) {
		String s = "I live in India";
		String[] split = s.split(" ");
		String result = "";
		System.out.println("length of string "+split.length);
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result);
		System.out.println(result.trim());
		}
}
                                                                