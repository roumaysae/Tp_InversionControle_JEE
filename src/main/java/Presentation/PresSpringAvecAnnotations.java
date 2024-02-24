package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAvecAnnotations {
    public static void main(String[] args) {
        //ici spring qui va lire et chercher s'il y a components dans les package dao et metier puis il va les instancier
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "dao","metier");
//et quand il trouve authowired il va injecter les dependances
        IMetier iMetier = applicationContext.getBean(IMetier.class); //donne moi l'objet metier de impelemente par IMetier
       // IMetier metier=(IMetier) applicationContext.getBean("metier"); //by name
        System.out.println(iMetier.calcul());//affichage de methode calcul
    }
}
