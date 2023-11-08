import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> arrUser = new ArrayList<User>();
        String name;
        int age;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите имя %d пользователя (строка):\n", i);
            name = in.nextLine();
            System.out.printf("Введите возраст %d пользователя (целое число):\n", i);
            age = in.nextInt();
            in.nextLine();
            arrUser.add(new User(name, age));
        }
        Comparator<User> compareByAge = new Comparator<User>() {
            public int compare(User user1, User user2) {
                return user1.getAge() - user2.getAge();
            }
        };
        Collections.sort(arrUser, compareByAge);
        for (User u : arrUser)
            System.out.println(u.toString());
    }
}