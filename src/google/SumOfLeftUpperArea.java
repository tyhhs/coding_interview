package google;

public class SumOfLeftUpperArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] res = new SumOfLeftUpperArea().solution2(matrix);
		for(int[] row : res){
			for(int i : row){
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}

	public int[][] solution (int[][] matrix){
		if(matrix == null || matrix.length == 0) return null;
		int rowLen = matrix.length;
		int colLen = matrix.length;
		int[][] temp = new int[rowLen][colLen];
		int[][] res = new int[rowLen][colLen];
		for(int i = 0; i < colLen; i++){
			temp[i][0] = matrix[i][0];
		}
		for(int i = 0; i < rowLen; i++){
			for(int j = 1; j < colLen; j++){
				temp[i][j] = matrix[i][j] + temp[i][j-1];
			}
		}
		for(int i = 0; i < rowLen; i++){
			for(int j = 0; j < colLen; j++){
				res[i][j] = matrix[i][j] + (i==0?0:res[i-1][j]) + (j==0?0:temp[i][j-1]);
			}
		}
		return res;
	}
	
	public int[][] solution2(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return null;
		}
		int rowLen = matrix.length;
		int colLen = matrix.length;
		int[][] res = new int[rowLen][colLen];
		res[0][0] = matrix[0][0];
		for(int i = 1; i < rowLen; i++){
			res[i][0] = res[i-1][0] + matrix[i][0];
		}
		for(int i = 1; i < colLen; i++){
			res[0][i] = res[0][i-1] + matrix[0][i];
		}
		for(int i = 1; i < rowLen; i++){
			for(int j = 1; j < colLen; j++){
				res[i][j] = matrix[i][j] + res[i-1][j] + res[i][j-1] - res[i-1][j-1];
			}
		}
		return res;
	}
}
