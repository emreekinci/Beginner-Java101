public class Test {
    public static void main(String[] args) {

        // object : araba1
        Araba araba1 = new Araba(); // Araba() is a default constructor

        araba1.setModel("Renault");
        System.out.println("Arabanin modeli : " + araba1.getModel());

        araba1.setRenk("Lacivert");
        System.out.println("Araba renk : "+araba1.getRenk());


        araba1.setKapilar(-4);

        araba1.setKapilar(4);
        System.out.println("Kapi sayisi : "+araba1.getKapilar());

/*
        Araba araba2;

        araba2.setKapilar(10);

 */
/*
        Araba araba3 = null;

        araba3.setModel("Renault");

 */
    }
}
