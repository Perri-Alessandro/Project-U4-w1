package entities;

import interfaces.Player;

public class VideoElement extends ElementiMultimediali implements Player {

    public int durata = 0;
    public int volume = 0;

    public VideoElement(String titolo) {
        super(titolo);
    }

    @Override
    public void setTitolo(String titolo) {
        String testo = null;
        System.out.println("TITOLO INSERITO " + (titolo = testo));
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
            int luminosita = 3;
            for (int i = 0; i < luminosita; i++) {
                luminositaString.append("*");
            }

            String asterischi = luminositaString.toString();
            for (int i = 0; i < durata; i++) {
                System.out.println("ELEMENTO IN RIPRODUZIONE " + titolo + volumeString.toString() + asterischi);
            }
        }
    }
}
