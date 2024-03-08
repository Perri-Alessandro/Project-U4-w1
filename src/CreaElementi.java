import entities.AudioElement;
import entities.ElementiMultimediali;
import entities.ImageElement;
import entities.VideoElement;
import java.util.Scanner;


public class CreaElementi extends ElementiMultimediali {
    public CreaElementi(String titolo) {
        super(titolo);
    }

    @Override
    public void setTitolo(String titolo) {
        this.titolo = titolo;
        System.out.println("TITOLO INSERITO: " + titolo);
    }

    public static void creaElementi(Scanner sc) {
        ElementiMultimediali[] elementi = new ElementiMultimediali[5];
        int numeroElementi = 0;

        while (numeroElementi < 5) {
            ElementiMultimediali media = creaMedia(sc);
            if (media == null) {
                break;
            }
            elementi[numeroElementi++] = media;
        }

        System.out.println("ELEMENTI INSERITI:");
        for (ElementiMultimediali elemento : elementi) {
            if (elemento != null) {
                System.out.println(elemento.getTitolo());
            }
        }
    }

    public static ElementiMultimediali creaMedia(Scanner sc) {
        ElementiMultimediali media = null;


            int scelta = sc.nextInt();
            sc.nextLine();


            switch (scelta) {
                case 0:
                    System.out.println("SELEZIONE TERMINATA");
                   return null;
                case 1:
                    media = new ImageElement("IMMAGINE");
                    break;
                case 2:
                    media = new VideoElement("VIDEO");
                    break;
                case 3:
                    media = new AudioElement("AUDIO");
                    break;
                default:
                    System.out.println("SCELTA NON VALIDA, NON COMPRESA TRA 1 E 3.");
                    return creaMedia(sc);
            }
            return media;
        }
}
