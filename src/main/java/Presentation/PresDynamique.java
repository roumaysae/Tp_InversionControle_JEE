package Presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
//injection dynamique
public class PresDynamique {
    public static void main(String[] args) throws Exception {

        //lire le ficher config.txt
        Scanner scanner = new Scanner(new File("config.txt"));

        //lire la premiere ligne de fichier c'est connaitre le nom de la classe :
        String daoClassName=scanner.nextLine();
        //avec l'instanciation dynamique
        Class cDao = Class.forName(daoClassName);//charger la classe au memoire
        //instancier la class :
        //cet objet est un objet de l'interface IDao car au niveau de fichier de config.txt on sait que toute les classe implemente une seul interface c'est Dao:
        IDao dao =(IDao) cDao.newInstance(); //fait appelle a un constructeur sans parametre

        /***** on va creer la meme demarche pour l'objet de la Metier *****/

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);//injection via constructor

//l'injection avec setDao on va la faire avec une maniere dynamique
//sans utiliser ceci pour avoir un code plus optimise //Method method=cMetier.getMethod("setIDao",IDao.class);
        //      method.invoke(metier,dao);//on execute la methode(j'invoke la methode setDao sur l'objet method et on transmet en parametre dao)

        System.out.println("res : "+metier.calcul());


    }
}
