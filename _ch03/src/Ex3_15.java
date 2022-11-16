import java.util.*;  

class Ex3_15 {
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("ch값을 써주세요 >> ");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			System.out.printf("문자 ‘ch’가 숫자(‘0’~’9’)입니다");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf("문자 ‘ch’가 소문자 또는 대문자입니다 ");
		}
	} // main
}

// 조건식을 연결할 때 사용하는 연산자. 
//- ||(OR결합) : 피연산자 중 어느 한쪽이 true면 true. 
//A또는 B
//- &&(AND결합) : 피연산자 양쪽 모두가 true여야 true.  
//~고, A 그리고 B
//- 한 식에 ||와 &&가 함께 있으면 어느걸 먼저 계산되게 할건지 괄호로 묶는게 좋다.