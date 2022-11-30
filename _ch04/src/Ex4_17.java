// 2의 배수 건너뛰기
public class Ex4_17 {

	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0)
				continue; // 자신이 포함된 반복문의 끝으로 이동(특정 조건시 반복을 건너뛸 때 유용)
			System.out.println(i);
		}
	}

}
