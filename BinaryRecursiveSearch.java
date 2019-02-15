
public class BinaryRecursiveSearch implements Practice03Search{
	
	@Override
	public String searchName() {
		return "binaryrecursive";
	}

	@Override
	public int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		else if(arr[mid] < target) {
			search(arr, target,mid + 1, end);
		}
		
		else if (arr[mid] > target) {
			end = mid - 1;
			search(arr, target, mid + 1, end);
		}
		return -1;
	}
	
	public int search(int[] arr, int target, int start, int end) {
			
			int mid = (start+end)/2;
			if(start > end) {
				return -1;
			}
			if(arr[mid] == target) {
				return mid;
			}
			
			else if(arr[mid] < target) {
				search(arr, target,mid + 1, end);
			}
			
			else if (arr[mid] > target) {
				end = mid - 1;
				search(arr, target, mid + 1, end);
			}
			return -1;

		}

}
