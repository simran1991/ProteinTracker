package com.protienTracker.JoinTable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {

		private static SessionFactory sessionFactory;
		
		static{
			Configuration config=new Configuration().configure();
			sessionFactory=config.buildSessionFactory();
		}

		public static SessionFactory getSessionFactory(){
			return sessionFactory;
		}
}
