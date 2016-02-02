package union;

import java.util.Scanner;

public class PushUp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		int t = reader.nextInt();
		int num = 1;
		int gap = 1;
		int sum = 0;
		for(int i = 0; i < t; i ++){
			sum += num;
			for(int j = 0; j < n; j++){
				num += gap;
				num %= k;
				gap++;
			}
		}
		System.out.println(sum);
	}
}
