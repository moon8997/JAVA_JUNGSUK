
public class Ex4_11 {

	public static void main(String[] args) {
		int i;
		for(i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			if(i!=9)
				System.out.println();
		}

	}

}
