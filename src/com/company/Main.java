package com.company;

public class Main {

    public static int interpolPoisk(int[] znach, int element){
        int firstindex = 0;
        int lastIndex = znach.length-1;
        while ((firstindex <= lastIndex) && (element>=znach[firstindex]) && (element<=znach[lastIndex])){

            int res = firstindex + (element-znach[firstindex])
                    * (lastIndex-firstindex) /
                    (znach[lastIndex]-znach[firstindex]);

            if (znach[res]==element){
                return res;
            }
            if (znach[res]<element){
                firstindex = res + 1;
            }
            else
                lastIndex = res -1;
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here

        int poisk = interpolPoisk(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},8);
        System.out.println("Index element is " + poisk);

    }

}
