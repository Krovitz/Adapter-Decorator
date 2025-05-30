package ejercicio1;

public class Main {
    public static void main(String[] args) {
        var comun = new Comun();
        var economico = new Economico();
        var motorElectrico = new MotorElectricoAdapter(new Electrico());
        var pruebasDeMotor = new ProbadorDeVehiculos();

        pruebasDeMotor.agregarVehiculo(comun);
        pruebasDeMotor.agregarVehiculo(economico);
        pruebasDeMotor.agregarVehiculo(motorElectrico);

        pruebasDeMotor.probarMotores();
    }
}