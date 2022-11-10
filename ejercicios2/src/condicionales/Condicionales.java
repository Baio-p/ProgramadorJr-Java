package condicionales;

import java.util.Scanner;

public class Condicionales {
    
    private static Scanner leer = new Scanner(System.in);
    
    public Condicionales(String nombre) {
         // inicializar variables o instrucciones de la clase
        System.out.println("Hola " +nombre+" desde el constructor");
    }

    /**
     * Escribir un programa que pregunte al usuario su edad y muestre 
     * por pantalla si es mayor de edad o no.
     * @return Muestra si eres mayor de edad.
     */
    public String Ejer1(){

        int edad = leer.nextInt();
        if (edad>=18){
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }

    /**
     * Escribir un programa que almacene una contraseña en una 
     * variable, pregunte al usuario por la contraseña e imprima 
     * por pantalla si la contraseña introducida por el usuario 
     * coincide con la guardada en la variable sin tener en cuenta 
     * mayúsculas y minúsculas.
     * @return Muestra si la contraseña es correcta o incorrecta.
     */
    public String Ejer2() {

        String passBD = "password";
        String passUser = leer.nextLine();
        if (passBD.equals(passUser)){
            return "La contraseña es correcta";
        } else {
            return "La contraseña es incorrecta";
        }
    }

    /**
     * Escribir un programa que pida al usuario dos números 
     * y muestre por pantalla su división. Si el divisor es 
     * cero el programa debe mostrar un error.
     * @return Muestra el esultado de la division.
     */
    public void Ejer3() {
        System.out.println("Dividamos dos numeros cualesquiera \ningresa un numero");
        float n1 = leer.nextInt();
        System.out.println("entre que numero lo quieres dividir ?");
        float n2 = leer.nextInt();
        if (n2!=0) {
            float division = n1/n2;
            System.out.println("el resultado es "+ division);
            
        } else {
            System.out.println("error");
            
        }
    }

    /**
     * Escribir un programa que pida al usuario un número entero y muestre por
     * pantalla si es par o impar.
     * @return Muestra si tu numero es par o impar.
     */
    public void Ejer4() {
        System.out.println("Revisemos numeros pares e impares \n ingresa un numero entero");
        int numEnt = leer.nextInt();
        System.out.println((numEnt % 2 == 0) ? "Tu numero es par" : "Tu numero es impar");
        return;
    }

    /**
     * Para pagar un determinado impuesto se debe ser mayor de 16 años y tener
     *  unos ingresos iguales o superiores a $5000 mensuales. Escribir un 
     * programa que pregunte al usuario su edad y sus ingresos mensuales y 
     * muestre por pantalla si el usuario tiene que pagar o no.
     * @return Muestra si puedes pagar impuestos o no.
     */
    public void Ejer5() {
        System.out.println("Veamos si puedes pagar impuestos\n que edad tienes ?");
        int edad = leer.nextInt();
        System.out.println("cuanto ganas mensualmente?");
        float ingMens = leer.nextFloat();
        System.out.println((edad >= 16 && ingMens >= 5000.00) ? "Puedes pagar impuestos" : "No puedes pagar impuestos");
        return;
    }

    // public String Ejer6() {
        
    //     char inicial = leer.next().charAt(0);
    //     char sexo = leer.next().charAt(0);

    //}

    /**
     * En una determinada empresa, sus empleados son evaluados al final
     *  de cada año. Los puntos que pueden obtener en la evaluación 
     * comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores 
     * beneficios. Los puntos que pueden conseguir los empleados pueden 
     * ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las
     *  cifras mencionadas. A continuación se muestra una tabla con los 
     * niveles correspondientes a cada puntuación. La cantidad de dinero 
     * conseguida en cada nivel es de $2,400 multiplicada por la 
     * puntuación del nivel.

    Nivel	Puntuación
    Inaceptable	0.0
    Aceptable	0.4
    Meritorio	0.6 o más

    Escribir un programa que lea la puntuación del usuario e indique su 
    nivel de rendimiento, así como la cantidad de dinero que recibirá el 
    usuario.
     * @return Muestra el nivel de puntuacion y la cantidad recibida.
     */
    public  void Ejer7() {
        System.out.println("Veamos tu nivel de rendimiento laboral segun tu puntaje \ningresa tu puntuacion");
        System.out.println("0.0 ? \n 0.4 ? \n 0.6 o mas ?");
        float puntos = leer.nextFloat();
        double dineroRec = puntos * 2400;
        if (puntos == 0.0) {
            System.out.println("Inaceptable");
        }
        else if (puntos == 0.4) {
            System.out.println("Aceptable");
        }
        else if (puntos >= 0.6) {
            System.out.println("Meritorio");
        }
        System.out.println("Te daremos " + dineroRec + " por tu rendimiento");
        return;
    }

    /**
     * Ejercicio 8
Escribir un programa para una empresa que tiene salas de juegos para todas las 
edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes 
por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio 
de la entrada. Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años 
debe pagar $5 y si es mayor de 18 años, $10.
     * 
     */
    public void Ejer8() {
        System.out.println("Para jugar en alguna de mis salas me debes decir primero tu edad \nque edad tienes ?");
        int edad = leer.nextInt();
        if (edad < 4) {
            System.out.println("Tu entras gratis");
        } else if (edad >= 4 && edad <= 18) {
            System.out.println("La entrada cuesta $5 pesos");
        } else {
            System.out.println("La entrada cuesta $10 pesos");
        }
        return;
    }




//     public String Ejer9() {
//         String ingrediente;
//         String basePizza = "tomate y mozzarella";
//         String tipoPizza = leer.nextLine();
//         System.out.println("Todas nuestras pizzas llevan tomate y mozzarella");
//         if (tipoPizza == "Vegetariana") {
//             System.out.println("¿Cual ingrediente quieres para tu pizza?\n" + 
//                                 "Pimineto \n" +
//                                 "Tofu");
//             ingrediente = leer.nextLine();
//         } else if (tipoPizza == "No vegetariana") {
//             System.out.println("¿Cual ingrediente quieres para tu pizza?\n" + 
//                                 "Peperoni \n" +
//                                 "Jamon \n" +
//                                 "Salmon");
//             ingrediente = leer.nextLine();
//         } else {
//             System.out.println("No manejamos ese tipo de pizza");     
//         }
//         return "Tu pizza " + tipoPizza + " es de " + ingrediente +" con " + basePizza;
//     }
}

