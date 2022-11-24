public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// 괄혼 안의 내용을 5번 반복한다.
		
		// 1. 1~10 사이의 난수를 20개 출력하시오.
		// 2. -5~5 사이의 난수를 20개 출력하시오.
		for (int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); // 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); // 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); // 0 <= x < 10, 0~9
//			System.out.println((int)(Math.random()*10)+1); // 1 <= x < 11, 1~10 // 1
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6, -5~5 // 2
		}
	}

}

//임의의 정수(난수) 만들기
//
//Math.random()
//-0.0과 1.0 사이의 임의 double값을 반환
//0.0 <= Math.random < 1.0 (0은 포함, 1은 포함x)
//
//-1부터 6까지의 난수를 구하고 싶을 경우(주사위)
//① 각 변에 *6을 곱함
//0.0*6 <= Math.random()*6 < 1.0*6
//
//② 각 변을 int형으로 변환
//(int)0.0 <= (int)(Math.random()*6) < (int)6.0
//
//③각 변에 1을 더한다
//0+1 <= (int)(Math.random()*6)+1 < 6+1
//→ 1 <= (int)(Math.random()*6)+1 < 7
//→ 1~6
//
//*개별값의 갯수