import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {		
			System.out.println("몇 단 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int[] result = Gugudan.calculate(num);
			Gugudan.print(result);
		}
}
