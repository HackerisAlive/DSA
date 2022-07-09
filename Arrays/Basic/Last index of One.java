import java.util.Scanner;
class Solution {
    static int lastIndex(String s) {
        // code here
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = lastIndex(str);
        System.out.println(ans);
    }
}