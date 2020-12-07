package oop;

public class Studente {
    private String nome;
    private String cognome;
    private String indirizzo;
    public Studente(){
        nome = null;
        cognome = null;
        indirizzo = null;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome; 
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public String getCognome(){
        return cognome; 
    }
    public void setIndirizzo(String indirizzo){
        this.indirizzo = indirizzo;
    }
    public String getIndirizzo(){
        return indirizzo; 
    }
    @Override
    public String toString() {
        String stringa;
        stringa = nome + " " + cognome + " dell'indirizzo: "+ indirizzo ;
        return stringa;
    }
}
