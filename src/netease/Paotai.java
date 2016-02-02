package netease;

import java.util.Scanner;

public class Paotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int r = reader.nextInt();
		int[] location = new int[8];
		for(int i = 0;i<8;i++){
			location[i] = reader.nextInt();
		}
		int hurt = 0;
		for(int i=0;i<3;i++){
			double destance = Math.sqrt(Math.pow(location[6]-location[2*i], 2)+Math.pow(location[7]-location[2*i+1], 2));
			if(destance<r){
				hurt++;
			}
		}
		System.out.println(hurt+"X");
	}

}
