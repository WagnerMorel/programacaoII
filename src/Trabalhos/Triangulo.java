package Trabalhos;

/**
 *
 * @author Paulo Gouveia
 */
public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int resultadoTriangulo;

    public Triangulo(String ladoA, String ladoB, String ladoC) {

        this.ladoA = Integer.parseInt(ladoA);
        this.ladoB = Integer.parseInt(ladoB);
        this.ladoC = Integer.parseInt(ladoC);
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    Triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public String getResultadoTriangulo() {
        if(ladoA==ladoB && ladoA == ladoC){
            return "Equilátero";
        }
    
        else if (ladoA == ladoB && ladoC != ladoA){
          return"Isoceles";
    }

   else {
return "Os três lados são diferentes";

        }
    }



    public void setResultadoTriangulo(int resultadoTriangulo) {
        this.resultadoTriangulo = resultadoTriangulo;
    }

}
