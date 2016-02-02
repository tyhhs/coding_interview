package practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,4,3,2,1,8,7};
		a = new SelectionSort().selectionSort(a);
		for(int i : a){
			System.out.println(i);
		}
	}

	public int[] selectionSort(int[] a){
		int len = a.length;
		if(len == 0) return a;
		int minIndex;
		for(int i = 0; i < len - 1; i++){
			minIndex = i;
			for(int j = i + 1; j < len; j++){
				if(a[minIndex] > a[j]){
					minIndex = j;
				}
			}
			if(minIndex != i){
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
		return a;
	}
}
