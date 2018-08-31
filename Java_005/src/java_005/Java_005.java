/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_005;
import java.util.Scanner;

public class Java_005 
{
Scanner sc =new Scanner(System.in);
private int[]sueldos;


    public void cargar()
    {
      sueldos = new int[5];
        for (int f = 0; f < sueldos.length; f++) 
        {
            System.out.println("Ingrese sueldos: ");
            sueldos[f] = sc.nextInt();
        }
    }

    public void ordenar()
    {
        for (int k = 0; k < 4; k++) 
        {
            for (int f = 0; f < 4-k; f++)
            {
                if(sueldos[f]>sueldos[f+1])
                {
                    int aux;
                    aux = sueldos[f];
                    sueldos[f] =sueldos[f+1];
                    sueldos[f+1] = aux;
                }
            }
        }       
    }

public void imprimir()
{
    System.out.println("Sueldos ordenados de menor a mayor: ");
    for (int f = 0; f < sueldos[f]; f++) 
    {
        System.out.println(sueldos[f]);
    }
}

 
    public static void main(String[] args) 
    {
      Java_005 jv005 = new Java_005();
      jv005.cargar();
      jv005.ordenar();
      jv005.imprimir();
    }
    
}
