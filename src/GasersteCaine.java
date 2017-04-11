/**
 * Created by Olimpia on 4/11/2017.
 */
public class GasersteCaine {

    static ObiectulCaine[] caini= new ObiectulCaine[3];

    public static void main(String[] args) {
        caini[0] = new ObiectulCaine("Patrocle", "4");
        caini[1] = new ObiectulCaine("Cutu", "3");
        caini[2] = new ObiectulCaine("Max", "8");

        for ( int i = 0; i<caini.length; i++){

            if (caini[i].getNume().equals("Max")){

                System.out.println( caini[i].getNume() + " are " + caini[i].getVarsta() + " ani.");
            }
        }


    }
}
