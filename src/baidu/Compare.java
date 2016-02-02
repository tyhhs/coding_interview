package baidu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> res = new ArrayList<Integer>();
		int index[] = new int[13];
		for (int i = 0; i < 13; i++)
			index[i] = 1;
		for (int i = 1; i <= 12; i++) {
			for (int j = i; j >= 1; j--) {
				index[i] *= j;
			}
		}
		
		// get number
		int number = (Integer.parseInt(in.nextLine()));

		// get input string
		for (int i = 0; i < number; i++) {
			String line = in.nextLine();
			res.add(new Compare().getIndex(line, index));
		}
		for(int i:res){
			System.out.println(i);
		}
	}

	public int getIndex(String line, int[] index) {
		int sum = 0;
		for(int i=1;i<=12;i++){
            int k=0;
            for(int j=i+1;j<=12;j++){
                if(line.charAt(i-1)>line.charAt(j-1)) k++;
            }
            sum+=index[12-i]*k;
        }
		return sum+1;
	}
}
