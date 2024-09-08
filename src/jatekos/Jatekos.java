package jatekos;

import asztal.Asztal;
import java.util.Random;

/**
 * Jatekos osztaly a masodik gyakorlatra.
 */
public abstract class Jatekos {
    /**
    * A maximális emelés amivel emelhet egy játékos ha nincs felülírva a lep().
    */
    static private double maxRaise = 50.0;
    /**
     * Amelyik asztalnál ül a játékos.
     */
    protected Asztal asztal;
    /**
     * A véletlenszám generátor a vélelten döntésekhez.
     */
    private static Random rnd = new Random();

    /**
     * Beülteti a játékost a megadott asztalhoz.
     * @param a Az asztal aminél ülni fog a játékos.
     */
    public void setAsztal(Asztal a) {
        asztal = a;
    }

    /**
     * Véletlen lépés: 50%-50% eséllyel emel vagy passzol, ha emel, akkor vélelten számmal.
     */
    public void lep() {
        System.out.print(asztal.getKor() + ". körnél járunk, a tét " + String.format("%.2f", asztal.getTet()) + ".");
        int valasztas = rnd.nextInt(2);
        if (valasztas == 0) {
            System.out.println(" A játékos passzol.");
        } else {
            double emeles = rnd.nextDouble() * maxRaise;
            asztal.emel(emeles);
            System.out.println(" A játékos emel " + String.format("%.2f", emeles) + "-el.");
        }
    }

    /**
     * Kinyomtat egy kis butaságot mikor szemétgyűjtésre kerül a játékos.
     * Overrides method that is deprecated and marked for removal in 'java. lang. Object'
     */
    public void finalize() {
        System.out.println("Finalize: " + this.hashCode() + ", toString(): " + this.toString());
    }
}
