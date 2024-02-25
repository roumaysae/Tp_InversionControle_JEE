package org.example.metier;

import org.example.dao.Bean;
import org.example.dao.Beans;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.List;

public class ContextXml {
    private String path;
    private List<Bean> beanList = new ArrayList<>();

    public ContextXml(String path) {
        this.path = path;
        loadAll();
    }

    public void loadAll() {
        try {
            JAXBContext context = JAXBContext.newInstance(Beans.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Beans beans = (Beans) unmarshaller.unmarshal(ContextXml.class.getResourceAsStream("/" + path));
            beanList.addAll(beans.getBeanList());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Bean> getBeanList() {
        return beanList;
    }
}
