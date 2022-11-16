class Ex3_16 {
	public static void main(String[] args) { 
		boolean b = true; 
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
	  	System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<='z'));
	   System.out.printf("  'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
	} 
}

// 논리부정연산자
//- ! : true를 false로, false를 true로 바꿈
//- 단항연산자라 연산방향이 오른쪽 → 왼쪽