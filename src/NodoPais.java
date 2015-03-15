import java.util.*;

public class NodoPais {
    Scanner sc = new Scanner(System.in);
    
    private int posicion;
    private String nombrePais;
    private NodoPais der;
    private NodoPais izq;
    private LSucursales sucursales;
    private boolean existe=false;
    
    
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
    
    public void mostrar(){
        System.out.println("Pos: "+posicion+" Pais: "+nombrePais );
    }
    
    public void CompararNom(String nom){
        NSucursales aux = sucursales.getCabeza();
        while(aux!=null){
            if(aux.getNombre().equals(nom)){
                existe=true;
                System.out.println("-Nombre ya existente, intente de nuevo- ");
            }
                
            aux=aux.getProximo();
        }
        
    }
    
    public void CrearSucursal(){
        NSucursales nuevo = new NSucursales();
        System.out.println("Ingrese el nombre de la Sucursal: ");
        
        do{
           existe=false;
           String nom = sc.next().toUpperCase();
           CompararNom(nom);
        }while (existe!=false);
        
        System.out.println("Ingrese la direccion: ");
        nuevo.setDireccion(sc.next());
        
        sucursales.InsertaSucursal(nuevo);
    }
    
    public void modificarSucursales(){
        sucursales.ModificarSucur();
    }
    
}
