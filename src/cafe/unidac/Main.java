package cafe.unidac;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
        CafeUnidacController cafeUnidacController = new CafeUnidacController();
        
     

        CafeUnidac cafe1 = new CafeUnidac("lucas", "125.284.171-30", "coca-cola", "25/11/2023");
        CafeUnidac cafe2 = new CafeUnidac("João", "772.942.860-13", "Presunto", "27/11/2023");

        System.out.println(cafeUnidacController.adicionarCafeUnidac(cafe1) + "\n");
        System.out.println(cafeUnidacController.adicionarCafeUnidac(cafe2) + "\n");

        List<CafeUnidac> cafeUnidacList = cafeUnidacController.listarCafeUnidac();
        System.out.println("Lista do Café da Manhã:");
        cafeUnidacList.forEach(System.out::println);

        CafeUnidac cafe3 = new CafeUnidac("Cecilia", "270.996.149-02", "Pão", "25/11/2023");
        System.out.println("\n" + cafeUnidacController.adicionarCafeUnidac(cafe3) + "\n");

        cafeUnidacList = cafeUnidacController.listarCafeUnidac();
        System.out.println("Lista do Café da Manhã:");
        cafeUnidacList.forEach(System.out::println);

        CafeUnidac cafe4 = new CafeUnidac("Jeferson", "111.222.333-44", "Bolo", "27/11/2023");
        System.out.println("\n" + cafeUnidacController.adicionarCafeUnidac(cafe4) + "\n");

        cafeUnidacList = cafeUnidacController.listarCafeUnidac();
        System.out.println("Lista do Café da Manhã:");
        cafeUnidacList.forEach(System.out::println);
    }
}
