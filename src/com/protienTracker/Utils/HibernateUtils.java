package com.protienTracker.Utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {

		private static SessionFactory sessionFactory;
		private static ServiceRegistry serviceRegistry;
		
		static{
			try{
				Configuration config=new Configuration().setInterceptor(new AuditINterceptor()).configure();
				serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
				sessionFactory=config.buildSessionFactory(serviceRegistry);
			}
			catch(HibernateException exp){
				System.out.println("Problem creating session factory !!");
				throw exp;
			}
		}

		public static SessionFactory getSessionFactory(){
			return sessionFactory;
		}
		
		private HibernateUtils(){
			
		}
}
