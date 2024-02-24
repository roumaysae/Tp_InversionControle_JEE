package Presentation;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller // alias
public class PresAvecSpringxml {
    public static void main(String[] args) {
        //l'objet de contexte qui va lire le fichier config.txt
        ApplicationContext springContext=new ClassPathXmlApplicationContext("" +
                "applicationContentdeconfig.xml");
        //donne moi le bean qui s'appel  metier donc c'est un objet de type IMetier
        IMetier metier=(IMetier) springContext.getBean("metier"); //by name
        //   IMetier metier2= springContext.getBean(IMetier.class); //by interface
        System.out.println("result:"+metier.calcul());
        // System.out.println("result:"+metier2.calcul());

    }
}

