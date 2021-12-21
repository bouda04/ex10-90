import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter two sorted words");
		String word1 = in.next();
		String word2 = in.next();
		String result= "";
		int i=0, j=0;
		while (i<word1.length() && j < word2.length()) {
			if (word1.charAt(i) < word2.charAt(j))
				result += word1.charAt(i++);
			else
				result += word2.charAt(j++);	
		}
		if (i == word1.length() )
			result += word2.substring(j);
		if (j == word2.length() )
			result += word1.substring(i);
		
		System.out.println(result);
	}

}
