import entities.AudioElement;
import entities.ElementiMultimediali;
import entities.ImageElement;
import entities.VideoElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CREA FINO A 5 CONTENUTI MULTIMEDIALI A TUA SCELTA. PREMI 0 PER TERMINARE PRIMA DI 5 LA SELEZIONE. 1 PER IMMAGINI, 2 PER VIDEO O 3 PER AUDIO:");
//
//        System.out.println("ELEMENTO AUDIO:");
//        AudioElement prova = new AudioElement("primaTrack.mp3");
//        prova.setMoreVolume(63);
//        prova.setDurata(3);
//        prova.play();
//
//        System.out.println("ELEMENTO VIDEO:");
//        VideoElement trying = new VideoElement("EPICODE PILS");
//        trying.setMoreVolume(85);
//        trying.setDurata(8);
//        trying.setLuminosità(8);
//        trying.play();
//
//        System.out.println("ELEMENTO IMMAGINE:");
//        ImageElement test = new ImageElement("PASSO FEDAIA");
//        test.setLuminosità(9);
//        test.show();

        ElementiMultimediali[] elementi = new ElementiMultimediali[5];

        for(int i = 0; i < 5; i++) {
            ElementiMultimediali media = CreaElementi.creaMedia(sc);
            if (media == null) {
                break;
            }
            elementi[i] = media;
        }

        System.out.println("ELEMENTI INSERITI:");
        for (ElementiMultimediali elemento : elementi) {
            if (elemento != null) {
                System.out.println(elemento.getTitolo());
            }
        }
        sc.close();

    }
}
