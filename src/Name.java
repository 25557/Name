import java.util.Scanner;

public class Name {
    public static void main(String args[]) {

        // naam
        System.out.println("Vul hier je voornaam in:");
        Scanner scanner = new Scanner(System.in);
        String naam =  scanner.nextLine();

        // leeftijd
        System.out.println("Vul hier je leeftijd in:");
        String leeftijd =  scanner.nextLine();

        // Kleur ogen
        System.out.println("Vul hier in wat voor kleur ogen je hebt:");
        String ogen = scanner.nextLine();

        // postcode
        System.out.println("Vul hier je postcode in:");
        String postcode =  scanner.nextLine();

        // woonplaats
        System.out.println("Vul hier je woonplaats in:");
        String woonplaats = scanner.nextLine();

        // eindtekst
        System.out.println("Hallo " + naam + ", jij bent " + leeftijd + " jaar oud" + " en je hebt "+ ogen + "e ogen. Jouw postcode is " + postcode + " en je woont in " + woonplaats + " ." );


    }
}
