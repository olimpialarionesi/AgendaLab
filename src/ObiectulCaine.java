/**
 * Created by Olimpia on 4/8/2017.
 */
//facem obiectul caine
    //nume si varsta

public class ObiectulCaine {
    private String nume;
    private String varsta;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    ObiectulCaine( String nume, String varsta){

        this.nume = nume;
        this.varsta  = varsta;

    }
}
/*pubilc class ObiectulCaine{
private String nume;
private String varsta;
public String getNume(){ return nume;}
public void setNume(String nume){ this.nume = nume;}
pubic string getVarsta() {return varsta;}

public void setVarsta(String varsta) { this.varsta = varsta;}

ObiectulCaine ( String nume, String varsta){
this.nume = nume;
this.varsta = varsta;

 */