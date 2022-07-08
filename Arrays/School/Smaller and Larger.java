import java.util.Scanner;
class Solution {
    public static int[] getMoreAndLess(int arr[], int x, int n) {
        int ans[] = new int[2];
        int low = 0;
        int high = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < x) {
                low++;
                ans[0] = low;
                ans[1] = high;
                System.out.println("low");
            }else if(arr[i] == x) {
                System.out.println("high");
                high = (n - i);
                ans[0] = ++low;
                ans[1] = high;
                break;
            }else {
                high = (n - i);
                ans[0] = low;
                ans[1] = high;
                break;
            }
        }
        return ans;
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