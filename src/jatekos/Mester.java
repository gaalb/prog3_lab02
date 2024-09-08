package jatekos;

public class Mester extends Jatekos{
    private int fokozat;

    public Mester(int fok) {
        fokozat = fok;
    }

    public String toString() {
        return fokozat + " fokozatú Mester";
    }

    public void lep() {
        asztal.emel(asztal.getTet() * (double) fokozat / 100.0);
        System.out.println(toString() + " emeli a tétet " + fokozat + " %-al.");
    }
}
