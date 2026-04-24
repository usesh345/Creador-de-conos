/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Cono cono1 = new Cono(3,4);
        System.out.println("Cono 1: " + cono1);
        System.out.println("Área base: " + cono1.calcularAreaBase(cono1.getRadioBase()));
        System.out.println("Volumen: " + cono1.calcularVolumen(cono1.getRadioBase(), cono1.getAltura()));

        Cono cono2 = new Cono(5,6);
        System.out.println("Cono 2: " + cono2);
        System.out.println("Área base: " + cono2.calcularAreaBase(cono2.getRadioBase()));
        System.out.println("Volumen: " + cono2.calcularVolumen(cono2.getRadioBase(), cono2.getAltura()));

        Cono cono3 = new Cono(4,7);
        System.out.println("Cono 3: " + cono3);
        System.out.println("Área base: " + cono3.calcularAreaBase(cono3.getRadioBase()));
        System.out.println("Volumen: " + cono3.calcularVolumen(cono3.getRadioBase(), cono3.getAltura()));

        Cono cono4 = new Cono(6,5);
        System.out.println("Cono 4: " + cono4);
        System.out.println("Área base: " + cono4.calcularAreaBase(cono4.getRadioBase()));
        System.out.println("Volumen: " + cono4.calcularVolumen(cono4.getRadioBase(), cono4.getAltura()));
    }
}

