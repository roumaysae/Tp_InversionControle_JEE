package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    //cette classe depend à l'interface IDao donc on utilise le couplage faible e
    // il y a pas de new pour ne pas etre au couplage fort
    private IDao iDao;

    @Override
    public double calcul() {
        double temp=iDao.getData();
        //par exemple
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }

    public IDao getiDao() {
        return iDao;
    }
//pour affecter une valeur à la variable IDao un objet d'une classe qui implemente IDao
// C-a-d Injecter dans la variable Dao un objet d'une classe qui implemente l'interface Dao
    public void setIDao(IDao iDao) {
        this.iDao = iDao;
    }
}
