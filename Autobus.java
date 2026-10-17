public class Autobus{
    
    private String kennzeichen;
    private int baujahr;
    private boolean anhänger;
    
    public Autobus(String neuKennzeichen, int neuBaujahr, boolean neuAnhänger){
        setKennzeichen(neuKennzeichen);
        setBaujahr(neuBaujahr);
        setAnhänger(neuAnhänger);
        // Kommentar ERWEITERT
    }
    
    public String getKennzeichen (){
        return kennzeichen;
    }
    
    public int getBaujahr (){
        return baujahr;
    }
    
    public boolean getAnhänger (){
        return anhänger;
    }
    
    public void setKennzeichen (String neuKennzeichen){
        kennzeichen = neuKennzeichen;
    }
    
    public void setBaujahr (int neuBaujahr){
        baujahr = neuBaujahr;
    }
    
    public void setAnhänger (boolean neuAnhänger){
        anhänger = neuAnhänger;
    }
}