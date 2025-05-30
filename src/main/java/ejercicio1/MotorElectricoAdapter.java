package ejercicio1;

public class MotorElectricoAdapter implements Motor {
    private Electrico motorElectrico;

    public MotorElectricoAdapter(Electrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }


    @Override
    public void arrancar() {
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void frenar() {
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
