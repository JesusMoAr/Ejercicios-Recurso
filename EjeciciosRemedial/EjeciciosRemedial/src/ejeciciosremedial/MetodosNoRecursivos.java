package ejeciciosremedial;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MetodosNoRecursivos<T> {

    private T[] array;
    Scanner a = new Scanner(System.in);

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int Crear() {
        System.out.println("*******************Metodo 1*******************");
        int tamaño = 0;
        while (tamaño == 0) {
            try {
                System.out.println("Ingrese el Tamaño del arreglo");
                tamaño = a.nextInt();
                array = (T[]) new Array[tamaño];
            } catch (Exception e) {
                System.out.println("Ingrese un numero para le valor");
            }
        }
        Integer i = 0;
        for (T t : array) {
            t = (T) i;
            System.out.print("[" + t + "]");
            i++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return tamaño;
    }

    public T[] Valores(T[] arr) {
        System.out.println("*******************Metodo 2*******************");
        
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        
        System.out.println("");
        array = arr;
        if(array.length>10){
            System.out.println("El tamaño del arreglo es mayor a 10");
            System.out.println("Se usaran solo los primero 10 valores");
        }
        String[] valores = new String[4];
        Double acum1 = 0.0, acum2 = 0.0;
        int cont1 = 0, cont2 = 0;
        int acum12 = 0, acum22 = 0;
        for (int i = 0; i < 10; i++) {
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
        }
        valores[0] = "Promedio 'Pares' = " + acum1 / cont1;
        valores[1] = "Promedio 'IMPARES' = " + acum2 / cont2;
        valores[2] = "Suma de 'PARES' = " + acum12;
        valores[3] = "Suma de 'IMPARES' = " + acum22;
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return (T[]) valores;
    }

    public void Buscar() {
        System.out.println("*******************Metodo 3*******************");
        System.out.println("Ingrese un valor a buscar (es el mismo arreglo de arrbia)");
        double abcd = a.nextDouble();
        int rep = 0;
        String asd = " ";
        for (int j = 0; j < array.length; j++) {
            if (rep >= 0) {
                if ((Double) array[j] == abcd) {
                    asd += " " + j + ",";
                    rep++;
                }
            }
        }
        if (rep > 0) {
            System.out.println("Existe el elemento en las posiciones " + asd);
            System.out.println("Y se repite " + rep + " veces");
        } else {
            System.out.println("El elemento " + abcd + " no existe en el arreglo");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void SumPosNeg() {
        System.out.println("*******************Metodo 4*******************");
        Double[] arre = new Double[]{-2d, 5d, 8d, -9d, 10d, 15d, -4d};
        setArray((T[]) arre);
        double AcumPos = 0, AcumNeg = 0;
        for (int i = 0; i < array.length; i++) {
            if ((Double) array[i] >= 0) {
                AcumPos += (Double) array[i];
            } else {
                AcumNeg += (Double) array[i];
            }
        }
        System.out.println("Suma de positivos = " + AcumPos);
        System.out.println("Suma de negativos = " + AcumNeg);
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public void Imprimir() {
        System.out.println("*******************Metodo 5*******************");
        System.out.println("Imprmir Normal");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public void ImprimirRever() {
        System.out.println("*******************Metodo 6*******************");
        System.out.println("Imprimir Al revez");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void Sumar() {
        System.out.println("*******************Metodo 7*******************");
        Double acum = 0.0;
        for (int i = 0; i < array.length - 1; i++) {
            acum += (Double) array[i];
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void Multiplicar() {
        System.out.println("*******************Metodo 8*******************");
        Double acum = 1.0;
        for (int i = 0; i < array.length; i++) {
            acum *= (Double) array[i];
        }
        System.out.println("Multiplicacion " + acum);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void rangoHasta() {
        System.out.println("*******************Metodo 9*******************");
        System.out.println("Hasta que posicion se imprimira");
        int valor = a.nextInt();
        if (valor > array.length) {
            System.out.println("Esa posicion no existe");
        } else {
            for (int i = 0; i < valor; i++) {
                System.out.print("[" + array[i] + "] ");
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void RangoDesdeHasta() {
        System.out.println("*******************Metodo 10*******************");
        System.out.println("Desde que posicion se imprimira");
        int desde = a.nextInt();
        System.out.println("Hasta que posicion se imprimira");
        int hasta = a.nextInt();
        if (desde < 0 && hasta > array.length) {
            System.out.println("Ingrese rangos validos");
        } else {
            for (int i = desde; i <= hasta; i++) {
                System.out.print("[" + array[i] + "] ");
            }
        }
        System.out.println("");

        System.out.println("");
        System.out.println("");

    }

    public void SumaRango() {
        System.out.println("*******************Metodo 11*******************");
        System.out.println("Desde que posicion se sumara");
        int valor = a.nextInt();
        Double acum = 0.0;
        if (valor > array.length) {
            System.out.println("Esa posicion no existe");
        } else {
            for (int i = 0; i < valor; i++) {
                acum += (Double) array[i];
            }
        }
        System.out.println("La suma es = " + acum);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public void Borrar() {
        System.out.println("*******************Metodo 12*******************");
        System.out.println("Ingrese un valor a borrar (es el mismo arreglo de arrbia)");
        double abcd = a.nextDouble();
        int rep = 0;
        String asd = " ";
        for (int j = 0; j < array.length; j++) {
            if (rep >= 0) {
                if ((Double) array[j] == abcd) {
                    asd += " " + j + ",";
                    rep++;
                    array[j]=null;
                }
            }
        }
        if (rep > 0) {
            System.out.println("Se elimino el elemento en las posiciones " + asd);
            System.out.println("Y se borro " + rep + " veces");
        } else {
            System.out.println("El elemento " + abcd + " no existe en el arreglo");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
