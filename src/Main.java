


import java.util.Scanner;

public class Main {

    static String[] agendaPersoane = new String[2];  // variabila globala
    static int index;

    public static void main(String[] args) {

        int optiune = -1;

        do {
            // userul vede un meniu si alege ceva
            // daca a ales iesire se termina
            // daca a ales afisare se afiseaza
            // daca a ales stergere se sterge

            optiune = readIntConsole("Alegeti ceva gen 1 pt afisare , 2 pt adaugare sau 7 pt iesire");

            if (optiune == 1)
                afisare();
            else if (optiune == 2) { // adaugare
                String numele = readStringConsole("Numele:");
                adaugare(numele);
            }
            else if (optiune == 3) { // cautare
                int indexFound;
                String numele = readStringConsole("Numele:");
                indexFound = cautare(numele);
                System.out.println(indexFound);
            }
            else if (optiune == 4) { // stergere
                String numele = readStringConsole("Numele:");
                stergere(numele);
            }

            else if (optiune == 5){ // modificare
                String numele = readStringConsole("Numele:");
                String noulNUme = readStringConsole("Noul nume:");
                modificare(numele,noulNUme);

            }
        }
        while (optiune != 7);
    }

    public static void afisare() {
        System.out.println("---afisare---");
        for (int i = 0; i < agendaPersoane.length; i++) {
            if (agendaPersoane[i] != null)
                System.out.println(agendaPersoane[i]);
        }
    }
    public static void adaugare(String nume) {

        if (index < agendaPersoane.length) {
            agendaPersoane[index] = nume;
            index++;
        } else {
            for (int i = 0; i < agendaPersoane.length; i++) {
                if (agendaPersoane[i] == null) {
                    agendaPersoane[i] = nume;
                    break;
                }

            }
        }
    }

    public static void modificare(String vechiulNume, String noulNUme) {

        int gasit = cautare(vechiulNume);
        if (gasit != -1)
            agendaPersoane[gasit] = noulNUme;
    }

    public static void stergere(String nume) {

        int gasit = cautare(nume);
        if (gasit != -1)
            agendaPersoane[gasit] = null;
    }

    public static int cautare(String nume) {

        int indexFound = -1;
        for (int i = 0; i < agendaPersoane.length; i++) {
            if (nume.equals(agendaPersoane[i])) {
                indexFound = i;
                // break;
            }
        }
        return indexFound;
    }


    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }
}