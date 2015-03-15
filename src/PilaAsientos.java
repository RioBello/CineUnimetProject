
public class PilaAsientos {
    private NPAsientos cabeza;
    
    public NPAsientos peek(){
        return cabeza;
    }
    
    public void push(NPAsientos nuevo){
        nuevo.setProx(cabeza);
        cabeza=nuevo;
    }
    
    public NPAsientos pop(){
        NPAsientos aux = cabeza;
        aux.setProx(null);
        cabeza=cabeza.getProx();
        return aux;
    }
    
    
}
