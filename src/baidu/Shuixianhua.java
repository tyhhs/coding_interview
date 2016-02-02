package baidu;

import java.util.ArrayList;
import java.util.List;

public class Shuixianhua {

	public static void main(String[] args) {
		int m = 300;
		int n = 380;
		List<Integer> list = new Shuixianhua().findCount(m, n);
		for(int i:list){
			System.out.println(i);
		}
	}
	
	public List<Integer> findCount(int m, int n){
		List<Integer> list = new ArrayList<Integer>();
		if(m>n){
			return list;
		}
		for(int i = m; i <= n;i++){
			int curr = i;
			int hundred = curr/100;
			curr %= 100;
			int ten = curr/10;  
			int digit = curr%10;
			
			int temp = (int)(Math.pow(digit, 3)+ Math.pow(ten, 3)+Math.pow(hundred, 3));
			if(temp == i){
				list.add(i);
			}
		}
		return list;
	}

}
