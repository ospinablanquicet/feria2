package feria;

public class concursos extends Feria {
    
    private int participantes;
    private boolean mayoresDeEdad;
    private int cantidadDeGanadores;

    public concursos(int participantes, boolean mayoresDeEdad, int cantidadDeGanadores, String artistas, int cantidadDeBotellos, int personas, Boolean diurna, Boolean hayGuaracha, String generosDeMusica) {
        super(artistas, cantidadDeBotellos, personas, diurna, hayGuaracha, generosDeMusica);
        this.participantes = participantes;
        this.mayoresDeEdad = mayoresDeEdad;
        this.cantidadDeGanadores = cantidadDeGanadores;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public boolean isMayoresDeEdad() {
        return mayoresDeEdad;
    }

    public void setMayoresDeEdad(boolean mayoresDeEdad) {
        this.mayoresDeEdad = mayoresDeEdad;
    }

    public int getCantidadDeGanadores() {
        return cantidadDeGanadores;
    }

    public void setCantidadDeGanadores(int cantidadDeGanadores) {
        this.cantidadDeGanadores = cantidadDeGanadores;
    }
    
    
    
}
