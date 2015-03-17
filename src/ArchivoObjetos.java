
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ArchivoObjetos 
{

    public void CrearArchivo(arbolPaises pais) throws Exception
    {
        FileOutputStream file = null;
        file = new FileOutputStream ("ArbolPaises.DAT");
            ObjectOutputStream output = new ObjectOutputStream (file);
            output.writeObject(pais);
            output.close();
    }
    
    public Object ObtenerArchivo() throws Exception
    {
        FileInputStream file = null;
        arbolPaises pais=null;
        file = new FileInputStream ("ArbolPaises.DAT");
        ObjectInputStream input = new ObjectInputStream (file);
        pais = (arbolPaises) input.readObject();
        input.close();
        return pais;
    }
    
    
}
