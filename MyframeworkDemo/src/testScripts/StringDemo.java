package testScripts;

public class StringDemo {
	public static void main(String[] args) {
		String a = "        How are you ?      ";
		System.out.println("My original string = "+a);
		System.out.println("String after trimming ="+a.trim());
		System.out.println("String after replacing="+a.replaceAll("\\s","" ));
		
	}

}
