package oop.example.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {


    @Test
    void getSTD_set1() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(140.1);
        nums.add(11.0);
        nums.add(12.0);
        nums.add(555.0);
        double sum = 0.0;
        for(double index : nums) {
            sum += index;
        }
        double average = sum / nums.size();
        double delta = 0.01;
        assertEquals(Solution36.getSTD(nums, average), 223.047709, delta);
    }

    @Test
    void getMax_set1() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(140.1);
        nums.add(11.0);
        nums.add(12.0);
        nums.add(555.0);
        double delta = 0.01;
        assertEquals(Solution36.getMax(nums), 555, delta);
    }

    @Test
    void getMin_set1() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(140.1);
        nums.add(11.0);
        nums.add(12.0);
        nums.add(555.0);
        double delta = 0.01;
        assertEquals(Solution36.getMin(nums), 11, delta);
    }

    @Test
    void getAverage_set1() {
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(140.1);
        nums.add(11.0);
        nums.add(12.0);
        nums.add(555.0);
        double delta = 0.01;
        assertEquals(Solution36.getAverage(nums), 179.525, delta);
    }
}