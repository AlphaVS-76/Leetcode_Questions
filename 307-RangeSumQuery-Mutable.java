//Question Link - https://leetcode.com/problems/range-sum-query-mutable/

class NumArray {
    int n;
    int[] raw;
    NumArray parent;

    public NumArray(int[] nums) {
        n = nums.length;
        raw = nums;
        
        if (n > 1) {
            int[] parRaw = new int[(n+1)/2];
            for (int i=0 ; i<n ; i++) {
                parRaw[i/2] += nums[i];
            }
            
            parent = new NumArray(parRaw);
        }
    }

    public void update(int i, int val) {
        if (n > 1) {
            parent.update(i/2, parent.get(i/2) - raw[i]+val);
        }
        
        raw[i] = val;
    }

    public int get(int i) {
        return raw[i];
    }

    public int sumRange(int i, int j) {
        if (i > 0) {
            return sumRange(0, j) - sumRange(0, i-1);
        } 
        else if (j == 0) {
            return raw[0];
        } 
        else {
            int sum = parent.sumRange(0, j/2);
            
            if (j%2==0 && j+1<n) {
                sum -= raw[j+1];
            }
            
            return sum;
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
