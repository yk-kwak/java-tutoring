import java.util.Scanner;

public class Find{

	public static void main(String args[]){

		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("��� ã���ðڽ��ϱ�?");
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

		System.out.print("���� 2�� �Է� : ");
		A = in.nextInt();
		B = in.nextInt();
			
		i = 2;
		while(i<A || i<B){
			if((A%i) == 0 && (B%i) == 0){
				A = A/i;		//A�� i�� ���� ���� A�� �ٽ� ����
				
				B = B/i;		//B�� i�� ���� ���� B�� �ٽ� ����
				
				save *= i;		//save�� i(�����)�� ����
			}else{			//i�� ������ ���Ǵ� ��찡 ������(��: ������� 4�� ���, 2*2) i�� �� �̾Ƴ��� �ϹǷ�
				i++;		//i�� �� �̾Ƴ� ��� ���� i�� ����
			}
		}
		save *= A * B;			//���̻� ������� ���� �ʴ� ��� A��B�� ���� �����(save)�� �����־�� �ϹǷ�, A�� B�� �����ش�.
		System.out.println(save);
	}
}