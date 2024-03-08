
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        int max = nums.get(0);
        int min = nums.get(0);

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
    
        MaxMinusMin maxMinusMin = new MaxMinusMin();
        List<Integer> nums = List.of(3, 9, 1, 7, 5);

        int result = maxMinusMin.difference(nums);
        System.out.println("The difference between the max and min values: " + result);
       
    }
}
