import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner entrada = new Scanner(System.in);
        String placa;
        String nombre;
        double horaInicio;

        System.out.println("======================================");
        System.out.println("Bienvenidos al parqueadero Pepito");
        System.out.println("Valor hora o fraccion");
        System.out.println("Carro: $2000 Moto: $1000");
        System.out.println("====================================== \n");

        System.out.print("Por favor ingrese la placa del vehiculo:");
        placa = entrada.nextLine();
        System.out.print("Por favor ingrese el nombre del conductor:");
        nombre = entrada.nextLine();
        System.out.print("Por favor ingrese la hora de llegada:");
        horaInicio = entrada.nextDouble();

        System.out.println("======================================");
        System.out.println("su nombre es:" + nombre);
        System.out.println("su placa es:" + placa);
        System.out.println("su hora de entrada es:" + horaInicio);
        System.out.println("======================================");

    }
}