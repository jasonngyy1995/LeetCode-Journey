// question link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {};
        for (int i=0; i < nums.length; i++)
        {     
            int tmp = nums[i];
            for (int j=0; j < nums.length; j++)
            {
                if (j == i)
                {
                    j++;
                } else {
                    int res = tmp + nums[j];
                    if (res == target)
                    {
                        int[] new_arr = {i, j};
                        result = new_arr;
                        break;
                    }
                } 
            } 
        }
        return result;
    }
}