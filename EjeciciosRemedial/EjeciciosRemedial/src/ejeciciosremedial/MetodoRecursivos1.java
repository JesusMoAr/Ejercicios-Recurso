package ejeciciosremedial;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

public class MetodoRecursivos1<T> {

    private T[] array;
    Scanner a = new Scanner(System.in);
    Random sd = new Random();

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] Crear(int tamaño) {
        if (tamaño == 0) {
            System.out.println("Ingrese un valor");
            tamaño = a.nextInt();
            Double[] arr = new Double[tamaño];
            arr = (Double[]) relleno(arr, 0);
            setArray((T[]) arr);
            return (T[]) array;
        }
        return array;
    }

    public T[] randomlleno(T[] arre, int i) {
        if (i < arre.length) {
            Double asd = (double) sd.nextInt(10);
            arre[i] = (T) asd;
            i++;
            return randomlleno(arre, i);
        } else {
            setArray(arre);
        }
        return array;
    }

    public T[] relleno(Double[] arre, int i) {
        if (i < arre.length) {
            arre[i] = (double) i;
            i++;
            return relleno(arre, i);
        }
        return (T[]) arre;
    }

    public String[] Valores(String[] arre, int i, Double acum1, Double acum2, int cont1, int cont2, int acum12, int acum22) {
        if (i <= 0) {
            randomlleno(array, 0);
            Imprimir(array, 0);
        }
        if(array.length>10){
            System.out.println("El tamaño del arreglo es mayor a 10");
            System.out.println("Se usaran solo los primero 10 valores");
        }
        if (i < 10) {
            Double av = (Double) array[i];
            if (av % 2 == 0) {
                acum1 += av;
                cont1++;
            } else {
                acum2 += av;
                cont2++;
            }
            if (i % 2 == 0) {
                acum12 += av;
            } else {
                acum22 += av;
            }
            i++;
            return Valores(arre, i, acum1, acum2, cont1, cont2, acum12, acum22);
        } else {
            arre[0] = "Promedio 'Pares' = " + acum1 / cont1;
            arre[1] = "Promedio 'IMPARES' = " + acum2 / cont2;
            arre[2] = "Suma de 'PARES' = " + acum12;
            arre[3] = "Suma de 'IMPARES' = " + acum22;
            return arre;
        }

    }

    public String[] Buscar(int rep, String asd, int i, double abcd) {

        if (i < array.length) {

            if ((Double) array[i] == abcd) {
                asd += " " + i + ",";
                rep++;
            }
            i++;
            return Buscar(rep, asd, i, abcd);
        } else {
            String[] gg = new String[2];
            gg[0] = "El numero se repitio en las posiciones " + asd;
            gg[1] = "Y se repitio " + rep;
            return gg;
        }

    }

    public void SumPosNeg(double AcumPos, double AcumNeg, int i) {
        if (i < array.length) {
            if ((Double) array[i] >= 0) {
                AcumPos += (Double) array[i];
            } else {
                AcumNeg += (Double) array[i];
            }
            i++;
            SumPosNeg(AcumPos, AcumNeg, i);
        } else {
            System.out.println("Suma de positivos = " + AcumPos);
            System.out.println("Suma de negativos = " + AcumNeg);
        }

    }

    public T[] Imprimir(T[] arre, int i) {

        if (i <= array.length - 1) {
            if(array[i]!=null){
                System.out.print("[" + array[i] + "] ");
            }else{
            
            }
            i++;
            return Imprimir(array, i);
        } else {
            return array;

        }

    }

    public T[] ImprimirR(int i) {
        if (i >= 0) {
            System.out.print("[" + array[i] + "] ");
            i--;
            return ImprimirR(i);
        } else {
            return array;
        }
    }

    public void Sumar(int i, double a) {
        if (i <= array.length - 1) {
            a += (Double) array[i];
            i++;
            Sumar(i, a);
        } else {
            System.out.println("La suma es = " + a);
        }

    }

    public void Multiplicar(Double acum, int i) {
        if (i < array.length) {
            acum *= (Double) array[i];
            i++;
            Multiplicar(acum, i);
        } else {
            System.out.println("Multiplicacion " + acum);
        }
    }

    public void rangoHasta(int valor, int i) {
        if (valor > array.length) {
            System.out.println("Esa posicion no existe");
        } else {
            if (i < valor) {
                System.out.print("[" + array[i] + "] ");
                i++;
                rangoHasta(valor, i);
            }
        }

    }

    public void RangoDesdeHasta(int desde, int hasta) {
        if (desde < 0 && hasta > array.length) {
            System.out.println("Ingrese rangos validos");
        } else {
            if (desde <= hasta) {
                System.out.print("[" + array[desde] + "] ");
                desde++;
                RangoDesdeHasta(desde, hasta);
            }
        }

    }

    public void SumaRango(int valor, int i, Double acum, String cd) {
        if (valor > array.length) {
            System.out.println("Esa posicion no existe");
        } else {
            if (i < valor) {
                acum += (Double) array[i];
                cd +=""+array[i]+"+";
                i++;
                
                SumaRango(valor, i, acum,cd);
            } else {
                System.out.println("La suma de  "+cd +" = "+ acum);

            }
        }

    }

    public String[] Borrar(int rep, String asd, int i, double abcd){
    String[] gg = new String[2];
    if (i < array.length) {

            if ((Double) array[i] == abcd) {
                asd += " " + i + ",";
                rep++;
                array[i]=null;
            }
            i++;
            return Borrar(rep, asd, i, abcd);
        } else {
            
            gg[0] = "El numero se Elimino en las posiciones " + asd;
            gg[1] = "Y se repitio " + rep;
        }
        System.out.println("");
        Imprimir(array, 0);
    return gg;
    }
}
