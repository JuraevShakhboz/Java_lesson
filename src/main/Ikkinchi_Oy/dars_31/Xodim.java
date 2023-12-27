package Ikkinchi_Oy.dars_31;

public class Xodim {
    private double balance = 0;

    public Xodim(double balance) {
        this.balance = balance;
    }

    public double getSalary(double d) {
        return balance - balance * d;
    }

    public double payTax(double d) {
        return balance * d;
    }
}
