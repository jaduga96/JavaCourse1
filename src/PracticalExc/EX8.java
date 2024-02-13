package PracticalExc;

import java.util.Arrays;

public class EX8 {
    int[] array;

    public EX8(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int[] evenArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[i] = array[i];
            }
        }
        return refactorArray(evenArray);
    }

    public int[] odd() {
        int[] oddArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[i] = array[i];
            }
        }
        return refactorArray(oddArray);
    }


    public int[] refactorArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) count++;
        }
        int[] newArray = new int[count];
        int jCount = 0;
        int j=0;
        for (int i = 0; i < newArray.length; i++) {
            for (j = jCount; j < array.length;) {
                if (array[j] != 0) {
                    newArray[i] = array[j];
                    jCount = j + 1;
                    break;
                } else jCount++;
                j=jCount;
            }
        }
        return newArray;
    }

}
