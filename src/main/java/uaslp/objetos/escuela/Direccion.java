package uaslp.objetos.escuela;

public class Direccion {

    private Direccion(){}

    private static class DirectionHolder{
        private static final Direccion INSTANCE = new Direccion();
    }

    public static Direccion getInstance(){
        return DirectionHolder.INSTANCE;
    }
}
