import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Basics {
    public void printNumber() {
        int i = 1;
        while (i <= 255) {
            System.out.println(i);
            i++;
        }
    }


    public void printOdd() {
        for (int i = 1; i <= 255; i = i + 2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public int getMaximum(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public int getAverage(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return sum / myArray.length;
    }

    public void createArr() {
        List<Integer> myArray = new ArrayList<>();
        for (int i = 1; i <= 255; i = i + 2) {
            myArray.add(i);
            System.out.println(myArray);
        }

    }

    public int getArrayNum(int[] myArray, int num) {
        int count = 0;
        int max = num;

        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
                count++;
            }
        }
        return count;
    }

    public void multiplyArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] * myArray[i];
            System.out.println(myArray[i]);
        }

    }

    public void eliminateNegative(@NotNull int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = 0;
            }
            System.out.println(myArray[i]);
        }

    }

    public void getMinMaxAvg(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            } else if (arr[i] < min) {
                min = arr[i];

            }
            sum = sum + arr[i] / arr.length;


        }
        System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, sum));

    }

    public int[] shiftNumbers(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;

        return nums;
    }


}
