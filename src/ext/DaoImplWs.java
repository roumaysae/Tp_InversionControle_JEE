package ext;

import dao.IDao;

public class DaoImplWs implements IDao {
    @Override
    public double getData() {
        System.out.println("Web service Version");
        return 0;
    }
}
