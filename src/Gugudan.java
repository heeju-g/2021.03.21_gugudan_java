import java.util.Scanner;

public class Gugudan {
	
	//ctrl+alt 방향키 누르면 라인복사 가능

	/* 1. Scanner만 사용해서 그냥 구현해보기
	 * System.out.println("몇 단? : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(number*1);
		System.out.println(number*2);
		System.out.println(number*3);
		System.out.println(number*4);
		System.out.println(number*5);
		System.out.println(number*6);
		System.out.println(number*7);
		System.out.println(number*8);
		System.out.println(number*9);
	*/
	// 2. 조건문,반복문 사용해서 해보기. ->  잘못된 값 입력 시 자동으로 다시 입력값을 받도록 만들 수는 없을까?
	/*	System.out.println("몇 단 : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number <2) {
			System.out.println("잘못된 입력값");
			
		}else if(number > 9) {
			System.out.println("잘못된 입력값");
			
		}else {
			for( int i = 1; i < 10;i++) {
				System.out.println(number * i);
			}
		}
		
	*/
	//3. 배열사용해서 메소드(계산,출력) 만들고, GugudanMain 클래스를 만들어 main에서 메소드들 호출
	
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i =0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i =0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
