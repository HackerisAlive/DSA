import java.util.Scanner;
class Solution {
    public static void swapKth(int arr[], int n, int k) {
        int temp = arr[k-1];
        arr[k-1] = arr[arr.length - k];
        arr[arr.length - k ] = temp;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        swapKth(arr, n, k);
        for(int a: arr) {
            System.out.print(a+" ");
        }
    }
}
