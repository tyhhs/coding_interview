package practice;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,4,3,2,1,8,7,9};
		a = new MergeSort().mergeSort(a, 0, a.length-1);
		for(int i : a){
			System.out.println(i);
		}
	}

	public int[] mergeSort(int[] a, int left, int right){
		if(left == right) return a;
		int mid = left + (right - left) / 2;
		a = mergeSort(a, left, mid);
		a = mergeSort(a, mid+1, right);
		return merge(a, left, mid, right);
	}
	private int[] merge(int[] a, int left, int mid, int right){
		int[] temp = new int[a.length];
		//copy range in a to temp
		for(int i = left; i <= right; i++){
			temp[i] = a[i];
		}
		int index = left;
		int index1 = left;
		int index2 = mid + 1;
		while(index1 <= mid && index2 <= right){
			if(temp[index1] < temp[index2]){
				a[index++] = temp[index1++];
			}
			else{
				a[index++] = temp[index2++];
			}
		}
		while(index1 <= mid){
			a[index++] = temp[index1++];
		}
		while(index2 <= right){
			a[index++] = temp[index2++];
		}
		return a;
	}
}
