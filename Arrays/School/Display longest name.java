import java.util.Scanner;
class Solution {
    public static String longest(String names[], int n) {
        int size = names[0].length();
        int ind = 0;
        for(int i = 1; i < n; i++) {
            if(names[i].length() > size) {
                size = names[i].length();
                ind = i;
            }
        }
        return names[ind];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); //To Avoid Scanner Error
        String arr[] = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String ans = longest(arr, n);
        System.out.println(ans);
    }
}
