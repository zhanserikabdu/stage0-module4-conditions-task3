package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int Feb = 28;
        int June = 30;
        if (month == Feb) {
            System.out.println(28);
        } else if (month == June) {
            System.out.println(30);

        } else {
            System.out.println("wrong number!");
        }
    }

}