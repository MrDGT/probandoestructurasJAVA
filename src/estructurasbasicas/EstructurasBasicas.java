/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasbasicas;

/**
 *
 * @author dgtur
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=0;
        double decimales=10.5;
        char caracter='A';
        boolean binario=false;


        float nota=85;
        float MAXAPR=60;

//Estructuras de Decision
       /* if(nota>=MAXAPR){
            System.out.println("Aprobo la clase con exito");
               }
        else{
            System.out.println("Reprobo la Clase");
    }*/

// Operador Ternario o Sencillo que es de uso rapido

        System.out.println(nota>MAXAPR ? "Aprobo la clase con exito" : "Reprobo la clase");

        System.out.println(!binario);

        
       if(nota>=0 & nota<60){
           System.out.println("Reprobado");
       }else if(nota>=60 & nota<80){
           System.out.println("Bueno");
       }else if(nota>=80 & nota<90){
           System.out.println("Muy Bueno");
       }else{
System.out.println("Excelente");
}

switch(numero){
case 0:
    System.out.println(5+5);
    break;
case 1:
    System.out.println(10+10);
    break;
default:
    System.out.println(0);
    break;
}

switch (caracter){
case 'A':
    System.out.println("El Caracter A");
    break;
case 'X':
    System.out.println("El Caracter X");
    break;
}
//Operadores Logicos
//And & 
// Or |

//Estructuras repetitivas
while(numero>10){
    System.out.println("Hola");
    numero++;
//operadores de incremento ++ y de decremento --
}

do{
    System.out.println("Hola");
    numero++;
}while(numero>10);

for( int x=0; x<numero;x++) {
    System.out.println("Hola");
}

int prueba=10;
int nuevoValor=20;
        System.out.println(prueba++);
//Usando operador de incremento
nuevoValor += prueba;
        System.out.println("Nuevo Valor: " + nuevoValor);
    

//Operadores Acumuladores+= o -= o *= o /=

    
    }
    
}
