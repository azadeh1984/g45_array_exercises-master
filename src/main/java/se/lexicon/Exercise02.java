package se.lexicon;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {
        int[] numbers = {2, 6, 3, 4, 5};

        System.out.println(indexof(numbers, 2));
    }

    private static int indexof(int[] numbers, int input) {

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == input) {
                return index;
            }
        }
        return -1;


    }


}




