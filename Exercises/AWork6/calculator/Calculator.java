package Exercises.AWork6.calculator;

public class Calculator {
    private String[] history;

    public double sum(double a, double b) {
        save(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    public double subtract(double a, double b) {
        save(a + "-" + b + "=" + (a - b));
        return a - b;
    }

    public double multiply(double a, double b) {
        save(a + "*" + b + "=" + (a * b));
        return a * b;
    }

    public double division(double a, double b) {
        save(a + "/" + b + "=" + (a / b));
        return a / b;
    }

    public double raisedNumber(double a, double b) {
        save(a + "^" + b + "=" + (Math.pow(a, b)));
        return Math.pow(a, b);
    }

    public double restDiv(double a, double b) {
        save(a + "%" + b + "=" + (a % b));
        return a % b;
    }

    // Resolvent Formula
    public String ResolFormula(double a, double b, double c) {
        double x = (-b + Math.sqrt((4 * a * c))) / (2 * a);
        double y = (-b - Math.sqrt((4 * a * c))) / (2 * a);

        save("x1=" + x + " x2=" + y);

        return "X=" + x + " V X=" + y;
    }

    public void save(String string) {
        if (history == null) {
            history = new String[1];
            history[0] = string;
        } else {
            String[] temp = new String[history.length + 1];
            System.arraycopy(history, 0, temp, 0, history.length);
            temp[history.length] = string;
            history = temp;
        }
    }

    // Print history
    public void printHistory() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }

    // Print last 5 operations
    public void printLast5() {
        if (history != null) {
            for (int i = history.length - 1; i > history.length - 6; i--) {
                if (i >= 0) {
                    System.out.println(history[i]);
                }
            }
        }
    }

}
