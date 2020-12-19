import java.util.Arrays;

public class MaxMirror {
/*

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere
in the array, the same group appears in reverse order.
For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.
*/

  public static void main(String[] args) {
    MaxMirror maxMirrorObject = new MaxMirror();
    int[] array = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
    System.out.printf("\nThe int array %s gives " + maxMirrorObject.maxMirror(array) + " as result.\n",
        Arrays.toString(array));
  }

  public int maxMirror(int[] nums) {
    int count = 0;
    int max = 0;

    for (int i = 0; i < nums.length; i++) {
      count = 0;
      for (int j = nums.length - 1; i + count < nums.length && j > -1; j--) {
        if (nums[i + count] == nums[j]) {
          count++;
        } else {
          if (count > 0) {
            max = Math.max(count, max);
            j += count;
            count = 0;
          }
        }
      }
      max = Math.max(count, max);
    }
    return max;
  }
}
