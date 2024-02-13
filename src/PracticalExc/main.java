package PracticalExc;

import PracticalExc.EX9.ToLine;
import PracticalExc.EX9.ToTable;

import java.util.Arrays;

import static PracticalExc.EX1.*;
import static PracticalExc.EX2.sound;

public class main {
    public static void main(String[] args) {
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        System.out.println(Arrays.toString(arr));

    }
}
