/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estructuras_jdcm;       
        
import java.util.Scanner;


/**
 *
 * @author belse
 */
public class Estructuras_jdcm {

    public static void main(String[] args) {
        /*
            *Calcular el salario neto de varios emplreados ingresados por teclado.
            Nombre, apellido, identificacion, salario
        NOTA:  utilizar notación húngara y adicionar las iniciales de los nombres y apelllidos a todas las variables utilizads
        el programa debe indicar al usuario si desea ingresar otro  empleado
        el programa termina cuando la respuesta sea N
        */

        
        Scanner scJdcmSc = new Scanner(System.in);

        char respuesta;
        do {
            System.out.println("====== Liquidación de Nómina ======");
            System.out.println("Ingrese los datos del empleado");
            System.out.print("Nombre: ");
            String strJdcmNombre = scJdcmSc.next();

            System.out.print("Apellido: ");
            String strJdcmApellido = scJdcmSc.next();

            System.out.print("Identificación: ");
            String strJdcmIdentificacion = scJdcmSc.next();

            System.out.print("Salario: ");
            double dbJdcmlSalario = scJdcmSc.nextDouble();

       
             //Se calcula el valor de las deducciones.
            Double dblJdcmDeduccion =  dbJdcmlSalario * 0.04;        
       
            //Se descuenta saludo pensión del salario.
            double dbJdcmlSalarioNeto = dbJdcmlSalario - (dblJdcmDeduccion*2);
            //variable para calcular el espaciado.
            int intJdcmEspaciado = 25;
            // Se calcula la longitud máxima para dibujar el borde derecho
            int intJdcmLongitudContenido = Math.max(Math.max(strJdcmNombre.length(), strJdcmApellido.length()), strJdcmIdentificacion.length());
             
            // Imprime la nomina 
            System.out.println("╔══════════════" + llenarConCaracter("═", intJdcmEspaciado + intJdcmLongitudContenido) + "╗");
            System.out.println("║                  Liquidación de Nómina" + llenarEspacios(intJdcmEspaciado - String.valueOf("Liquidación de Nómina").length())+"║");
            System.out.println("╠══════════════" + llenarConCaracter("═", intJdcmEspaciado + intJdcmLongitudContenido) + "╣");
            System.out.println("║ Nombre:          " + strJdcmNombre + llenarEspacios(intJdcmEspaciado - strJdcmNombre.length()) + "║");
            System.out.println("║ Apellido:        " + strJdcmApellido + llenarEspacios(intJdcmEspaciado - strJdcmApellido.length()) + "║");
            System.out.println("║ Identificación:  " + strJdcmIdentificacion + llenarEspacios(intJdcmEspaciado - strJdcmIdentificacion.length()) + "║");
            System.out.println("║ Salario Bruto:   $" + dbJdcmlSalario + llenarEspacios(intJdcmEspaciado - String.valueOf(dbJdcmlSalario).length() - 1) + "║");
            System.out.println("║ Salario Neto:    $" + dbJdcmlSalarioNeto + llenarEspacios(intJdcmEspaciado - String.valueOf(dbJdcmlSalarioNeto).length() - 1) + "║");
            System.out.println("╚══════════════" + llenarConCaracter("═", intJdcmEspaciado + intJdcmLongitudContenido) + "╝");

            // Se pregunta al usuario si desea ingresar otro empleado
            System.out.print("\n¿Desea ingresar otro empleado? (S/N): ");
            respuesta = scJdcmSc.next().charAt(0);

        } while (respuesta == 'S' || respuesta == 's');

        System.out.println("Programa terminado.");
        scJdcmSc.close();
    }
    
    private static String llenarEspacios(int cantidad) 
    {
        StringBuilder espacios = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            espacios.append(" ");
        }
        return espacios.toString();
    }
    
     private static String llenarConCaracter(String caracter, int cantidad) 
     {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            resultado.append(caracter);
        }
        return resultado.toString();
     }
   
}


