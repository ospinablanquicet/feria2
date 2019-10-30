package feria;

public class comida extends Feria {
    
    private int puestosDeComida;
    private boolean comidasPicantes;
    private String nombreDeLosPuestos;

    public comida(int puestosDeComida, boolean comidasPicantes, String nombreDeLosPuestos, String artistas, int cantidadDeBotellos, int personas, Boolean diurna, Boolean hayGuaracha, String generosDeMusica) {
        super(artistas, cantidadDeBotellos, personas, diurna, hayGuaracha, generosDeMusica);
        this.puestosDeComida = puestosDeComida;
        this.comidasPicantes = comidasPicantes;
        this.nombreDeLosPuestos = nombreDeLosPuestos;
    }

    public int getPuestosDeComida() {
        return puestosDeComida;
    }

    public void setPuestosDeComida(int puestosDeComida) {
        this.puestosDeComida = puestosDeComida;
    }

    public boolean isComidasPicantes() {
        return comidasPicantes;
    }

    public void setComidasPicantes(boolean comidasPicantes) {
        this.comidasPicantes = comidasPicantes;
    }

    public String getNombreDeLosPuestos() {
        return nombreDeLosPuestos;
    }

    public void setNombreDeLosPuestos(String nombreDeLosPuestos) {
        this.nombreDeLosPuestos = nombreDeLosPuestos;
    }
    
    
    
}
