public class Lesson_2 {

    public static void main(String[] args) {

           String[][] people = {
                    {"Карасев Михаил Фёдорович", "M", "23"},
                    {"Щербаков Максим Артёмович", "M", "14"},
                    {"Петров Игорь Тимофеевич", "M", "24"},
                    {"Зотова Варвара Александровна", "F", "36"},
                    {"Кудряшова Александра Владимировна", "M", "46"},
                    {"Григорьева Анастасия Денисовна", "F", "17"},
                    {"Черных Давид Артемьевич", "M", "85"},
                    {"Киреева Алиса Марковна", "F", "44"},
                    {"Александров Виктор Дмитриевич", "M", "25"},
                    {"Соколова Ксения Максимовна", "F", "58"}
            };

            String[] min_m;
            for (int i = 0; i < people.length; i++) {
                for (int j = i + 1; j < people.length; j++) {
                    if (Integer.parseInt(people[i][2]) > Integer.parseInt(people[j][2])) {
                        min_m = people[i];
                        people[i] = people[j];
                        people[j] = min_m;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                if (people[i][1] == "M") {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(" " + people[i][j] + " ");
                    }
                    System.out.println();
                }
            }

 System.out.println();

        String[] min_f;
        for (int k = 0; k < people.length; k++) {
            for (int j = k + 1; j < people.length; j++) {
                if (Integer.parseInt(people[k][2]) > Integer.parseInt(people[j][2])) {
                    min_f = people[k];
                    people[k] = people[j];
                    people[j] = min_f;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (people[i][1] == "F") {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + people[i][j] + " ");
                }
                System.out.println();
            }
        }
     }
}