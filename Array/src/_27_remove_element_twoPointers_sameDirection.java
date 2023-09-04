public class _27_remove_element_twoPointers_sameDirection {
    public int removeElement(int[] nums, int val) {
        // 慢指针，从0开始
        int slow = 0;
        // 快指针，从0开始，每一个都遍历
        for(int fast = 0; fast < nums.length; fast++)
            // 只有在快指针踩到合法数的时候才会让慢指针往前挪
            if(nums[fast] != val)
                nums[slow++] = nums[fast];
        // 每一次slow增加都是因为找到合法数，最后再挪一次刚好是长度
        return slow;
    }
}
