import java.util.*;

public class NCPelicula {
    Scanner sc = new Scanner(System.in);
    
    private String titulo;
    private String director;
    private String ano;
    private boolean enCartelera = false;
    private NCPelicula prox;
    private String formato;

    
    public NCPelicula(){
        
    }
    
    public NCPelicula getProx() {
        return prox;
    }

    public void setProx(NCPelicula prox) {
        this.prox = prox;
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
    
    
    public void mostrar(){
        System.out.print("Pelicula: "+titulo);
        System.out.println("Director: "+director+" Ano: "+ano);
        if(enCartelera==true)
            System.out.println("EN cartelera");
        else
            System.out.println("NO en cartelera");
    }
    
    public void modificar(){
        String resp;
        do{
        System.out.println("Que desea modificar: ");
        System.out.println("1 Titulo\n2 Director\n3 Ano\n4 Formato");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Nuevo Ttulo: ");
                    sc.nextLine();
                    titulo=sc.nextLine().toUpperCase();
                    mostrar();
                    break;
                case 2:
                    System.out.println("Nuevo Director: ");
                    sc.nextLine();
                    director= sc.nextLine();
                    mostrar();
                    break;
                case 3:
                    System.out.println("Nuevo ano: ");
                    sc.nextLine();
                    ano=sc.nextLine();
                    mostrar();
                    break;
                case 4:
                    System.out.println("Nuevo formato: ");
                    sc.nextLine();
                    formato=sc.nextLine();
                    mostrar();
                    break;
            }
         System.out.println("Desea seguir modificando PELICULA");
         resp=sc.nextLine().toUpperCase();
         }while(resp.equals("SI"));
    
    
    }
    public NCPelicula CrearPelicula(){
        NCPelicula nuevo = new NCPelicula();
        System.out.println("Ingrese el Titulo: ");
        nuevo.setTitulo(sc.nextLine().toUpperCase());
        System.out.println("Ingrese el director: "); 
        nuevo.setDirector(sc.nextLine());
        System.out.println("Ingrese el ano del filme: ");
        nuevo.setAno(sc.nextLine());
        System.out.println("Ingrese el formato del filme");
        nuevo.setFormato(sc.nextLine().toUpperCase());
       return nuevo;
    }
}
