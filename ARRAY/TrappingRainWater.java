// Given an array arr[] with non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int res = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];

                }
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1, 2, 1, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(obj.trap(height));
    }
}

// The time complexity of the code is O(n) due to a single traversal of the
// height array, and the space complexity is O(1) as it uses a constant amount
// of extra space.