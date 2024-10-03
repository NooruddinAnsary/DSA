package DevideAndConquer;

public class InversionCount {

    public static int getInversions(int arr[], int start, int end){
        int inv =0;
        if(end>start){
        int mid = (start+end)/2;
        inv = getInversions(arr, start, mid);
        inv += getInversions(arr, mid+1, end);
        inv += merge(arr, start, mid+1, end);
        }
        return inv;
    }

    public static int merge(int arr[], int start, int mid, int end){
        int inv = 0;
        int i = start;
        int j = mid;
        int k = 0;
        int temp[] = new int[end-start+1];
        while ((i < mid) && (j <= end)) {
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                inv+= (mid-i);
            }
        }
        while (i<mid ){
            temp[k++] = arr[i++];
        }
        while(j<=end) {
            temp[k++] = arr[j++];
        }


        for (k = 0, i = start; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
        return inv;
    }

    public static void main(String args[]){
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion Count = "+getInversions(arr,0,arr.length-1));
        
    }
}
