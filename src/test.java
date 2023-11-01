import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        method(78, 23, 12, 21, 78, 21, 12, 64, 2, 21, 21, 17, 21, 12, 12, 64, 78, 64, 23, 23, 23);
    }

    public static void method(int... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            for (int j = 0; j < varargs.length -1; j++) {
                if (varargs[j] > varargs[j + 1]) {
                    int sort = varargs[j];
                    varargs[j] = varargs[j + 1];
                    varargs[j + 1] = sort;
                }
            }
        }
        int count = 0, k = 0, h = 1, g = 0;
        for (int i = 0; i < varargs.length - 1; i++) {
            if (varargs[i] == varargs[i + 1]) {
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < varargs.length - 1; i++) {
            if (varargs[i] == varargs[i + 1]) {
                array[k++] = varargs[i];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) h++;
        }
        int[] newArray = new int[h];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                newArray[g++] = array[i];
            }
        }
        newArray[g] = array[array.length - 1];
        int largeArrayElement = newArray[0], smollArrayElement = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > largeArrayElement) {
                largeArrayElement = newArray[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < smollArrayElement) {
                smollArrayElement = newArray[i];
            }
        }
        int[] addElementArray = new int[newArray.length +1];
        for (int i = 0; i < addElementArray.length; i++) {
            if (i < newArray.length) {
                addElementArray[i] = newArray[i];
            } else {
                addElementArray[i] = 90;
            }
        }
        int[] removeElementArray = new int[newArray.length -1];
        for (int i = 0; i < removeElementArray.length; i++) {
            removeElementArray[i] = newArray[i];
        }
        System.out.println(Arrays.toString(varargs));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
//        System.out.println(Arrays.toString(addElementArray));
//        System.out.println(Arrays.toString(removeElementArray));
//        System.out.println(largeArrayElement);
//        System.out.println(smollArrayElement);
    }
}
