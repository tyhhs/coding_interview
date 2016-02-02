package union;

import java.util.Scanner;

public class UnlockPhone {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int l = reader.nextInt();
		int r = reader.nextInt();
		int m = reader.nextInt();
		//check validation
		int num = 1;
		for(int i = 1; i < m; i++){
			num += 1<<i;
		}
		if(num < l || num > r){
			System.out.println(-1);
		}
		//in the range, and we get the min
		int count = 0;
		while(num<r){//get max
			if(numberOfOne(num)==m){
				count++;
			}
			num++;
		}
		System.out.println(count);
	}
	public static int numberOfOne(int num){
		int count = 0;
		while(num != 0){
			if((num&1) == 1){
				count++;
			}
			num = num>>1;
		}
		return count;
		
	}
}
