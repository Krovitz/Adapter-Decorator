package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ProbadorDeVehiculos {
    private List<Motor> vehiculos = new ArrayList<>();

    public ProbadorDeVehiculos() {
    }

    public void agregarVehiculo(Motor unVehiculo) {
        vehiculos.add(unVehiculo);
    }

    public void probarMotores() {
        for (Motor m : vehiculos) {
            m.arrancar();
            m.acelerar();
            m.frenar();
            System.out.println();
        }
    }
}
