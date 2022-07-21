package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if(number % 5 == 0) {
            if (number % 11 == 0) {

                if (number % 0 == 0) {
                    System.out.println("Dividable" + "Non-dividable" + "cannot divide by zero");
                }
            }
        }
    }
}
