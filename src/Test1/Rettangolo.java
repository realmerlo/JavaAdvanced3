package Test1;

public class Rettangolo{
    private double base;

    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }


    public double calcolaArea() {
       return base * altezza;
    }
}
