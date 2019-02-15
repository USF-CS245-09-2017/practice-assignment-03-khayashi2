

public class LinearSearch implements Practice03Search{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String searchName() {
		return "linearsearch";
	}

	@Override
	public int search(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
