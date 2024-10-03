package Sorting;

public class InsertionSort {
    public static void insertSort(int num[]) {
        int len = num.length;
        for (int i = 1; i < len; i++) {
            int curr = num[i];
            int prev = i - 1;
            // finding out the currect pos to insert
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            // insertion
            num[prev + 1] = curr;

        }
    }

    public static void printSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
public static void main(String[] args) {
    int num[] = { 4, 5, 1, 3, 2 };
        insertSort(num);
        printSort(num);
}

}
