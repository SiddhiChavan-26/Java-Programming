import java.util.ArrayList;
import java.util.Arrays;

class twoSum_closestToTarget {

    static ArrayList<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        int left = 0, right = n - 1;

        while (left < right) {
            int currSum = arr[left] + arr[right];
            int currDiff = Math.abs(target - currSum);

            // check if this pair is closer than the closest
            // pair so far
            if (currDiff < minDiff) {
                minDiff = currDiff;
                res = new ArrayList<>(Arrays.asList(arr[left], arr[right]));
            }

            // if this pair has sum = target, return it immediately
            if (currSum == target)
                return new ArrayList<>(Arrays.asList(arr[left], arr[right]));

            // if this pair has less sum, move to greater values
            else if (currSum < target)
                left++;

            // if this pair has more sum, move to smaller values
            else
                right--;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;

        ArrayList<Integer> res = sumClosest(arr, target);
        if (!res.isEmpty())
            System.out.println(res.get(0) + " " + res.get(1));
    }
}