package union;

import java.util.Scanner;

public class compareColor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextLine().charAt(0)-'0';
		String c = reader.nextLine();
		char color = c.charAt(0);
		for(int i = 0; i < n; i++){
			String input = reader.nextLine();
			String[] cards = input.split(" ");
			if(cards[0].charAt(1) != cards[1].charAt(1)
					&& (cards[0].charAt(1) == color || cards[1].charAt(1) == color)){
				if(cards[0].charAt(1) == color){
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}
			}
			else{
				if(cards[0].charAt(0) > cards[1].charAt(0)){
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}
			}
		}
	}

}
