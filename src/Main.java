import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        out1:
        while(true) {

            menu();
            System.out.println("Elija una opcion : ");
            Scanner sc = new Scanner(System.in);
            String opcion = sc.next();
            switch (opcion) {
                case "1":
                    int numeroValidado = validarNumero();
                    String binario = enteroaBinario(numeroValidado);
                    mostrarBinario(numeroValidado, binario);
                    break;
                case "2":
                    int binarioValidado = validarBinario();
                    int decimal = binarioaEntero(binarioValidado, 2);
                    mostrarDecimal(binarioValidado, decimal);
                    break;
                case "3":
                    System.out.println("Adios");
                    break out1;


            }
        }

    }
    public static int ingresarNumero(){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero mayor entre 0 y 255: ");
        numero = sc.nextInt();

        return numero;
    }

    public static int validarNumero(){
        int numero = 0;
        do {

            try {
                numero = ingresarNumero();

            } catch (Exception e) {
                System.out.println("error, ingrese un numero correcto");
                ingresarNumero();
            }

        }while(numero<0||numero>255);
        return numero;

    }

    public static int ingresarBinario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero binario (de 8 bits)");
        int binario = sc.nextInt();
        return binario;

    }

    public static int validarBinario(){
        int numero = 0;
        do {

            try {
                numero = ingresarBinario();

            } catch (Exception e) {
                System.out.println("error, ingrese un numero correcto");
                ingresarBinario();
            }

        }while(numero<0||numero>1111111);
        return numero;

    }





    public static void menu(){
        System.out.println("----------Menu--------");
        System.out.println("[1] Mostrar representaci??n binaria");
        System.out.println("[2] Mostrar representaci??n decimal");
        System.out.println("[3] Salir");
    }




    public static String enteroaBinario(int numero){
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            short residuo = (short) (numero % 2);
            numero = numero / 2;
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }



    public static int binarioaEntero(int numero,int base){ //base n a base 10
        return  Integer.parseInt(String.valueOf(numero),base);
    }



    public static void mostrarDecimal(int numero,  int conversion){
        System.out.println("Numero "+numero+" (binario) "+" a base 10 es: ");
        System.out.println(conversion);
    }

    public static void mostrarBinario(int numero,String binario){
        System.out.println("El numero "+numero+" convertido a binario es: ");
        System.out.println(binario);
    }





}
