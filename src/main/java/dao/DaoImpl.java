package dao;

import org.springframework.stereotype.Component;
//l'annotation annotationsSpring
@Component("dao") //creer moi un objet dao de cette classe
public class DaoImpl implements  IDao{

    @Override
    public double getData() {
        // se connecter à la base de donnees et recuperer la temperature
        System.out.println("version DATABASE");
        double temp = Math.random()*50;
        return temp;
    }
}
