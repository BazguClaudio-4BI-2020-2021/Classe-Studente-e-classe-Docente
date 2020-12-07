package oop;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Studente stu1 = new Studente();
        Studente stu2 = new Studente();
        Docente doc1 = new Docente();
        Docente doc2 = new Docente();
        Scanner inp = new Scanner(System.in);
        String nome, cognome, indirizzo, materia;

        //STUDENTE 1
        System.out.println("Studente 1");
        System.out.println("inserire nome: ");
        nome = inp.nextLine();
        stu1.setNome(nome);
        stu1.getNome();
        System.out.println("inserire cognome: ");
        cognome = inp.nextLine();
        stu1.setCognome(cognome);
        stu1.getCognome();
        System.out.println("inserire l'indirizzo scolastico: ");
        indirizzo = inp.nextLine();
        stu1.setIndirizzo(indirizzo);
        stu1.getIndirizzo();
        System.out.println("Studente 1: " + stu1);

        //STUDENTE 2
        System.out.println("Studente 2");
        System.out.println("inserire nome ");
        nome = inp.nextLine();
        stu2.setNome(nome);
        stu2.getNome();
        System.out.println("inserire cognome ");
        cognome = inp.nextLine();
        stu2.setCognome(cognome);
        stu2.getCognome();
        System.out.println("inserire l'indirizzo scolastico: ");
        indirizzo = inp.nextLine();
        stu2.setIndirizzo(indirizzo);
        stu2.getIndirizzo();
        System.out.println("Studente 2: " + stu2);

        //DOCENTE 1
        System.out.println("Docente 1");
        System.out.println("inserire nome: ");
        nome = inp.nextLine();
        doc1.setNome(nome);
        doc1.getNome();
        System.out.println("inserire cognome: ");
        cognome = inp.nextLine();
        doc1.setCognome(cognome);
        doc1.getCognome();
        System.out.println("inserire la materia che insegna: ");
        materia = inp.nextLine();
        doc1.setMateria(materia);
        doc1.getMateria();
        System.out.println("Docente 1 " + doc1);

        //DOCENTE 2
        System.out.println("Docente 2");
        System.out.println("inserire nome: ");
        nome = inp.nextLine();
        doc2.setNome(nome);
        doc2.getNome();
        System.out.println("inserire cognome: ");
        cognome = inp.nextLine();
        doc2.setCognome(cognome);
        doc2.getCognome();
        System.out.println("inserire la materia che insegna: ");
        materia = inp.nextLine();
        doc2.setMateria(materia);
        doc2.getMateria();
        System.out.println("Docente 2 " + doc2);
    }
}
