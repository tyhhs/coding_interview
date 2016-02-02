package baidu;

import java.util.Scanner;

public class charAppear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		/*String a = "ÄãºÃ°Ù¶È";
		System.out.println(a.substring(0,1));
		System.out.println(a.contains("Äã"));*/
		int length = b.length();
		for(int i = 0; i < length-1; i++){
			if(!a.contains(b.substring(i,i+1))){
				System.out.println("0");
				return;
			}
		}
		System.out.println("1");
	}

}
