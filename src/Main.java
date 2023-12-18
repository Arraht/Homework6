public class Main {
    public static void main(String[] args) {
        /*Task 1:*/
        System.out.println("Task 1:");
        for (int i = 1, a = 1; i < 11; i++, a++) {
            System.out.println("\tЧисло: " + i + " № итерации = " + a);
        }
        /*Task 2:*/
        System.out.println("Task 2:");
        for (int i = 10; i > 0; i--) {
            System.out.println("\tЧисло = " + i);
        }
        /*Task 3:*/
        System.out.println("Task 3:");
        for (int i = 0; i < 17; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("\tЧисло = " + i);
        }
        /*Task 4:*/
        System.out.println("Task 4:");
        for (int i = 10; i > -11; i--) {
            System.out.print(i + "; ");
        }
        /*Task 5:*/
        System.out.println("\nTask 5:");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println("\t" + i + " год является високосным");
        }
        /*Task 6:*/
        System.out.println("Task 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + "; ");
        }
        /*Task 7:*/
        System.out.println("\nTask 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + "; ");
        }
        /*Task 8:*/
        System.out.println("\nTask 8:");
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + 29000;
            System.out.println("\tМесяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
        /*Task 9:*/
        System.out.println("Task 9:");
        int deposit = 0, total;
        for (int i = 1; i <= 12; i++) {
            deposit += (deposit / 100) + 29000;
            total = deposit;
            System.out.println("\tМесяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        /*Task 10:*/
        System.out.println("Task 10:");
        int number = 2, result;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println("\t" + number + " * " + i + " = " + result);
        }
    }
}