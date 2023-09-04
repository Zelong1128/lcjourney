public class _27_remove_element_twoPointers_oppoDirection {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        // 外层循环需要带上等号的原因：保证l==r的那里的元素也被判定了
        // 循环的判定就是可能性空间
        while (l <= r) {
            // 内层循环需要带上括号的原因：保证在l==r那里l会进行判定，从而用l代表长度
            // 左边找到不合法的数
            while (l <= r && nums[l] != val) l++;
            // 右边找到合法的数
            while (l <= r && nums[r] == val) r--;
            if (l < r) nums[l++] = nums[r--];
        }
        return l;
    }
}
