import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		boolean continueGame = false;
		do{
			int max = 100;
			int min = 1;
			Random r = new Random();
			int k = r.nextInt(max) + min;
			Scanner sc = new Scanner(System.in);
			int myNum=0;
			int turn = 1;
			String answer;
			System.out.println("수를 결정하였습니다. 맞추어 보세요\n"+min+"-"+max);
			while(turn<=7){
				System.out.print(turn+">>");
				myNum=sc.nextInt();
				if(k>myNum){
					System.out.println("더 높게");
					min=myNum;
					System.out.printf("%d-%d\n",min,max);
					turn++;
				}
				else if(k<myNum){
					System.out.println("더 낮게");
					max=myNum;
					System.out.printf("%d-%d\n",min,max);
					turn++;
				}
				else{
					System.out.println("맞았습니다");
					break;
				}
			}
			System.out.print("다시하시겠습니다(y/n)>>");
			answer = sc.next();
			if(answer.equals("Y") || answer.equals("y")){
				continueGame = true;
			}
			else if(answer.equals("N") || answer.equals("n")){
				continueGame = false;
			}
		}while(continueGame);
	}
}
