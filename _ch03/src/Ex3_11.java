class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}
}

//Math.round : 반올림
//
//-소숫점 첫번째 자리에서 반올림한 정수를 반환
//
//
//% : 나머지 연산자
//
//-오른쪽 피연산자로 나누고 남은 나머지를 반환
//
//-나누는 피연산자는 0이 아닌 정수만 허용
//
//-부호는 무시된다(8이나 -8이나 같다)