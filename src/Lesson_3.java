import java.util.Arrays;

public class Lesson_3 {
         public static void main(String[] args) {
            String first_word = "aS dF";
            String second_word = "fDвsA";

            String firstVar = first_word.toLowerCase().replace(" ", "");
            String secondVar = second_word.toLowerCase().replace(" ", "");

            if (firstVar.length() != secondVar.length()) {
                System.out.println("Длина одного слова больше другого, явно не анаграмма :-( ");
            } else {
                char[] firstArray = firstVar.toCharArray();
                char[] secondArray = secondVar.toCharArray();
                Arrays.sort(firstArray);
                Arrays.sort(secondArray);
                if (Arrays.equals(firstArray, secondArray)) {
                    System.out.println("Слова: " + "\n" + first_word + "\n" + second_word + "\nанаграмма");
                } else {
                    System.out.println("Слова: " + "\n" + first_word + "\n" + second_word + "\nне анаграмма");
                }
          }
      }
 }
