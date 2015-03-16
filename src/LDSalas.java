 
public class LDSalas {
    private NDSalas cabeza;
    private NDSalas cola;
    
    public void LDSalas(){
        cabeza=cola=null;
    }
    public NDSalas getCabeza() {
        return cabeza;
    }

    public void setCabeza(NDSalas cabeza) {
        this.cabeza = cabeza;
    }

    public NDSalas getCola() {
        return cola;
    }

    public void setCola(NDSalas cola) {
        this.cola = cola;
    }
    
    public void mostrar(){
        if(cabeza==null)
            System.out.println("No hay salas disponibles");
        else{
            NDSalas aux = cabeza;
            while(aux!=null){
                aux.mostrar();
                aux=aux.getProx();
            }
        }
    }
    
    public void InsertarSala(NDSalas nuevo) {
        if (cabeza==null) 
        {
            cabeza = cola = nuevo;
        } else 
        {
            cola.setProx(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        

    }
    
    public NDSalas EliminarPrimero()
    {
        NDSalas SalaEliminada = null;
        if(cabeza == null)
        {
            if(cabeza == cola)
            {
                SalaEliminada = cabeza;
                cabeza = cola = null;
            }
            else
            {
                SalaEliminada = cabeza;
                cabeza = cabeza.getProx();
                cabeza.setAnterior(null);
                SalaEliminada.setProx(null);
                
            }
            
        }
        return SalaEliminada;
    }
    
    public NDSalas EliminarFinal()
    {
        NDSalas SalaEliminada = null;
        if(cabeza == null)
        {
            if(cabeza == cola)
            {
                SalaEliminada = cola;
                cabeza = cola = null;
            }
            else
            {
                SalaEliminada = cola;
                cola = cola.getAnterior();
                cola.setProx(null);
                SalaEliminada.setAnterior(null);
            }
        }
        return SalaEliminada;
    }
    
    public int Contar()
    {
        NDSalas aux = cabeza;
        int cont = 0;
        while(aux!=null)
        {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
    
    public NDSalas EliminarSala(int sala) //Modificar Sala(Eliminar)
    {
        NDSalas SalaEliminada = null;
        if(cabeza==null)
        {
            if(sala ==1)
            {
                SalaEliminada = EliminarPrimero();
            }
            else if(sala == Contar())
            {
                SalaEliminada = EliminarFinal();
            }
            else if (sala > Contar()+1)
            {
                System.out.println("Error : Sala ingresada inexistente");
            }
            else
            {
                NDSalas aux = cabeza;
                int cont = 1;
                while(cont < sala - 1)
                {
                    cont ++;
                    aux = aux.getProx();
                }
                SalaEliminada = aux.getProx();
                aux.setProx(SalaEliminada.getProx());
                SalaEliminada.getProx().setAnterior(aux);
                SalaEliminada.setAnterior(null);
                SalaEliminada.setProx(null);
            }
            
        }
        return SalaEliminada;
    }
    
    public void modificar()
    {
        
    }
    
    
}
