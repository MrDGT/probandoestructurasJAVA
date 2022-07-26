/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author dgtur
 */
public class EjerciciodeDesglose {
    public static void main(String[] args){
Scanner sc=new Scanner (System.in);

double importe=0;
do{
    try{
        System.out.println("Desglosador de Billetes");
        System.out.println("Ingresa la Cantidad de Desglosar: ");
        importe=sc.nextDouble();
}catch(Exception e){
        System.out.println("Introducistes datos incorrectos");
        System.out.println("");
        sc.nextLine();
    }
}
while(importe<=0);

calcular(importe);
}

public static void calcular(double importe)
{
double [] billetes={500, 200, 100, 50, 20, 10, 5, 2, 1};
double [] devolver={0, 0, 0, 0, 0, 0, 0, 0, 0};

for (int i=0;i<billetes.length;i++)
{
    if(importe>=billetes[i])
    {
    devolver[i]= Math.floor(importe/billetes[i]);

    importe=importe-(devolver[i]*billetes[i]);
    }
}
for(int i=0;i<billetes.length;i++)
{
    if(devolver[i]>0)
    {
        if(billetes[i]>2)
        {
        System.out.println("Hay "+devolver[i]+" billetes de: "+billetes[i]+"Lempiras");
    }else{
       System.out.println("Hay "+devolver[i]+" billetes de: "+billetes[i]+"Lempiras");
}
}
}
}
}








