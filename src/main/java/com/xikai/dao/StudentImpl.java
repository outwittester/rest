package com.xikai.dao;

import com.xikai.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by xikaixiong on 3/5/17.
 */
public class StudentImpl implements StudentDao {
    private static SessionFactory sessionFactory ;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentById(int id) {
        Session session = sessionFactory.openSession();
        String hql = "from Student where id =:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List list = query.list();
        Student student = (Student) list.get(0);
        session.close();
        return student;
    }


}
