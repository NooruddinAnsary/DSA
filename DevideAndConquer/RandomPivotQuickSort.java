package DevideAndConquer;

public class RandomPivotQuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pi = partition(arr, si, ei);
        quickSort(arr, si, pi-1); //left
        quickSort(arr, pi+1, ei); // right
    }
    public static int partition(int arr[], int si, int ei){

        //Random pivot
        int random =(int)(Math.random()*(ei-si+1))+si;
        //move pivot to end
        int temp1 = arr[random];
            arr[random] = arr[ei];
            arr[ei] = temp1;


        //return ei;
        int pivot = arr[ei];
        int i = si - 1; //to make place for element smaller then pivot

        for (int j = si; j < ei; j++) {
            if(pivot >= arr[j]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i] = temp;
        return i;
        
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
   
        int arr[] = {6,3,9,5,2,1,8};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
