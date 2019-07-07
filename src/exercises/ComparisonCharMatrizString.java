package com.java.exercises;

import java.util.Scanner;

public class ComparisonCharMatrizString {


	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Informe o tamanho da linha da matriz");
		int numLines = scanner.nextInt();
		
		System.out.println("Informe o tamanho da coluna da matriz");
		int numColumns = scanner.nextInt();
	
		System.out.println("Informe uma palavra a ser comparada");
		String word = scanner.next();
		
		int numberLettersSame = comparisonCharMatrizWithString(word,numLines,numColumns);
		
		System.out.println("Número de letras repetidas :"+numberLettersSame);
	}
	
	public static int comparisonCharMatrizWithString(String word,int numLines, int numColumns) {
		
		 int sameLetter = 0;
		
		char [][] matrizChars = new char[numLines][numColumns];
		
		System.out.println("Informe letra");
		for (int line = 0; line < numLines; line++) {
			for(int column = 0; column < numColumns;column++) {

			
				matrizChars[line][column] = scanner.next().charAt(0);
				char letter = matrizChars[line][column];
				 sameLetter+= comparisonCharWithString(letter, word);
	
				}
			
			}
			return sameLetter;
		}
	

	public static int comparisonCharWithString(char letter, String word) {
		
		for (Character letterOfWord : word.toCharArray()) {
				if(letterOfWord.equals(letter)) {
					return 1;
				} 
		
				;
		}		
		return 0;
		};
}
	


