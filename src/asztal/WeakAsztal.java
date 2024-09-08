package asztal;

import java.lang.ref.WeakReference;
import jatekos.Jatekos;

public class WeakAsztal extends Asztal {
    WeakReference<Jatekos> jatekosok[];
    public WeakAsztal() {
        super();
        jatekosok = (WeakReference<Jatekos>[]) new WeakReference[maxJatekos];
        for (int i=0; i<jatekosok.length; i++) {
            jatekosok[i] = null;
        }
    }
    public void addJatekos(Jatekos j) throws AsztalTele {
        if (nJatekos < 10) {
            jatekosok[nJatekos++] = new WeakReference<>(j);
            j.setAsztal(this);
        } else {
            throw new AsztalTele("Az asztal megtelt");
        }
    }
}
