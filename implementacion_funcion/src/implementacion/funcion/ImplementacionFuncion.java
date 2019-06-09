/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.funcion;

/**
 *
 * @author vpala
 */
public class ImplementacionFuncion {

   private static double volumen1 (double l ) {
         double radio = l/ 2;
        double pi = Math.PI;
        double volumen = (4 * pi * (Math.pow(radio, 3)))/3;
        double volcubo = Math.pow(l, 3);
        double resta= volcubo- volumen;
        return resta;
        
    }
    private static int calcular (int numero1,String operador,int numero2){
     int x = 0;   

        if ("+".equals(operador)||"-".equals(operador)||"*".equals(operador)||"/".equals(operador)) {
             if("+".equals(operador)) {
                 x= numero1 + numero2;
                  System.out.println(numero1+numero2);
                  
            }
             if("-".equals(operador)){
                 x= numero1 - numero2;
                 System.out.println("numero1 - numero 2 ="+ x); 
                
            }    
             if ("/".equals(operador) ){
                 x= numero1/ numero2;
                System.out.println("numero1 / numero 2 ="+ x);
            }    
             if ("*".equals(operador)){
                 x= numero1 * numero2;
                 System.out.println("numero1 * numero2 ="+ x);}
        
        }  else{
            System.out.println("Solo se pueden estos operadores * / - +");     
        } 
        return x;
}

    public static void main(String[] args) {
  
       /*double resta = volumen1 (5); 
        System.out.println(resta); */
        calcular(6,"+",7);
    }   
}

        
    


