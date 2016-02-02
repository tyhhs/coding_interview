package union;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MilitaryQueue {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int lines = reader.nextInt();
		for(int i = 0; i < lines; i++){
			int n = reader.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int j = 1; j <= n; j++){
				list.add(j);
			}
			int flag = 2;
			while(list.size() > 3){
				if(flag == 2){
					int k = 1;
					while(k < list.size()){
						list.remove(k);
						k++;
					}
					flag = 3;
				}
				else{
					int k = 2;
					while(k < list.size()){
						list.remove(k);
						k += 2;
					}
					flag = 2;
				}
			}
			for(int num : list){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
