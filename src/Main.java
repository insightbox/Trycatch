import java.nio.file.LinkPermission;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        /*String msg = ("Entrez l'indice de l'entier à diviser: ");

        x = sc.nextInt();
        int x = readInteger(msg, 0, 9);

        System.out.println("Entrez le diviseur");

        int y = sc.nextInt();
        int result = (x / y);

        System.out.println("Le résultat de la division est : " + result);


    public static int readInteger(String message, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);*/

            String message = "";

        while (true) {

            message = ("Entrez l'indice de l'entier à diviser: ");
            x = readInteger(message,tableau.length-1);
            System.out.println("Entrez le diviseur");
            y = sc.nextInt();

            try {
                System.out.println("Le résultat de la division est : " + Division(x,y));
                break;
            } catch (ArithmeticException e){
                System.out.println("Le chiffre ne peut être divisé par 0");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Vous devez entrer un chiffre entre 0 et 9");
            }
            catch (Exception e){
                System.out.println("Parent Exception occurs"); //??
            }
            System.out.println("Recommencez!");

                /*int result = Integer.parseInt(sc.nextLine());
                if (result >= 1 && result <= 10) {
                    return result;
                } else {
                    //throw new IllegalStateException("La valeur doit être comprise entre 0 et 10" + result);
                }
            } catch (RuntimeException e) {
                System.err.println("Une erreur est survenue: ");
                System.out.println(message);
            }*/
        }
    }
    static int Division(int indice, int diviseur)
    {
        return tableau[indice] / diviseur;
    }
    public static int readInteger(String message, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                } else {
                    throw new IllegalStateException("La valeur doit être comprise entre " + min + " et " + max + ": " + result);
                }

            } catch (InputMismatchException e) {
                System.err.println("Une erreur est survenue. La valeur entrée doit être un entier: ");
                System.out.println(message);
            }
            catch (RuntimeException e){
                System.err.println("Une erreur est survenue. " +e);
                System.out.println(message);
            }

        }
    }
}
