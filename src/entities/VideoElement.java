package entities;

import interfaces.Lightness;
import interfaces.Player;

public class VideoElement extends ElementiMultimediali implements Player, Lightness {

    public int durata = 0;
    public int volume = 0;
    private int luminosità;

    public VideoElement(String titolo) {
        super(titolo);
    }

    @Override
    public void setTitolo(String titolo) {
        this.titolo = titolo;
        System.out.println("TITOLO INSERITO: " + titolo);
    }

    @Override
    public void setMoreVolume(int set) {
        volume = 0;
        System.out.println("VOLUME SETTATO " + (this.volume += set));
    }

    @Override
    public void setLessVolume(int setLess) {
        System.out.println("VOLUME DIMINUITO " + (this.volume - setLess ));
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setDurata(int tempo) {
        System.out.println("DURATA SETTATA " + (this.durata = tempo));
    }

    @Override
    public void play() {
        if (durata <= 0) {
            System.out.println("QUESTO ELEMENTO NON HA DURATA");
        } else {
            StringBuilder volumeString = new StringBuilder();
            for (int i = 0; i < volume; i++) {
                volumeString.append("!");
            }

            StringBuilder luminositaString = new StringBuilder();
            for (int i = 0; i < luminosità; i++) {
                luminositaString.append("*");
            }

            String asterischi = luminositaString.toString();
            for (int i = 0; i < durata; i++) {
                System.out.println("ELEMENTO IN RIPRODUZIONE " + titolo + volumeString.toString() + asterischi);
            }
        }
    }

    @Override
    public void setLuminostà(int luminostà) {
        if (luminosità >= 0 && luminosità <= 100) {
            this.luminosità = luminosità;
            System.out.println("LUMINOSITà IMPOSTATA SU: " + luminosità);
        } else {
            System.out.println("VALORE LUMINOSTà NON VALIDO. VALORE DEV'ESSERE COMPRESO TRA 0 e 100.");
        }
    }
}
