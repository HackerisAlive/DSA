import java.util.Scanner;
class Solution {
    public static int[] constructLowerArray(int arr[], int n) {
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = i; j < n; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
            }
            arr1[i] = count;
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = constructLowerArray(arr,n);
        for(int a: ans) {
            System.out.print(a+" ");
        }
    }
}