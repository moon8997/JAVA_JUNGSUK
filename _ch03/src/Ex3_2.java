
public class Ex3_2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++; // 후위형
		System.out.println("j=i++; 실행후, i=" + i +", j=" + j);
		
		i=5;	// 결과를 비교하기위해 초기값으로 변경
		j=0;

		j = ++i; // 전위형
		System.out.println("j=++i; 실행후, i=" + i +", j=" + j);
	}

}
