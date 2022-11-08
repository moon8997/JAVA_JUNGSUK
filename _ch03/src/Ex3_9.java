class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   
		int b = 2_000_000;    // 2,000,000   

		long c = a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}

//사칙연산자, 산술변환 
//1)두 피연자의 타입을 같게  일치 시킨다. ( 두 피연자의 크기가 큰 것으로 일치시킴)
//2)피연산자의 타입이 int  보다 작은 타임은 int 변환( byte, char, shuot)