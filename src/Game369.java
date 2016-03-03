

public class Game369 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=99; i++){
			if(i/10 > 0){
				if((i/10)%3 == 0) count++;
				if((i%10)%3 == 0 && (i%10) != 0) count++;
			}
			else{
				if(i%3 == 0 && i != 0) count++;
			}
			if(count > 0){
				System.out.print(i+" ");
				while(count > 0){
					System.out.print("짝");
					count--;
				}
				System.out.println();
			}
		}
	}
}
