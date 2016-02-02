package didi;

import java.util.Scanner;

public class nOutOfMTrue {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int count = 0;
		while(reader.hasNext()){
			boolean b = reader.nextBoolean();
			if(b){
				if(++count > n){
					System.out.println(false);;
					return;
				}
			}
		}
		if (count == n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
