package jatekos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ember extends Jatekos {
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public void lep() {
        System.out.println("Az aktuális tét " + String.format("%.2f", asztal.getTet()) + ". Mennyit emeljünk?");
        try {
            String line = br.readLine();
            asztal.emel(Double.parseDouble(line));
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
