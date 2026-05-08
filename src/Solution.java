class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder num = new StringBuilder();
        for (int n : nums) num.append(n);

        String[] arr = num.toString().split("0");
        int max =  0;
        for (String a : arr) {
            if (a.length() > max) max = a.length();
        }

        return max;
    }

}