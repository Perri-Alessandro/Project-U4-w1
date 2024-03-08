package entities;

public abstract class ElementiMultimediali {
    private String titolo;

    public ElementiMultimediali(String titolo) {
        this.titolo = titolo;
    }

    public abstract void getTitolo();

    public abstract void setTitolo();

    public void play() {
        int durata = 0;
       System.out.println( durata == 0 ? "QUESO ELEMENTO NON HA UNA DURATA" : "ELEMENTO IN RIPRODUZIONE ");
    }

    @Override
    public String toString() {
        return "ElementiMultimediali{" +
                "titolo='" + titolo + '\'' +
                '}';
    }
}
