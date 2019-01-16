package boletin_18_2;

import boletin_18_1.Boletin_18.Persoal;


/**
 *
 * @author cfigueirasvalverde
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoal gustavo = new Persoal("615728435", "gustagus@vamoadarle.org");
        Persoal roberto = new Persoal("659843847", "bertoroberto@gmail.com");
        Academica gustavo = new Academica("Gustavo", 19, gustavo);
        Academica roberto = new Academica("Roberto", 16, roberto);
        gustavo.setNota(8);
        System.out.println(gustavo.toString());
        System.out.println(roberto.toString());
    }
    
}