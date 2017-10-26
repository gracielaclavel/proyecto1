/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1graciela;
import java.util.Scanner;//Esta libreria toma los datos que digita el usuario  por consola paso1

/**
 *
 * @author lp12
 */
public class Entradadatos 
{
    public static void main(String[] args)
    {
       // Aqui estamos creando el objeto escaner -paso  2
        //Este objeto solo se crea una vez
     Scanner sc = new Scanner(System.in);// se crea el lector
     //Padimos los datos al usuario paso 3
     System.out.println("Por favor ingrese su nombre");
     //Se lee el nombre y se almacena paso 4
     String nombre = sc.nextLine();
     //procesamos los datos del usuario, en este caso, lo imprimimo paso 5
     System.out.println("Bienvenido"+nombre+" por favor digite su edad");
            int edad = sc.nextInt();
            System.out.println("Usted tiene "+edad+"años");
    }
    
}

