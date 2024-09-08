package jatekos;

public class Nyuszi extends Jatekos {
    private String szin;

    public Nyuszi(String sz) {
        szin = sz;
    }

    public String toString() {
        return szin;
    }

    public void lep() {
        System.out.print(toString() + " színű nyuszi lép a " + asztal.getKor() + ". körben.");
        if (asztal.getTet() < 50.0) {
            asztal.emel(5.0);
            System.out.println(" Emel 5-tel.");
        } else {
            System.out.println(" Húha!.");
        }
    }
}
