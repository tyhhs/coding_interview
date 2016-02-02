package netease;

import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext()){
			int n = reader.nextInt();
			int section = 0;
			int temp = 0;
			while(true){
				section++;
				if(n<=(temp=temp+section)){
					break;
				}

			}
			int endOfSection = 1;
			for(int i = 0; i < section-1; i++){
				endOfSection += i;
			}
			if(n==temp){
				System.out.println(endOfSection);
			}
			else {
				int max = endOfSection +1;
				System.out.println(max-temp+1+n);
			}
		}

	}

}
