/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class InvertirNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void InvertirNumero (int n){
        {
        int a = (int ) n/10; //cociente 1153
        int b = n % 10; //cociente 1153
        int c = b;
        a = (int) a/10; //cociente 115
        b = a % 10; //residuo 3
        c = (c *10) + b; //3
        a = (int) a / 10; //cociente 11
        b = a % 10; //residuo 5
        c = (c * 10) + b; //335
        a = (int) a/10; // 1 cociente 
        b = a % 10; //1 residuo
        c = (c * 10) + b; //3351
        a = (int) a / 10; //0 cociente
        b = b % 10; //1 residuo
        c = ( c + 10) + b; //335111
        System.out.println (c);
    }
}        
    }
    
