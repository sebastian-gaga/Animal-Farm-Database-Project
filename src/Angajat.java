/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebya
 */
//Clasa Angajat este utilizata exclusiv pentru a afisa datele in timp real in interfata
class Angajat {
    private String Nume, Prenume, CNP, Salariu, NrTelefon;
    
    public Angajat(String Nume, String Prenume, String CNP, String Salariu, String NrTelefon){

    this.Nume = Nume;
    this.Prenume = Prenume;
    this.CNP = CNP;
    this.Salariu = Salariu;
    this.NrTelefon = NrTelefon;
    }
    
    public String getNume(){
    return Nume;}
    
    public String getPrenume(){
    return Prenume;}
    
    public String getCNP(){
    return CNP;}
    
    public String getSalariu(){
    return Salariu;}
    
    public String getNrTelefon(){
    return NrTelefon;}
    
    
}
