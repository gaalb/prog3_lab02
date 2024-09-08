package asztal;

import java.util.Random;
import jatekos.Jatekos;

public class Asztal {
    static protected int maxJatekos = 10;
    private double tet;
    private Jatekos[] jatekosok;
    private int kor;
    private double goal;

    protected int nJatekos;
    private Random rnd;
    public Asztal() {
        rnd = new Random();
        tet = 0.0;
        jatekosok = new Jatekos[maxJatekos];
        nJatekos = 0;
        kor = 0;
        goal = rnd.nextDouble() * 100.0;
    }
    public void ujJatek() {
        goal = rnd.nextDouble() * 100.0;
        tet = 0.0;
        kor = 0;
    }
    public void addJatekos(Jatekos j) throws AsztalTele {
        if (nJatekos < 10) {
            jatekosok[nJatekos++] = j;
            j.setAsztal(this);
        } else {
            throw new AsztalTele("Az asztal megtelt");
        }
    }
    public int getKor() {
        return this.kor;
    }
    public void emel(double d) {
        tet += d;
    }
    public void kor() throws NincsJatekos{
        if (nJatekos == 0) {
            throw new NincsJatekos("Senki nem ül az asztalnál");
        }
        if (tet >= goal) {
            System.out.println("Vége a játéknak.");
            return;
        }
        kor: for (int i=0; i<nJatekos; i++) {
            jatekosok[i].lep();
            if (tet >= goal) {
                System.out.print("A tét (" + String.format("%.2f", tet)
                        + ") túllépte a célt ("
                        + String.format("%.2f", goal) + "). ");
                if (tet <= goal * 1.1) {
                    System.out.println("A " + i + ". játékos nyert." );
                } else {
                    System.out.println("Mindenki vesztett.");
                }
                return;
            }
        }
        kor++;
        System.out.println("A tét " + String.format("%.2f", tet) + ".");
    }
    public double getTet() {
        return this.tet;
    }
}
