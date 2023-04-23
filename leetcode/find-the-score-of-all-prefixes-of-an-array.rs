use std::{cmp, ops::Add};

impl Solution {
    pub fn find_prefix_score(nums: Vec<i32>) -> Vec<i64> {
        let mut max_value_so_far: i64 = i64::MIN;
        let mut running_sum: i64 = 0;
        let mut conversion: Vec<i64> = vec![];

        for n in nums {
            let n64 = n as i64;
            max_value_so_far = cmp::max(n64, max_value_so_far);
            running_sum += n64.add(max_value_so_far);
            conversion.push(running_sum);
        }

        return conversion;
    }
}
