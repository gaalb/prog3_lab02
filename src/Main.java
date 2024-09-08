import asztal.Asztal;
import asztal.AsztalTele;
import asztal.NincsJatekos;
import asztal.WeakAsztal;
import jatekos.*;

public class Main {
    public static void main(String[] args) {
        Asztal a1 = new Asztal();
        Jatekos j1 = new Robot();
        Jatekos j2 = new Kezdo("Kezdo1");
        Jatekos j3 = new Kezdo("Kezdo2");
        Jatekos j4 = new Nyuszi("Kék");
        Jatekos j5 = new Mester(10);
        Jatekos j6 = new Ember();
        try {
            a1.addJatekos(j1);
            a1.addJatekos(j2);
            a1.addJatekos(j3);
            a1.addJatekos(j4);
            a1.addJatekos(j5);
            a1.addJatekos(j6);
        } catch (AsztalTele e) {
            System.out.println(e.toString());
        }
        for (int i=0; i<10; i++) {
            try {
                a1.kor();
            } catch (NincsJatekos e) {
                System.out.println(e.toString());
            }
        }
        //---------------------------------------------------------------------
        Asztal a2 = new Asztal();
        try {
            a2.kor();
        } catch (NincsJatekos e) {
            System.out.println(e.toString());
        }
        //---------------------------------------------------------------------
        Asztal a3 = new Asztal();
        try {
            a3.addJatekos(new Ember());
        } catch (AsztalTele e) {
            System.out.println(e.toString());
        }
        a3 = null;
        System.gc();
        //---------------------------------------------------------------------
        while (true) {
            WeakAsztal a = new WeakAsztal();
            Ember j = new Ember();
            try {
                a.addJatekos(j);
            } catch (AsztalTele e) {
                System.out.println(e.toString());
            }
            j = null;
        }
    }
}
