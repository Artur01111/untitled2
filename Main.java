import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mallHome;
        final int NUM = 5;
        String word = "РАБОТА";
        mallHome = NUM + word;
        System.out.println(mallHome);
        System.out.println(word);
        System.out.println(NUM);
        if(NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else if (NUM == 0) {
            System.out.println("Вы сохранили ноль");
        }
        System.out.print("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Привет: " + username + "!");
        System.out.print("Введите ваш возраст: ");
        Scanner scanner1 = new Scanner(System.in);//ghost of king Artur
        int age = scanner1.nextInt();
        if (age < 18) {
            System.out.println("You are not 18 years!");
        }
        else if (age > 18) {
            System.out.println("You are older than 18 years!");
        }
        else if (18 == age) {
            System.out.println("You are 18 years!");
        }
    }
}