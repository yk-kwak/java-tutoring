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
			try{                                                         	 //���� �̿��ǰ��Է� try-catch
				//System.out.print("������"+ranNum);		//������ �Է������� while������������ Ȯ���ϱ� ���� �ۼ�

				System.out.print("\n"+cnt+"��° �õ��Դϴ�.\n"+"�߻��� ���ڴ� : ");
				num = in.nextInt();

				if(ranNum ==num) {
					System.out.println(cnt +"ȸ���� ����!");
					break;
				}else if(ranNum>num){
					System.out.println("���亸�� ���� �� �Դϴ�.");
				}else if(ranNum<num){
					System.out.println("���亸�� ū �� �Դϴ�.");
				}
				cnt++;						//������ �Է��� ��쿡�� Ƚ���� ����
			}catch(Exception e){				
				System.out.println("\n���� �ܿ� �ٸ� ���ڸ� �Է��ϼ̽��ϴ�.\n���ڸ� �Է��� �ּ���.");
				//num = 1;
				//System.out.println("num="+num+"����"); //num�� 1�� �����ϴ��� ���ѷ����� �����µ�.. ������ ����
				in.nextLine(); //���ۿ� ���� "����" �޾��ֱ�� �ذ�

			}
		}
		if(cnt==6) {
			System.out.println("\n�ƽ��Ե� ������ 5�� �õ��� ������ ���ϼ̽��ϴ�.");
			System.out.println("������ "+ranNum+" �Դϴ�! ");
		}
	}
}