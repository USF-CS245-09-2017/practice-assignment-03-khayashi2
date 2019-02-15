
public class BinaryIterativeSearch implements Practice03Search{
	
	@Override
	public String searchName() {
		return "binaryiterativesearch";
	}

	@Override
	public int search(int[] arr, int target) {
		int start = 0, end = arr.length - 1; 
        while (start <= end) { 
            int m = start + (end - start) / 2; 
   
            if (arr[m] == target) 
                return m; 
  
            if (arr[m] < target) 
            	start = m + 1; 

            else
            	end = m - 1; 
        } 

        return -1;
		
	}

}
