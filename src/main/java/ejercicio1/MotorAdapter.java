package ejercicio1;

public class MotorAdapter implements Motor {
    private Electrico motorElectrico;

    public MotorAdapter(Electrico motorElectrico) {
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
