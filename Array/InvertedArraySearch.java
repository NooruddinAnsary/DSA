package Array;

public class InvertedArraySearch {
    
    public static int search(int nums[]) {
        int end = nums.length-1;
        int start = 0;
        while(start<=end){
            int mid = (start + end)/2;

            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if(nums[start]<=nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    public static int getElement(int nums[], int left, int right, int key){
        
        int start=left;
        int end = right;

        while(start <= end){
            int mid =(start+end)/2;

            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){//right
                start = mid+1;
            }
            else{//left
                end = mid-1;
            }
        }
        return -1;
        
        
    }
    public static int invertedSearch(int nums[], int target) {
        int min = search(nums);

        if(nums[min] <=target && target <= nums[nums.length-1]){
            return getElement(nums, min, nums.length-1, target);
        }
        else{
            return getElement(nums, 0, min, target);
        }
        
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,9,0,1, 2};
        int target =0;
        int pos =invertedSearch(nums, target);
        System.out.println(pos);
        
    }
}
