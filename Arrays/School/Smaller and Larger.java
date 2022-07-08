import java.util.Scanner;
class Solution {
    static int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int count1 = 0, count2 = 0;
        
        for(int i: arr){
            if(x >= i) count1++;
            if(x <= i) count2++;
        }
        
        return  new int [] {count1, count2};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans[] = getMoreAndLess(arr,x,n);
        for(int a: ans) {
            System.out.print(a);
        }
    }
}
