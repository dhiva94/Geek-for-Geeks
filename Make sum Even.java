class Solution {
    public static boolean makeEven(int N, int[] arr) {
        if ((N & 1) > 0) return false;
        int cnt_odd = 0, cnt_even = 0;
        for (int i = 0; i < N; i++) {
            if ((arr[i] & 1) > 0)
                cnt_odd++;
            else
                cnt_even++;
        }
        if ((cnt_odd & 1) > 0 || (cnt_even & 1) > 0) return false;
        return true;
    }
}
