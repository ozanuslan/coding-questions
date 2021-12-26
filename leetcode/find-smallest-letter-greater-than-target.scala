object Solution {
    def nextGreatestLetter(letters: Array[Char], target: Char): Char = {
        // Problem statement is super weird
        // Why not tell if there are no larger characters than the target, the alphabet wraps around. The way it is stated at the problem statement makes me think that any character can wrap around so that the smallest character is always the answer. Whatever.
        letters.find(c => c.toInt > target.toInt).getOrElse(letters(0))
    }
}
