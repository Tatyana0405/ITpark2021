package lesson6;
import java.util.Arrays;

public class WordReducerRunner {
    public static void main(String[] args) {
        String[] words = {"Большой"+ "Привет"+ "От"+ "Слушателей"+ "ИТ парка"+ "От"};
        System.out.println(Arrays.toString(intersect(words, "От"))); //"Большой"+ "Привет"+ "Слушателей"+ "ИТ парка"
        System.out.println(Arrays.toString(intersect(words, "привет"))); //"Большой"+ "Привет"+ "Слушателей"+ "ИТ парка"
    }

    public static String[] intersect(String[] initialArray, String word) {
        String[] result = new String[initialArray.length];
        System.arraycopy(initialArray, 0, result, 0, initialArray.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(word)) {
                result[i] = null;
            }
        }
        int maxNotNullIndex = 0;
        for (String str : result) {
            if (str != null) {
                maxNotNullIndex++;
            }
        }
        String[] newResult = new String[maxNotNullIndex];
        int counter = 0;
        for (String str : result) {
            if (str != null) {
                newResult[counter++] = str;
            }
        }
        return newResult;
    }
    }
