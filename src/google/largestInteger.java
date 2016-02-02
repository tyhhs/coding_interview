package google;

public class largestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 12511;
		System.out.println(new largestInteger().solution(X));
	}
	public int solution(int X) {
        // write your code in Java
		int max = Integer.MIN_VALUE;
		int power = 1;
		//duplicate from units digit to top digit
		int left;
		int right;
		int newNum;
		while(X / Math.pow(10, power) != 0){
			int multi = (int) Math.pow(10, power);
			left = X / (int) Math.pow(10, power -1);
			right = X % multi;
			newNum = left * multi + right;
			max = Math.max(max, newNum);
			power++;
		}
		return max;
    }

}
