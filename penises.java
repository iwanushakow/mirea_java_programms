import java.util.Arrays;
import java.util.Random;

public class penises {

    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = randInt(1, 50);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }

        System.out.println("");

        Arrays.sort(array);
        for (int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++){
            array2[i] = (int) (Math.random() * 50);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(array2[i]);
        }

        Arrays.sort(array2);
        System.out.println("");
        for (int i = 0; i < 10; i++){
            System.out.println(array2[i]);
        }

    }
}
