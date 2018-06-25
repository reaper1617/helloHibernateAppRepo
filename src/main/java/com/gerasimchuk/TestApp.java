package com.gerasimchuk;

import com.gerasimchuk.dao.UsersEntityDAO;
import com.gerasimchuk.dao.UsersEntityDAOImpl;
import com.gerasimchuk.entities.UsersEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Collection;

public class TestApp {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        UsersEntityDAO usersDAO = new UsersEntityDAOImpl(factory);

//        usersDAO.create("Ivan", "Petrov", "748365743");
//
//        usersDAO.create("Fedor", "Sidorov", "5745743");
//        usersDAO.create("Dmitry", "Kisliy", "748365547");
//

    //   usersDAO.delete(2);

        usersDAO.update(3, "Pes", "Sheludivuj", "547");
        Collection<UsersEntity> c = usersDAO.getAll();
        for(UsersEntity user : c ){
            System.out.println(user.getId() + " " + user.getUname());
        }


        factory.close();

    }
}
