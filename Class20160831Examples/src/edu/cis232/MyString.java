package edu.cis232;

public class MyString {
	private char[] characters;
	
	public MyString(String input){
		characters = new char[input.length()];
		for(int i = 0; i < input.length(); i++){
			characters[i] = input.charAt(i);
		}		
	}
	
	public char charAt(int index){
		return characters[index];
	}
	
	public int length(){
		return characters.length;
	}
	
}
