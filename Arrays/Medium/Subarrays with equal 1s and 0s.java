import java.util.Scanner;
class Solution {
    public static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        int tcount = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int ocount = 0;
                int zcount = 0;
                for(int k = i; k <= j; k++) {
                    if(arr[k] == 1) {
                        ++ocount;
                        System.out.print("one"+" ");
                    }else{
                        ++zcount;
                        System.out.print("zero"+" ");
                    }
                }
                if(ocount == zcount && ocount != 0) {
                    tcount++;
                    System.out.print("found");
                }
                System.out.println("Next");
            }
        }
        return tcount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countSubarrWithEqualZeroAndOne(arr, n);
        System.out.println(ans);
    }
}