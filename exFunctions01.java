package Exercicios;

public class exFunctions01 {

	public static void main(String[] args) {
		
		String original = "ABCD abcd ABCD 1234 !@#$  ";
		
		String ex01 = original.toLowerCase();
		String ex02 = original.toUpperCase();
		String ex03 = original.trim();
		String ex04 = original.substring(4);
		String ex05 = original.substring(10, 19);
		String ex06 = original.replace('A', 'x');
		String ex07 = original.replace("ABCD", "xxxx");
		int index01 = original.indexOf("A");
		int index02 = original.lastIndexOf("A");
		
		System.out.printf("Original: %s-%n%n", original);	
		System.out.printf("toLowerCase: %s-%n%n", ex01);
		System.out.printf("toUpperCase: %s-%n%n", ex02);
		System.out.printf("trim: %s-%n%n", ex03);
		System.out.printf("substring(4): %s-%n%n", ex04);
		System.out.printf("substring(10, 19): %s-%n%n", ex05);		
		System.out.printf("replace('A', 'x'): %s-%n%n", ex06);		
		System.out.printf("replace('ABCD', 'xxxx' ): %s-%n%n", ex07);
		System.out.printf("index('A'): %s%n%n", index01);
		System.out.printf("lastIndex('A'): %s%n%n", index02);
	}

}