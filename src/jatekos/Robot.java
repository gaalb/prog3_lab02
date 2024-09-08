package jatekos;

public class Robot extends Jatekos {
    static private int idCounter = 0;
    private int id;

    public Robot() {
        id = idCounter++;
    }

    public void lep() {
        System.out.println(toString() + " a(z) " + asztal.getKor() + ". körnél jár és passzol.");
    }

    public String toString() {
        return "Robot" + id;
    }
}
