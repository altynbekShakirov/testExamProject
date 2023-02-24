/**
 * The golden boy
 */
public class Vinodel {
    private String typeVino;
    private String emgekStaj;
    private String address;
    private Vino vinos;

    public Vinodel(String typeVino, String emgekStaj, String address, Vino vinos) {
        this.typeVino = typeVino;
        this.emgekStaj = emgekStaj;
        this.address = address;
        this.vinos = vinos;
    }

    public String getTypeVino() {
        return typeVino;
    }

    public void setTypeVino(String typeVino) {
        this.typeVino = typeVino;
    }

    public String getEmgekStaj() {
        return emgekStaj;
    }

    public void setEmgekStaj(String emgekStaj) {
        this.emgekStaj = emgekStaj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vino getVinos() {
        return vinos;
    }

    public void setVinos(Vino vinos) {
        this.vinos = vinos;
    }

    public Vinodel() {
    }

    @Override
    public String toString() {
        return "Vinodel{" +
                "typeVino='" + typeVino + '\'' +
                ", emgekStaj='" + emgekStaj + '\'' +
                ", address='" + address + '\'' +
                ", vinos=" + vinos +
                '}';
    }





}

