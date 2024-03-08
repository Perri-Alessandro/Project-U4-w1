package entities;

import interfaces.Lightness;
import interfaces.Player;

public class VideoElement extends ElementiMultimediali implements Player, Lightness {

    private int durata = 0;
    private int volume = 0;
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
        System.out.println("VOLUME SETTATO " + (this.volume += set));
    }

    @Override
    public void setLessVolume(int setLess) {
        System.out.println("VOLUME DIMINUITO " + (this.volume - setLess));
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setDurata(int tempo) {
        if (tempo > 0) {
            this.durata = tempo;
            System.out.println("DURATA SETTATA " + durata);
        } else {
            System.out.println("ERRORE: La durata deve essere un numero positivo.");
        }
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
    public void setLuminosità(int luminostà) {
        if (luminostà >= 0 && luminostà <= 100) {
            this.luminosità = luminostà;
            System.out.println("LUMINOSITà IMPOSTATA SU: " + luminostà);
        } else {
            System.out.println("VALORE LUMINOSTà NON VALIDO. VALORE DEV'ESSERE COMPRESO TRA 0 e 100.");
        }
    }
}
