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

        String upperfullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperfullName);

        System.out.println();
        // task 3

        System.out.println("Задание № 3");

        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fixedFullName);
    }
}