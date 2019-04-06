import java.util.Scanner;

public class Find{

	public static void main(String args[]){

		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("몇번 찾으시겠습니까?");
		num = in.nextInt();

		for(int i =0; i<num; i++){
			input();
		}
		in.close();

	}

	public static void input(){
		Scanner in = new Scanner(System.in);
		int A ;
		int B ;
		int i =0, num;
		int save = 1;

		System.out.print("숫자 2개 입력 : ");
		A = in.nextInt();
		B = in.nextInt();
			
		i = 2;
		while(i<A || i<B){
			if((A%i) == 0 && (B%i) == 0){
				A = A/i;		//A를 i로 나눈 몫을 A에 다시 저장
				
				B = B/i;		//B를 i로 나눈 몫을 B에 다시 저장
				
				save *= i;		//save에 i(공약수)를 곱함
			}else{			//i가 여러번 사용되는 경우가 있으니(예: 공약수가 4인 경우, 2*2) i를 다 뽑아내야 하므로
				i++;		//i를 다 뽑아낸 경우 다음 i로 진행
			}
		}
		save *= A * B;			//더이상 공약수를 갖지 않는 경우 A와B의 몫을 공약수(save)에 곱해주어야 하므로, A와 B를 곱해준다.
		System.out.println(save);
	}
}