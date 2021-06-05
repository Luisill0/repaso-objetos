package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    protected double base;
    protected double altura;
    protected String description;
    protected String name;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.description = "Cualquier triangulo";
        this.name = "Triangulo";
    }

    public Triangulo(){
        this.description = "Cualquier triangulo";
        this.name = "Triangulo";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return (base*altura)/2;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
