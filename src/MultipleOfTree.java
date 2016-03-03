import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MULTIPLENUM = 3;
		System.out.print("수를 입력하시오 : ");
		int enteredNumber = sc.nextInt();
		if(enteredNumber % MULTIPLENUM == 0){
			System.out.print(MULTIPLENUM+"의 배수입니다.");
		}
		else{
			System.out.print(MULTIPLENUM+"의 배수가 아닙니다.");
		}
	}

}
