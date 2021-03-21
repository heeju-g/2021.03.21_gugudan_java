import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// 반복실행하되, 잘못된 입력값을 받으면 출력하지 않고 다시 입력값을 받도록 할 수 없을까?
		//-> while(true)와 if절을 사용하면 되겠네(break).00을 입력하면 프로그램 중지하도록 하자.continue로
		while (true) {
			System.out.println("몇 단 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if(num > 9 ) {
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
				continue;
			}else if(num == 00) {
				System.out.println("프로그램 중지");
				break;
			}
			int[] result = Gugudan.calculate(num);
			Gugudan.print(result);
			
		}

	}
}
