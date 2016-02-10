package practice;

public class QuickSort {

	private int[] a;//array to be sorted 
	private int len;//length of the input array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {6,5,4,3,2,1,8,7,9};
		new QuickSort().sort(input);
		for(int i : input){
			System.out.println(i);
		}
	}

	public void sort(int[] a){
		if(a == null || a.length == 0) return;
		this.a = a;//initial the array as input array
		this.len = a.length;
		quickSort(0, len - 1);
	}
	private void quickSort(int low, int high){
		//if(low == high) return;
		//I define the pivot as the median node
		int mid = low + (high - low) / 2;
		int i = low;
		int j = high;
		int pivot = a[mid];
		while(i <= j){
			while(a[i] < pivot){
				i++;
			}
			while(a[j] > pivot){
				j--;
			}
			if(i <= j){
				swap(i, j);
				i++; 
				j--;
			}
		}
		if(j > low){
			quickSort(low, j);
		}
		if(i < high){
			quickSort(i, high);
		}
	}
	private void swap(int index1, int index2){
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
}
