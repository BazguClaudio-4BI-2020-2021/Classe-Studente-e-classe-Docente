package oop;

public class Docente {
    private String nome;
    private String cognome;
    private String materia;
    public Docente(){
        nome = null;
        cognome = null;
        materia = null;
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
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia; 
    }
    @Override
    public String toString() {
        String stringa;
        stringa = nome + " " + cognome + " insegna: "+ materia ;
        return stringa;
    }
}
