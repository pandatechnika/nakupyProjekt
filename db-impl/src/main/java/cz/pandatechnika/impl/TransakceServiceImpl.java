package cz.pandatechnika.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import cz.pandatechnika.api.Transakce;
import cz.pandatechnika.api.TransakceService;


public class TransakceServiceImpl implements TransakceService{
	
	protected SessionFactory sf;
	
	
	
	public void create(Transakce item){
		
		
		sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}
	
	public void delete(Transakce item){
		
		sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(item);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
	protected void exit(){
		sf.close();
	}
	
}
