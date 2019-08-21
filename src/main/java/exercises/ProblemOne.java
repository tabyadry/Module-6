package exercises;

import java.util.Arrays;

public class ProblemOne<T> {

    public void exchangePosition(T[] array, Integer firstPosition, Integer secondPosition) {
        if (firstPosition < 0 || firstPosition > array.length)
            throw new ArrayIndexOutOfBoundsException("first position is out of bounds");
        if (secondPosition < 0 || secondPosition > array.length)
            throw new ArrayIndexOutOfBoundsException("second position is out of bounds");
        if (firstPosition == secondPosition) return;

        T auxiliarElement = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = auxiliarElement;
    }

    public static void main(String[] args) {
        ProblemOne<String> problemOne = new ProblemOne<String>();
        String[] array = new String[]{"para","mar","cireasa","banana","pruna"};

        System.out.println(Arrays.toString(array));
        problemOne.exchangePosition(array,1,3);
        System.out.println(Arrays.toString(array));
    }
}
