import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {

		int[] array = new int[20];

		for (int i = 1; i <= 20; i++) {
			array[i - 1] = i;
		}

		shuffle(array);

		System.out.println(Arrays.toString(array));

	}

	public static void shuffle(int[] array) {

		Random rgen = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}

	}

}
