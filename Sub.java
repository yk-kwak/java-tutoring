import java.util.Scanner;

public class Sub{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("두 정수 A와 B를 입력해 주세요.");
		//System.out.print("A = ");
		int A = input.nextInt();
		//System.out.print("B = ");
		System.out.print(" ");
		int B = input.nextInt();
		System.out.print(A - B);
		
	}
}