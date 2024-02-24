package Presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class PresentationStatique {
    public static void main(String[] args) {
        //injection statique
        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl metier = new IMetierImpl(dao);//injection via constructeur
        //l'injection en utilisant le setter
        //DONC SANS utiliser setter because of the constructor metier.setIDao(dao);
        System.out.println("Le resultat : "+metier.calcul());

    }
}
