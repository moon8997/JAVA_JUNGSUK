import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		System.out.print("0~9 중 정수를 적어주세요. >> ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); 

		if(input==0) {
			System.out.println("0을 입력하였습니다.");	
		} else { 
			System.out.println("0이 아닌 다른 수를 입력하였습니다.");
		}
	}

}
