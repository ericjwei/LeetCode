package com.ericjwei.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MainTest 
{
    @Test
    void twoSumTest() {
        TwoSum testTwoSum = new TwoSum();
        int[] nums = {1,2,3,4,5,6,7};
        int target = 13;
        int[] expected = {6, 7};
        for (int i : expected) {
            System.out.println(i);
        }
        assertArrayEquals(expected, testTwoSum.twoSum(nums, target), "Should return [6, 7]");
    }
}