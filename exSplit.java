package Exercicios;

public class exSplit {

	public static void main(String[] args) {
		
		String word = "Suco de Umbu com Uva";
		
		String[] vect = word.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		
	}

}