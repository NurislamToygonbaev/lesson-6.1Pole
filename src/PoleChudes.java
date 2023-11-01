import java.util.Arrays;
import java.util.Scanner;

public class PoleChudes {
    public static void main(String[] args) {
        boolean isRur = true;
        char[] array = {'B', 'i', 's', 'h', 'k', 'e', 'k'};
        char[] sof = {'*', '*', '*', '*', '*', '*', '*'};
        System.out.println(Arrays.toString(sof));
        int count = 0;
        do {
            System.out.print("Тамга жаз: ");
            char words = new Scanner(System.in).nextLine().charAt(0);
            for (int i = 0; i < array.length; i++) {
                if (Character.toLowerCase(array[i]) == Character.toLowerCase(words)) {
                    sof[i] = words;
                    count++;
                    System.out.println(Arrays.toString(sof));
                }
                if (count == sof.length) {
                    isRur = false;
                }
            }
        } while (isRur);
    }
}
