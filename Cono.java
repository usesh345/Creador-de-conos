/**
 * The type Cono.
 */
public class Cono {
    private double radioBase;
    private double altura;

    /**
     * Instantiates a new Cono.
     */
    public Cono() {}

    /**
     * Instantiates a new Cono.
     *
     * @param radioBase the radio base
     * @param altura    the altura
     */
    public Cono(double radioBase, double altura) {
        this.radioBase = radioBase;
        this.altura = altura;
    }

    /**
     * Gets radio base.
     *
     * @return the radio base
     */
    public double getRadioBase() {
        return radioBase;
    }

    /**
     * Sets radio base.
     *
     * @param radioBase the radio base
     */
    public void setRadioBase(double radioBase) {
        this.radioBase = radioBase;
    }

    /**
     * Gets altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Sets altura.
     *
     * @param altura the altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcular area base double.
     *
     * @param radioBase the radio base
     * @return the double
     */
    public double calcularAreaBase(double radioBase) {
        return Math.PI * radioBase * radioBase;
    }

    /**
     * Calcular volumen double.
     *
     * @param radioBase the radio base
     * @param altura    the altura
     * @return the double
     */
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

