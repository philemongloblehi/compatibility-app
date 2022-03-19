import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Compatibily APP
 */
public class Launcher {

    /**
     * Principale function
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listCaractereProfil1 = new ArrayList<>();
        List<String> listCaractereProfil2 = new ArrayList<>();
        List<String> listCaractereCommuns = new ArrayList<>();

        final int NOMBRE_CARACTERE = 5;

        System.out.println("******************************");
        System.out.println("*        Bienvenue           *");
        System.out.println("*  dans notre application    *");
        System.out.println("******************************");

        System.out.println("Veuillez saisir le nom du premier profil");
        String nomProfil1 = scanner.nextLine();
        for (int i = 1; i <= NOMBRE_CARACTERE; i++) {
            System.out.println("Veuillez saisir le caractère numéro " + i + " de " + nomProfil1);
            String caractere = scanner.nextLine();
            listCaractereProfil1.add(caractere);
        }

        System.out.println("Veuillez saisir le nom du second profil");
        String nomProfil2 = scanner.nextLine();
        for (int i = 1; i <= NOMBRE_CARACTERE; i++) {
            System.out.println("Veuillez saisir le caractère numéro " + i + " de " + nomProfil2);
            String caractere = scanner.nextLine();
            listCaractereProfil2.add(caractere);
        }

//        for (String caractereProfil1 : listCaractereProfil1) {
//            for (String caractereProfil2 : listCaractereProfil2) {
//                if (caractereProfil2.equals(caractereProfil1)) {
//                    listCaractereCommuns.add(caractereProfil1);
//                }
//            }
//        }
//        System.out.println("Les caractères communs entre " + nomProfil1 + " " + nomProfil2 + " sont :" + listCaractereCommuns);

        listCaractereCommuns = getCaractereCommuns(listCaractereProfil1, listCaractereProfil2);
        System.out.println("Les caractères communs entre " + nomProfil1 + " " + nomProfil2 + " sont :" + listCaractereCommuns);
    }

    public static List<String> getCaractereCommuns(List<String> listCaractereProfil1, List<String> listCaractereProfil2) {
        List<String> listCaractereCommuns = new ArrayList<>();
        for (String caractereProfil1 : listCaractereProfil1) {
            for (String caractereProfil2 : listCaractereProfil2) {
                if (caractereProfil2.equals(caractereProfil1)) {
                    listCaractereCommuns.add(caractereProfil1);
                }
            }
        }
        return listCaractereCommuns;
    }
}
