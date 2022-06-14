package bigBangTheory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BingBangDeque joke = new BingBangDeque();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int count = sc.nextInt();
		
		joke.bangDequeue(count);

	}

}
