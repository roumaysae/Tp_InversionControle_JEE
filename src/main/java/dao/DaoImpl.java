package dao;

public class DaoImpl implements  IDao{

    @Override
    public double getData() {
        // se connecter à la base de donnees et recuperer la temperature
        System.out.println("version DATABASE");
        double temp = Math.random()*50;
        return temp;
    }
}
