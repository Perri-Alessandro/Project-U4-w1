import entities.AudioElement;
import entities.ElementiMultimediali;
import entities.ImageElement;
import entities.VideoElement;
import java.util.Scanner;
import interfaces.Player;
import interfaces.Lightness;



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
        for (int i = 0; i < 5; i++) {
            if (elementi[i] != null) {
                System.out.println((i + 1) + ". " + elementi[i].getTitolo());
            }
        }
        System.out.println("SELEZIONA UN ELEMENTO DA ESEGUIRE (1-5):");
        int selezione = sc.nextInt();
        sc.nextLine();

        if (selezione < 1 || selezione > 5 || elementi[selezione - 1] == null) {
            System.out.println("SELEZIONE NON VALIDA. RIPROVA ");
            selezione = sc.nextInt(); // Richiede un nuovo input dall'utente
            sc.nextLine();
        }

        ElementiMultimediali selezionato = elementi[selezione - 1];
        eseguiMetodo(selezionato, sc);

    }

    private static void eseguiMetodo(ElementiMultimediali selezionato, Scanner sc) {
        if (selezionato instanceof Lightness) {
            System.out.println("INSERISCI LA LUMINOSITà (da 0 a 100):");
            int luminosita = sc.nextInt();
            ((Lightness) selezionato).setLuminosità(luminosita);
        }

        if (selezionato instanceof Player) {
            Player player = (Player) selezionato;
            System.out.println("INSERISCI IL VOLUME :");
            int volume = sc.nextInt();
            player.setMoreVolume(volume);

            if (player instanceof AudioElement) {
                System.out.println("INSERISCI LA DURATA (in minuti):");
            } else if (player instanceof VideoElement) {
                System.out.println("INSERISCI LA DURATA (in minuti):");
            }
            int durata = sc.nextInt();
            player.setDurata(durata);

            player.play();
        } else if (selezionato instanceof ImageElement) {
            ImageElement imageElement = (ImageElement) selezionato;
            System.out.println("INSERISCI LA LUMINOSITà (da 0 a 100):");
            int luminosita = sc.nextInt();
            imageElement.setLuminosità(luminosita);

            imageElement.show();
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
