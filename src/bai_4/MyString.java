package bai_4;

public class MyString {

	public static void main(String[] args) {
		
		char[] text = {'a','b','c','d'};
		String textRs = String.copyValueOf(text, 1, 2);
		String str1 = String.format("So luong %d cai", 100);
		
		MyArray arr = new MyArray();
		System.out.println(String.valueOf(arr));
		String str = "So luong " + 100 + " cai";//
		System.out.println(textRs);
		
		textRs = "abc";
		String textRs2 = new String("abc");
		System.out.println(textRs.equals("abc"));//return
		System.out.println(textRs.equals(textRs2));//return
		
		textRs.substring(1, 4);
		
		textRs.chars();
	}

}
