public class Cono {
    private double radioBase;
    private double altura;

    public Cono() {}

    public Cono(double radioBase, double altura) {
        this.radioBase = radioBase;
        this.altura = altura;
    }

    public double getRadioBase() {
        return radioBase;
    }

    public void setRadioBase(double radioBase) {
        this.radioBase = radioBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularAreaBase(double radioBase) {
        return Math.PI * radioBase * radioBase;
    }

    public double calcularVolumen(double radioBase, double altura) {
        return (Math.PI * radioBase * radioBase * altura) / 3;
    }

    @Override
    public String toString() {
        return "Cono{" +
                "radioBase=" + radioBase +
                ", altura=" + altura +
                '}';
    }
}

