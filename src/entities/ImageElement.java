package entities;

import interfaces.Lightness;

public class ImageElement extends ElementiMultimediali implements Lightness {
    private int luminosità;
    public ImageElement(String titolo) {
        super(titolo);
    }

    @Override
    public void setTitolo(String titolo) {
        this.titolo = titolo;
        System.out.println("TITOLO INSERITO: " + titolo);
    }

    @Override
    public void setLuminostà(int luminosità) {
        if (luminosità >= 0 && luminosità <= 100) {
            this.luminosità = luminosità;
            System.out.println("LUMINOSITà IMPOSTATA SU: " + luminosità);
        } else {
            System.out.println("VALORE LUMINOSTà NON VALIDO. VALORE DEV'ESSERE COMPRESO TRA 0 e 100.");
        }
    }

    public void show() {
        StringBuilder asterischi = new StringBuilder();
        for (int i = 0; i < luminosità; i++) {
            asterischi.append("*");
        }
        System.out.println(getTitolo() + " " + asterischi.toString());
    }
}
