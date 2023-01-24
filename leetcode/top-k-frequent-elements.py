class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_counts = collections.Counter(nums)
        sorted_keys = sorted(num_counts, key = lambda item: -num_counts[item])
        return sorted_keys[:k]
