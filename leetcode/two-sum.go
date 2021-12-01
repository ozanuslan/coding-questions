func twoSum(nums []int, target int) []int {
	mem := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		complement := target - nums[i]
		val, ok := mem[complement]
		if ok {
			return []int{val, i}
		}
		mem[nums[i]] = i
	}

	return nil
}
