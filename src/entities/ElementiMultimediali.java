package entities;

public abstract class ElementiMultimediali {
    protected String titolo;

    public ElementiMultimediali(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract void setTitolo(String titolo);

//    @Override
//    public String toString() {
//        return "ElementiMultimediali{" +
//                "titolo='" + titolo + '\'' +
//                '}';
//    }

}
