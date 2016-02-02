package didi;

import java.util.Scanner;

public class LongestNumberSequence {

	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		while(reader.hasNext()){
			String s = reader.nextLine();
			int length = 0;//record the current length
			int value = 0;//record the current value of number sequence;
			StringBuilder sb = new StringBuilder();
			
			int maxLength = 0;//record maximum length 
			int maxValue = 0;//record maximum value
			String maxSequence = "";
			
			s = s + "a";//prevent we ignore the last number sequence
			
			for(char c : s.toCharArray()){
				if(c >= '0' && c <= '9'){
					sb.append(c);
					length++;
					value+=(c-'0');
				}
				else{
					if (maxLength != 0) {
						if (length != 0) {
							if (length > maxLength || (length == maxLength && value > maxValue)) {
								maxSequence = sb.toString();
								maxLength = length;
								maxValue = value;
							}
						}
					}
					else {
						if (length != 0) {
							maxSequence = sb.toString();
							maxLength = length;
							maxValue = value;
						}
					}
					length = 0;
					value = 0;
					sb = new StringBuilder();
				}
			}
			System.out.println(maxSequence);
		}
	}
}
