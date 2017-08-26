/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalhos;

/**
 *
 * @author Paulo Gouveia
 */
public class Peso {
    private int pesoTerra;
    private int resultadoPeso;
    private final int mercurio = (int) 0.37;
    private final int marte = (int) 0.38;
    private final int saturno = (int) 1.15;
    private final int venus = (int) 0.88;
    private final int jupiter = (int) 2.64;
    private final int urano = (int) 1.17;

   public Peso(String pesoTerra) {
       this.pesoTerra = Integer.parseInt(pesoTerra);
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public Peso (int pesoTerra) {
        this.pesoTerra = pesoTerra;
   }   
    
    
    public int getPesoTerra() {
        return pesoTerra;
    }

    public void setPesoTerra(int pesoTerra) {
        this.pesoTerra = pesoTerra;
    }
    
    public int getResultadoPeso(){ 
        if(jrMercurio.isSelected()){
       return (int) (0.37 * pesoTerra);
}else if (jrVenus.isSelected());{
<<<<<<< HEAD
        return (int) (0.88 * pesoTerra);
   
    }else if (jrMarte.isSelected();{
        return (int) (0.38 * pesoTerra);
=======
        return (int) (0.37 * pesoTerra);
   
    }else if (jrMarte.isSelected();{
        return (int) (0.37 * pesoTerra);

}
        



    
    

    public void setResultadoPeso(int resultadoPeso) {
        this.resultadoPeso = resultadoPeso;
    }
    
}
