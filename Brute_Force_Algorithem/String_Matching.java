import java.io.*;
import java.util.Scanner;

class Bruteforce{
	//called function
	public static int bruteforce(String text,String tobematched){
		int length = text.length();//length of the text
		int plength = tobematched.length();//length of the pattern;

		//loop condition
		for(int i=0;i<length-plength;i++){
			//initialization of j
			int j=0;
			while((j < plength) && (text.charAt(i+j) == tobematched.charAt(j))){
				j++;
			}
			if(j == plength){
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args){
		Bruteforce obj = new Bruteforce();
		Scanner sc =  new Scanner(System.in);
		String text = "I Love Programming and I do Programming";
		String tobematched = "Programming";
		int position = obj.bruteforce(text,tobematched);
		int endindex = position+1;
		if(position == -1){
			System.out.println("Pattern is not matched in the text");
		}else{
			System.out.println("Found at position:" + (position+1));
			System.out.println("End at the position:" + (endindex + tobematched.length()));
		}
	}
}
