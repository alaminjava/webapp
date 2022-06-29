/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author APCL-LAB-1
 */
public class studentDAO {

    public void doAdd(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(st);
        s.getTransaction().commit();
        s.close();
    }

    public void doUpdate(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(st);
        s.getTransaction().commit();
        s.close();
    }

    public void doDelete(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(st);
        s.getTransaction().commit();
        s.close();
    }

    public List<Student> doShow(Student st) {
        List<Student> list = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q =s.createQuery("FROM Student");
        list=q.list();
        return list;
    }
        public List<Student> doShowById(Student st) {
        List<Student> list = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q =s.createQuery("FROM Student s where s.sid =:sid");
        q.setParameter("sid", st.getSid());
        list=q.list();
        return list;
    }

}
