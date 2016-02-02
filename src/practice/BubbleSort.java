package practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,4,3,2,1,8,7};
		a = new SelectionSort().selectionSort(a);
		for(int i : a){
			System.out.println(i);
		}
	}

	public int[] bubbleSort(int[] a){
		int len = a.length;
		for(int i = len - 1; i >= 0; i--){
			for(int j = 0; j <= i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = a[j];
				}
			}
		}
		return a;
	}
}
