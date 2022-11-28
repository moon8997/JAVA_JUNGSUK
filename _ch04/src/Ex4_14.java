// 각 자리수의 합

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. > ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);
		int num2 = num;
		
		// 10 으로 나머지 연선을 하면 마지막 자리를 얻는다.
		// System.out.println(num%10);
		
		// for문으로 구하기
		for(;num>0;num=num/10) {
//			System.out.println(num%10);
			sum += num%10;
		}
		
		System.out.println("각 자리수의 합 : "+sum);
		
		System.out.println("--------------------------");
		sum = 0; 

		// while 문으로 구하기
		while(num2!=0) {
			sum += num2%10;
			// System.out.printf("sum=%d num2=%d%n",sum,num2);
			num2 /= 10;
		}
		
		System.out.println("각 자리수의 합 : "+sum);
		
	}

}
