package stringprograms;

public class PalindromeIgnoringSpacesAndPunctuation {
     public static void main(String[] args) {
		String input="A man,a plan,a canal,Panama";
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		String cleanedStr=str.replaceFirst("[^a-zA-Z0-9]","").toLowerCase();
		cleanedStr=cleanedStr.replaceAll(" ","");
		cleanedStr=cleanedStr.replaceAll(",","");
		System.out.println(cleanedStr);
		String reverseStr=new StringBuilder(cleanedStr).reverse().toString();
		return cleanedStr.equals(reverseStr);
	
	}
}
