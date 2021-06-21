/**
 *
 * @author sebya
 */
//Clasa Incinta este utilizata exclusiv pentru a afisa datele in timp real in interfata
class Incinta {

    private String Denumire, Capacitate;
    
    public Incinta (String Denumire, String Capacitate){
        this.Denumire = Denumire;
        this.Capacitate = Capacitate;
    }
    
    
    public String getDenumire(){
        return Denumire;}
    
    public String getCapacitate(){
        return Capacitate;}
}
