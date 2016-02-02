package netease;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext()){
			double n = reader.nextDouble();
			System.out.println(String.format("%.2f", Math.abs(n)));
		}
	}

}
