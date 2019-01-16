package boletin_18_2;

import boletin_18_1.Boletin_18.Persoal;

/**
 *
 * @author cfigueirasvalverde
 */
    public class Academica {
    private static int numReferenciaP = 2017;
    private int numReferencia;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academica() {
        numReferenciaP++;
        numReferencia = numReferenciaP;
    }

    public Academica(String nome, int nota, Persoal alumno) {
        numReferenciaP++;
        numReferencia = numReferenciaP;
        this.nome = nome;
        this.nota = analizarNota(nota);
        this.alumno = alumno;
    }

    Academica(String gustavo, int i, Academica gustavo0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = analizarNota(nota);
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Datos alumno: " + "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", " + alumno.toString();
    }
    
    private int analizarNota(int nota){
        if(nota < 1 || nota > 10){
            System.out.println("Nota inválida");
            return 0;
        }
        else{
            return nota;
        }
    }
    
}