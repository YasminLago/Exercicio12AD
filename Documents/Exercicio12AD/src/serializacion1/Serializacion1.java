package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author oracle
 */
public class Serializacion1 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Mclase m = new Mclase("ola",-7,2.7E10);
       
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("serial.txt"));
        ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("serial.txt"));
        salida.writeObject(m);
        salida.close();
        
        Mclase m1 = (Mclase) entrada.readObject();
        //System.out.println(m);
        System.out.println(m1);
    }
    
}