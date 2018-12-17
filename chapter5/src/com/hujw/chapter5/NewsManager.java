package com.hujw.chapter5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class NewsManager {
    public static void main(String[] args) {
        Configuration conf=new Configuration().configure();
        ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
        Session sess=sf.openSession();
        Transaction tx=sess.beginTransaction();
        News n=new News();
        n.setTitle("胡家伟");
        n.setContent("http://www.baidu.com");
        sess.save(n);
        tx.commit();
        sess.close();
        sf.close();
    }
}
