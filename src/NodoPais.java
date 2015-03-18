import java.util.*;

public class NodoPais {
    Scanner sc = new Scanner(System.in);
    
    private int posicion;
    private String nombrePais;
    private NodoPais der;
    private NodoPais izq;
    private LSucursales sucursales = new LSucursales();
    private boolean existe=false;
    private NSucursales encontrado = new NSucursales();
    
    
    public NodoPais(){
        der=null;
        izq=null;
    }
    public void setSucur(LSucursales sucursales){
        this.sucursales=sucursales;
    }
    
    public LSucursales getSucur(){
        return sucursales;
    }
    
    public NodoPais(String nombrePais){
        this.nombrePais=nombrePais;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public NodoPais getDer() {
        return der;
    }

    public NodoPais getIzq() {
        return izq;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setDer(NodoPais der) {
        this.der = der;
    }

    public void setIzq(NodoPais izq) {
        this.izq = izq;
    }

    public LSucursales getSucursales() {
        return sucursales;
    }

    public void setSucursales(LSucursales sucursales) {
        this.sucursales = sucursales;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public NSucursales getEncontrado() {
        return encontrado;
    }

    public void setEncontrado(NSucursales encontrado) {
        this.encontrado = encontrado;
    }
    
    
    
    public void mostrar(){
        System.out.println("Pos: "+posicion+" Pais: "+nombrePais );
    }
    
    public void CompararNom(String nom){
        NSucursales aux = sucursales.getCabeza();
        if(aux!=null){
            
            while(aux!=null){
                if(aux.getNombre().equals(nom)){
                    existe=true;
                    System.out.println("-Nombre ya existente, intente de nuevo- ");
                }  
                aux=aux.getProximo();
            }
        }
    }
    
    public void CrearSucursal(){
        NSucursales nuevo = new NSucursales();
        System.out.println("Ingrese el nombre de la Sucursal: ");
        String nom;
        do{
           existe=false;
           nom = sc.nextLine().toUpperCase();
           
           CompararNom(nom);
        }while (existe!=false);
        nuevo.setNombre(nom);
        System.out.println("Ingrese la direccion: ");
        nuevo.setDireccion(sc.nextLine());
        nuevo.mostrar();
        sucursales.InsertaSucursal(nuevo);
    }
    
    public void BuscarSucursal(){
        NSucursales aux = sucursales.getCabeza();
        if(aux!=null){
            System.out.println("Indique la sucursal a buscar: (ej LOS NARANJOS) ");
            String nom = sc.nextLine().toUpperCase();
            while(!aux.getNombre().equals(nom)){
                aux=aux.getProximo();
            }
            encontrado=aux;
        }
    }
    
    public void EliminarSucursal(){
        sucursales.mostrar();
        System.out.println("Indique el pais que desea eliminar: ");
        sucursales.eliminarSucursal(sc.nextLine().toUpperCase());
        sucursales.mostrar();
    }
    
    public void modificarSucursales(){
        sucursales.ModificarSucur();
    }
    
}
