import java.util.Scanner;
class Solution {
    public static void segregateElements(int arr[], int n) {
        int ans[] = new int[n];
        int ind = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                ans[ind] = arr[i];
                ind++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                ans[ind] = arr[i];
                ind++;
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        segregateElements(arr, n);
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }
}