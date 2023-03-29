<?php
class Solution {

    /**
     * @param Integer $n
     * @param Integer $time
     * @return Integer
     */
    function passThePillow($n, $time) {
        /*
        line = [1, 2, 3]
        time = 0 => 1
        time = 1 => 2
        time = 2 => 3
        time = 3 => 2
        time = 4 => 1
        time = 5 => 2
        time = 6 => 3
        time = 7 => 2
        time = 8 => 1
        */
        $totalBounces = $time;
        $bouncesForBoundaryHit = $n - 1;
        $timesHitBoundaries = intdiv($totalBounces, $bouncesForBoundaryHit);
        $isForwardFacing = $timesHitBoundaries % 2 == 0;
        $finalPositionRelative = $time % $bouncesForBoundaryHit;
        if ($isForwardFacing) {
            $finalPositionAbsolute = 1 + $finalPositionRelative;
        } else {
            $finalPositionAbsolute = $n - $finalPositionRelative;
        }
        return $finalPositionAbsolute;
    }
}
