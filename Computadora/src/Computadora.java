//se necesita un programa donde se manipulen los componentes de una computadora
public class Computadora {
    private String procesador;
    private String placagrafica;
    private String monitor;
    private int ram;
    private int memoria;
    private String gabinete;
    private String fuente;

    public Computadora(String procesador, String placagrafica, String monitor, int ram, int memoria, String gabinete, String fuente) {
        this.procesador = procesador;
        this.placagrafica = placagrafica;
        this.monitor = monitor;
        this.ram = ram;
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.fuente = fuente;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPlacagrafica() {
        return placagrafica;
    }

    public void setPlacagrafica(String placagrafica) {
        this.placagrafica = placagrafica;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", placagrafica='" + placagrafica + '\'' +
                ", monitor='" + monitor + '\'' +
                ", ram=" + ram +
                ", memoria=" + memoria +
                ", gabinete='" + gabinete + '\'' +
                ", fuente='" + fuente + '\'' +
                '}';
    }

    public
}
