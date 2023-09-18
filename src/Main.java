import java.util.Scanner;   //import = include en c++

class Main {
    public static void main(String[] args) {    //
        Scanner scanner = new Scanner(System.in);   //necesario para poder usar el scanner(cin en c++)

        System.out.println("Ingrese el primer número: ");   //cout
        double numero1 = scanner.nextDouble();  //

        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        ordenarNumeros(numero1, numero2, numero3);


    }
    public static void ordenarNumeros(double a, double b, double c) {
        double temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Números ordenados de mayor a menor: " + a + ", " + b + ", " + c);   // se usa + en vez de <<
    }
}
