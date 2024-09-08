package jatekos;

public class Kezdo extends Jatekos {
    private String nev;

    public Kezdo(String nev) {
        this.nev = nev;
    }

    public void lep() {
        System.out.print(toString() + " a(z) " + asztal.getKor() + ". körben ");
        if (asztal.getKor() % 2 == 0) {
            asztal.emel(1.0);
            System.out.println("emeli a tétet 1-el.");
        } else {
            System.out.println("passzol.");
        }
    }

    public String toString() {
        return nev;
    }
}
