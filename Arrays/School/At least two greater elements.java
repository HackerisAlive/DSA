import java.util.Scanner;
import java.util.Arrays;
class Solution {
    static long[] findElements(long a[], long n) {
        // code here
        Arrays.sort(a);
        long ans[] = new long[(int)n-2];
        for(int i = 0; i < n-2; i++) {
            ans[i] = a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long arr[] = new long[(int)n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans[] = findElements(arr, n);
        for(long a: ans) {
            System.out.print(a);
        }
    }
}
