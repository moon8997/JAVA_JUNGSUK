import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
	//		case 12:	case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
	}

}

//switch문
//-처리해야하는 경우의 수가 많을 때 유용한 조건문
//
//-순서
//①조건식을 계산한다
//②조건식의 결과와 일치하는 case문으로 이동한다
//③이후의 문장들을 실행한다
//④break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다
//어느것도 일치하는 값이 없으면 default로 간다
//보통 default는 switch문의 맨 마지막에 있으므로 break를 생략 할 수 있다
//
//switch문의 제약조건
//①switch문의 조건식 결과는 정수 또는 문자열이어야 함
//②case문의 값은 정수 상수(문자 포함), 문자열만 가능하며 중복되면 안됨 (변수 안됨)