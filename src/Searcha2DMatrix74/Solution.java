package Searcha2DMatrix74;

/*
 * [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
 */
public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix.length == 0 || matrix[0].length == 0 || matrix == null)
			return false;
		
		int row = matrix.length;
		int colum = matrix[0].length;
		
		int low = 0;
		int high =row*colum -1;
		
		while(low<=high) {
			int mid = (low+high)/2;  //high = 11 mid = 5
			int midVal = matrix[mid/colum][mid%colum];
			
			if(midVal == target) {
				return true;
			}else if(midVal < target) {
				low = mid +1;
				
			}else {
				high = mid -1;
			}
			
			
			
			
		}
		
		
		
		
		
		return false;
	}
}
