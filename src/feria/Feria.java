package feria;

public class Feria {
    private String artistas;
    private int cantidadDeBotellos;
    private int personas;
    private Boolean diurna;
    private Boolean hayGuaracha;
    private String generosDeMusica;

    public Feria(String artistas, int cantidadDeBotellos, int personas, Boolean diurna, Boolean hayGuaracha, String generosDeMusica) {
        this.artistas = artistas;
        this.cantidadDeBotellos = cantidadDeBotellos;
        this.personas = personas;
        this.diurna = diurna;
        this.hayGuaracha = hayGuaracha;
        this.generosDeMusica = generosDeMusica;
    }
    
    public void artistasNuevos(){
        String str;
        str = artistas;
    }
    public void botellosCaidos (){
        cantidadDeBotellos -=20;
    }
    public void personasNoAsisten (){
        personas -=54;
    }
    public void feriaDedia(){
        diurna = true;
    }
    public void guaracha(){
        hayGuaracha = true;
    }
    public void musica(){
        String str;
        str = generosDeMusica;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public int getCantidadDeBotellos() {
        return cantidadDeBotellos;
    }

    public void setCantidadDeBotellos(int cantidadDeBotellos) {
        this.cantidadDeBotellos = cantidadDeBotellos;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Boolean getDiurna() {
        return diurna;
    }

    public void setDiurna(Boolean diurna) {
        this.diurna = diurna;
    }

    public Boolean getHayGuaracha() {
        return hayGuaracha;
    }

    public void setHayGuaracha(Boolean hayGuaracha) {
        this.hayGuaracha = hayGuaracha;
    }

    public String getGenerosDeMusica() {
        return generosDeMusica;
    }

    public void setGenerosDeMusica(String generosDeMusica) {
        this.generosDeMusica = generosDeMusica;
    }
    
    
    public void nuevosBotellos(int nuevaCantidadDeBotellos){
        if(nuevaCantidadDeBotellos<=this.cantidadDeBotellos){
            System.out.println("No hay nuevos botellos: ");
        }else{
            this.cantidadDeBotellos = nuevaCantidadDeBotellos;
            System.out.println("La nueva cantidad de botellos es: ");         
        }
    }

    
}
