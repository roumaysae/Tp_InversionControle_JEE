package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecAnnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "dao","metier");
        IMetier iMetier = applicationContext.getBean(IMetier.class);
        System.out.println(iMetier.calcul());
    }
}
