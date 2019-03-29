import java.util.Random;
import java.util.Scanner;

public class FindNumGame{
	public static void main(String args[]){
		int ranNum;
		int num;
		int cnt=1;
		Random ranGen = new Random();
		ranNum = ranGen.nextInt(100)+1;
		Scanner in = new Scanner(System.in);
		
		while ( cnt <= 5 ){
			try{                                                         	 //문자 이외의것입력 try-catch
				//System.out.print("정답은"+ranNum);		//정답을 입력했을때 while빠져나가는지 확인하기 위해 작성

				System.out.print("\n"+cnt+"번째 시도입니다.\n"+"발생된 숫자는 : ");
				num = in.nextInt();

				if(ranNum ==num) {
					System.out.println(cnt +"회만에 정답!");
					break;
				}else if(ranNum>num){
					System.out.println("정답보다 작은 수 입니다.");
				}else if(ranNum<num){
					System.out.println("정답보다 큰 수 입니다.");
				}
				cnt++;						//정수만 입력한 경우에만 횟수에 포함
			}catch(Exception e){				
				System.out.println("\n숫자 외에 다른 문자를 입력하셨습니다.\n숫자만 입력해 주세요.");
				//num = 1;
				//System.out.println("num="+num+"대입"); //num에 1을 대입하더라도 무한루프에 빠지는데.. 이유가 뭘까
				in.nextLine(); //버퍼에 쌓인 "엔터" 받아주기로 해결

			}
		}
		if(cnt==6) {
			System.out.println("\n아쉽게도 정답을 5번 시도에 맞추지 못하셨습니다.");
			System.out.println("정답은 "+ranNum+" 입니다! ");
		}
	}
}