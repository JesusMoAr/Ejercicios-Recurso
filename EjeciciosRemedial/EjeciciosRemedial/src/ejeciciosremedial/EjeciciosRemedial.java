package ejeciciosremedial;

import java.util.Random;
import java.util.Scanner;

public class EjeciciosRemedial {

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
//////////////////////METODOS NO RECURSIVOS//////////////////////////////////////////
        MetodosNoRecursivos<Double> a = new MetodosNoRecursivos<>(); 
         System.out.println("********************** Dar tamaño al arreglo **********************");
        int tma = a.Crear();
        Double[] ab = new Double[10];
        Random rnd = new Random();
        for (int i = 0; i < ab.length; i++) {
            int asd = rnd.nextInt(10);
            ab[i] = (double) asd;
        }
        System.out.println(" ");
          a.setArray(ab);
          System.out.println("********************** Pares e Inpares **********************");
          a.Valores(ab);
          System.out.println("********************** Buscar **********************");
          a.Buscar();
          System.out.println("********************** Suma Positivos y Negativos **********************");
          a.SumPosNeg();
          System.out.println("********************** Imprimir **********************");
          a.Imprimir();
          System.out.println("********************** Imprinir Alrevez **********************");
          a.ImprimirRever();
          System.out.println("********************** Sumar el arreglo **********************");
          a.Sumar();
          System.out.println("********************** Multiplicar el arrelo **********************");
          a.Multiplicar();
          System.out.println("********************** Imprimir hasta N **********************");
          a.rangoHasta();
          System.out.println("********************** Imprimir Desde N Hasta N **********************");
          a.RangoDesdeHasta();
          System.out.println("********************** Sumar hasta N **********************");
          a.SumaRango();
          System.out.println("********************** Borrar **********************");
          a.Borrar();
          

//////////////////////METODOS NO RECURSIVOS//////////////////////////////////////////




//////////////////////METODOS  RECURSIVOS00//////////////////////////////////////////
        MetodoRecursivos1<Double> aw = new MetodoRecursivos1<>();
        System.out.println("");
        System.out.println("********************** Metodo 1 **********************");
        System.out.println("********************** Asiganar el Tamaño y Darle el valor de su posicion ********************** ");
        aw.Imprimir(aw.Crear(0), 0);
        System.out.println("");

        
        
        

        System.out.println("********************** Metodo 2 **********************");
                System.out.println("********************** Pares e Inpares ********************** ");
        String[] valores = new String[4];
        Double acum1 = 0.0, acum2 = 0.0;
        int cont1 = 0, cont2 = 0;
        int acum12 = 0, acum22 = 0;
        String[] aswe = new String[4];
        aswe = aw.Valores(aswe, 0, acum1, acum2, cont1, cont2, acum12, acum22);
        System.out.println("");
        for (int i = 0; i < aswe.length; i++) {
            System.out.println(aswe[i]);
        }
        System.out.println("");

        
        
        

        System.out.println("********************** Metodo 3 **********************");
                System.out.println("********************** Buscar un valor ********************** ");
        int rep = 0;
        aw.setArray(aw.randomlleno(ab, rep));
        aw.Imprimir(aw.getArray(), 0);
        System.out.println("");
        System.out.println("Ingrese un valor a buscar en el arreglo");
        double abcd = Scn.nextDouble();
        String asd = " ";
        String[] val = aw.Buscar(rep, asd, 0, abcd);
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }
        System.out.println("");

        
        
        

        System.out.println("********************** Metodo 4 **********************");
         System.out.println("********************** Suma de postivios y negativos **********************");
        Double[] arre = new Double[]{-2d, 5d, 8d, -9d, 10d, 15d, -4d};
        aw.setArray(arre);
        double AcumPos = 0, AcumNeg = 0;
        aw.Imprimir(arre, 0);
        aw.SumPosNeg(AcumPos, AcumNeg, 0);

        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 5 **********************");
         System.out.println("********************** Imprimir **********************");
        aw.Imprimir(arre, 0);
        
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 6 **********************");
         System.out.println("********************** Imprimir al revez **********************");
        aw.ImprimirR(arre.length-1);  
        
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 7 **********************");    
         System.out.println("********************** Suma todo el arreglo **********************");
        aw.Sumar(0, 0);
                
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 8 **********************");    
         System.out.println("********************** Multiplicar el arreglo **********************");
        Double acum = 1.0;
        aw.Multiplicar(acum,0);
                        
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 9 **********************");       
         System.out.println("********************** Imprimir desde 0 hasta N **********************");
        System.out.println("Hasta que posicion se imprimira");
        int valor = Scn.nextInt();
        aw.rangoHasta(valor,0);
                                
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 10 **********************");    
         System.out.println("********************** Imprimir desde N hasta N **********************");
        System.out.println("Desde que posicion se imprimira");
        int desde = Scn.nextInt();
        System.out.println("Hasta que posicion se imprimira");
        int hasta = Scn.nextInt();
  
        aw.RangoDesdeHasta(desde, hasta);
                                        
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 11 **********************");    
        System.out.println("********************** Sumar hasta N **********************");
        System.out.println("Hasta que posicion se sumara");
        int valorQ = Scn.nextInt();
        Double acumUno  = 0.0;
        String cd = "";
        aw.SumaRango(valorQ, 0,acumUno,cd);
                                               
        System.out.println("");

        
        
        
        System.out.println("********************** Metodo 12 **********************");       
         System.out.println("********************** Borrar N valor **********************");
        
         int rep1 = 0;
        aw.setArray(aw.randomlleno(ab, rep));
        aw.Imprimir(aw.getArray(), 0);
        System.out.println("");
        System.out.println("Ingrese un valor a borrar en el arreglo");
        double abcd2 = Scn.nextDouble();
        String asd2 = " ";
        String[] vals = aw.Borrar(rep1, asd2, 0, abcd2);
        for (String val1 : vals) {
            System.out.println(val1);
        }
        System.out.println("");

    }

}
