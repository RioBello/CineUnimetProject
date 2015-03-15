
public class NCPelicula {
    private String titulo;
    private String director;
    private String ano;
    private boolean enCartelera;
    private NCPelicula prox;
    private NCPelicula anterior;

    public NCPelicula getProx() {
        return prox;
    }

    public void setProx(NCPelicula prox) {
        this.prox = prox;
    }

    public NCPelicula getAnterior() {
        return anterior;
    }

    public void setAnterior(NCPelicula anterior) {
        this.anterior = anterior;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isEnCartelera() {
        return enCartelera;
    }

    public void setEnCartelera(boolean enCartelera) {
        this.enCartelera = enCartelera;
    }
    
    public void mostrar(){
        System.out.println("Pelicula: "+titulo);
        System.out.println("Director: "+director+" Ano: "+ano);
        if(enCartelera==true)
            System.out.println("SI se encuentra en cartelera");
        else
            System.out.println("NO se encuentra en cartelera");
    }
    
}
