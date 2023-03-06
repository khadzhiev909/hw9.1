public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName.toUpperCase());

    }
    private static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;

        fullName = fullName.toUpperCase();
        fullName = fullName.replace("Ё", "Е");

        System.out.println("Данные ФИО сотрудника " + fullName);
    }
}