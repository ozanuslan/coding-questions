func maxArea(height []int) int {
    if len(height) < 2 {
        return 0
    }

    l, r := 0, len(height)-1
    maxArea := 0
    for l < r {
        w := r-l
        h := min(height[l], height[r])
        maxArea = max(maxArea, w * h)

        if height[l] > height[r] {
            r--
        } else {
            l++
        }
    }

    return maxArea
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
func maxArea(height []int) int {
    if len(height) < 2 {
        return 0
    }

    l, r := 0, len(height)-1
    maxArea := 0
    for l < r {
        w := r-l
        h := min(height[l], height[r])
        maxArea = max(maxArea, w * h)

        if height[l] > height[r] {
            r--
        } else {
            l++
        }
    }

    return maxArea
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
