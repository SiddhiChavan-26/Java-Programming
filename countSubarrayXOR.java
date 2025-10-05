
import java.util.HashMap;

class countSubarrayXOR {
  
    static int subarrayXor(int[] arr, int k) {
        int res = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        int prefXOR = 0;

        for (int val : arr) {
         
            prefXOR ^= val;

            res += mp.getOrDefault(prefXOR ^ k, 0);

            if (prefXOR == k)
                res++;

            mp.put(prefXOR, mp.getOrDefault(prefXOR, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;

        System.out.println(subarrayXor(arr, k));
    }
}