package uaslp.objetos.escuela;

public class SalaA extends SalaDeJuntas{

    private SalaA(){
        this.nombre = "Sala A";
    }

    private static class SalaAHolder{
        private static final SalaA INSTANCE = new SalaA();
    }

    public static SalaA getInstance(){
        return SalaAHolder.INSTANCE;
    }
}
