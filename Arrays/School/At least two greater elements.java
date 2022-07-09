import java.util.Scanner;
import java.util.Arrays;
class Solution {
    static long[] findElements(long a[], long n) {
        // code here
        Arrays.sort(a);
        int ind = a.length-2;
        long ans[] = new long[ind];
        for(int i = 0; i < ind; i++) {
            ans[i] = a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int size = (int)n;
        long arr[] = new long[size];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans[] = findElements(arr, n);
        for(long a: ans) {
            System.out.print(a);
        }
    }
}
