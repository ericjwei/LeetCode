package com.ericjwei.algorithms;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TwoSum t = new TwoSum();
        int[] nums = {1,2,3,4,5,6,7};
        int target = 13;
        int[] r = t.twoSum(nums, target);
        for (int i : r) {
            System.out.println(i);
        }
    }
}