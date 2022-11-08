class Ex3_12 {
	public static void main(String args[]) { 
		int x = 10;
		int y = 8;

		System.out.printf("%d을 %d로 나누면 %n", x, y); 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y); 
	}
}

//% : 나머지 연산자
//
//-오른쪽 피연산자로 나누고 남은 나머지를 반환
//
//-나누는 피연산자는 0이 아닌 정수만 허용
//
//-부호는 무시된다(8이나 -8이나 같다)