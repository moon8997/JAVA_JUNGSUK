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