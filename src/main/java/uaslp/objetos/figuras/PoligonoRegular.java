package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public double getArea(){
        return (getPerimetro() * getApotema())/2;
    }

    private double getPerimetro(){
        return lado * numeroDeLados;
    }

    private double getApotema(){
        return (lado/2)/Math.tan(getAnguloCentral()/2);
    }

    private double getAnguloCentral(){
        return Math.toRadians((double)360/numeroDeLados);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}