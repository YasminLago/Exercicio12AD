package serializacion1;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Mclase implements Serializable{
    
    String nome;
    //int numero1;
    transient int numero1;
    double numero2;

    public Mclase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        //return "Object1: " + "s= " + nome + ", i= " + numero1 + ", d= " + numero2;
        return "Object2: " + "s= " + nome + ", i= " + numero1 + ", d= " + numero2;
    } 
    
}