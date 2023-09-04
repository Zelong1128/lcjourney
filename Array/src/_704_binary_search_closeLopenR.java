public class _704_binary_search_closeLopenR {
    // 左闭右开的二分查找
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length - 1])    return -1;
        // 左闭右开，右边应该是取不到的地方，取数组长度
        int l = 0, r = nums.length, mid = l + r >> 1;
        while(l < r){
            mid = l + r >> 1;
            if(nums[mid] == target) return mid;
                // 右开是取不到的，所以应该把右边放到中间
            else if(nums[mid] > target) r = mid;
            else l = mid + 1;
        }
        return -1;
    }
}
