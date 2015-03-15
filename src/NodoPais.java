
public class NodoPais {
    private int posicion;
    private String nombrePais;
    private NodoPais der;
    private NodoPais izq;
    private LSucursales Sucursales;
    
    
    public NodoPais(){
        der=null;
        izq=null;
    }
    public void setSucur(LSucursales Sucursales){
        this.Sucursales=Sucursales;
    }
    
    public LSucursales getSucur(){
        return Sucursales;
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
    
}
