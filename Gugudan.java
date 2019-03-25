import java.util.Scanner;

public class Gugudan{
	public static void main(String args[]){
		System.out.print("N 단을 출력합니다. (단, 1<=N<=9) N = ");
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
	
		for(int i = 1; i<10; i++){
			System.out.println(N +" * "+i +" = "+ N*i );
		}
	}
}