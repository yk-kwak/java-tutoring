import java.util.Scanner;

public class LuxuryHelloJavaExample{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("라인문자는? ");
		String str1 = in.nextLine();
		System.out.print("문자 길이는? ");
		int num1 = in.nextInt();
		/*
		System.out.print("라인문자는? ");
		String str2 = in.nextLine();
		System.out.print("문자 길이는? ");
		int num2 = in.nextInt();
		*/
		printCharacter(str1,num1);
		System.out.println("Hello, Java!");
		printCharacter(str1,num1);		
		//printCharacter(str2,num2);
	}


	static void printCharacter(String ch, int num){
		for(int i=0;i<num;i++) System.out.print(ch);
		System.out.println();
	}
}