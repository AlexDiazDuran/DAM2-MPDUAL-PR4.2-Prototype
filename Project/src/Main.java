import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

//-------------------Forn-------------------
        Forn forn = new Forn();
        forn.nom = "Forn1";
        forn.color = "Gris";
        forn.preu = 30.99;
        forn.marca = "mforn";
        forn.eficiencia = "70";
        forn.temperatura = 450;
        forn.autoneteja = true;
        llista.add(forn);

        Forn anotherForn = (Forn) forn.clone();
        llista.add(anotherForn);



//-------------------Nevera-------------------

        Nevera nevera = new Nevera();
        nevera.nom = "Nevera1";
        nevera.color = "Blanca";
        nevera.preu = 99.99;
        nevera.marca = "mnevera";
        nevera.eficiencia = "85";
        nevera.frigories = 6500;
        nevera.soroll = 40;
        llista.add(nevera);

        Nevera anotherNevera= (Nevera) nevera.clone();
        llista.add(anotherNevera);



//-------------------Rentadora-------------------

        Rentadora rentadora = new Rentadora();
        rentadora.nom = "rentadora1";
        rentadora.color = "negra";
        rentadora.preu = 101.99;
        rentadora.marca = "mrentadora";
        rentadora.eficiencia = "90";
        rentadora.revolucions = 7000;
        rentadora.soroll = 70;
        llista.add(rentadora);

        Rentadora anotherRentadora= (Rentadora) rentadora.clone();
        llista.add(anotherRentadora);


        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

        System.out.println("Comparar amb la llista clonada però invertida:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(llista.size() - i - 1));
        }


}
static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els electrodomestics NO són identics");
            }
        }
    } 
}
