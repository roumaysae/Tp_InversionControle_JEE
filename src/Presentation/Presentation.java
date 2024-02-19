package Presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        //injection statique
        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl metier = new IMetierImpl();
        //l'injection en utilisant le setter
        metier.setIDao(dao);
        System.out.println("Le resultat : "+metier.calcul());

    }
}
