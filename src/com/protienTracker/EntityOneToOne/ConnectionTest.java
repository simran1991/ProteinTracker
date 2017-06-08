package com.protienTracker.EntityOneToOne;

import java.util.Date;

import org.hibernate.Session;

public class ConnectionTest {
	public static void main(String[] args) {
		Session session= HibernateUtils.getSessionFactory().openSession();
		/*Users user=new Users();
		user.setName("Simranjit");
		user.setGoal(250);
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		session.beginTransaction();
		
		//Users loadedUser=(Users) session.load(Users.class, 1); if use load then hibernate gives exception if ID  not exist in db
		Users loadedUser=(Users) session.get(Users.class, 1);//using get hibernate returns the null object if id doesnot exists in DB
		System.out.println(loadedUser.getName());
		System.out.println(loadedUser.getGoal());
		//we can also update the object in same transaction using the loaded object because hibernate maintains the object proxy loaded from db
		loadedUser.setTotal(loadedUser.getTotal()+100);

		session.getTransaction().commit();*/
		
		//using components in hibernate
		session.beginTransaction();
		Users user=new Users();
		user.setName("Simranjit");
		user.addHistory(new UserHistory(new Date(),"setting name to simran"));
		
		user.getProteinData().setGoal(200);
		user.getProteinData().setTotal(100);
		user.addHistory(new UserHistory(new Date(),"setting goal to 300"));
		
		session.save(user);
		
		Users loadedUser=(Users) session.get(Users.class, 1);
		System.out.println(loadedUser.getName());
		System.out.println(loadedUser.getProteinData().getTotal());
		for(UserHistory history :loadedUser.getHistory()){
			System.out.println(history.getTimestamp().toString()+":"+history.getEntry());
		};
		
		session.getTransaction().commit();
 
		session.close();

		HibernateUtils.getSessionFactory().close();
	}
}
