public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задание № 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.print("ФИО сотрудника - " + fullName);

        System.out.println();
        System.out.println();

        // task 2

        System.out.println("Задание № 2");

        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        System.out.println();
        // task 3

        System.out.println("Задание № 3");

        fullName.replace("ё", "е");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}