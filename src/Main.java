import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado = "";
        double salarioBruto, salarioNeto, valorHora, cantidadHoras = 0;
        double deduccionSalud, deduccionPension, horasExtras, valorHorasExtras = 0;
        double bonificacion, fondoSolidaridadPencional, auxiolioTransporte, salarioMinimo = 0;

        System.out.println("Ingresa el nombre del empleado");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingresa el numero de documento");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el valor hora del empleado");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese Cantidad de horas trabajadas");
        cantidadHoras = sc.nextDouble();
        System.out.println("Ingrese el valor del salario minimo actual");
        salarioMinimo = sc.nextDouble();

        if (cantidadHoras > 24) {
            /*Pagar al empleado*/
            System.out.println("Se le puede pagar al usuario");
            salarioBruto = valorHora * cantidadHoras;
            System.out.println("El salario bruto del empleado:" + nombreEmpleado + " es de $ " + salarioBruto);
            deduccionPension = (salarioBruto * 0.04);
            deduccionSalud = (salarioBruto * 0.04);
            System.out.println("La decuccion por salud es: " + deduccionSalud);
            System.out.println("La decuccion por pension es: " + deduccionPension);
            if (salarioBruto <= (salarioMinimo * 2)) {
                auxiolioTransporte = 200000;
                bonificacion = salarioBruto * 0.1;
            } else {
                auxiolioTransporte = 0;
                bonificacion = 0;
            }
        if (cantidadHoras > 96) {
            /*Pagar Horas Extras*/
            horasExtras = cantidadHoras - 96;
            valorHorasExtras = valorHora * 0.25 * horasExtras;
        }
        salarioNeto=salarioBruto-deduccionPension-deduccionSalud+valorHorasExtras+bonificacion+auxiolioTransporte;
        System.out.println("Detalle de pago " + nombreEmpleado);
        System.out.println("El salario bruto del empleado:" + nombreEmpleado + " es de $ " + salarioBruto);
        System.out.println("La decuccion por salud es: " + deduccionSalud);
        System.out.println("La decuccion por pension es: " + deduccionPension);
        System.out.println("Sus horas extras son:" + valorHorasExtras);
        System.out.println("El salario final corresponde a:"+ salarioNeto);

        } else {
            System.out.println("Le Faltan: " + (24 - cantidadHoras) + "horas de trabajo");
        }
    }
}
