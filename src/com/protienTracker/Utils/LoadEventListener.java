package com.protienTracker.Utils;

import org.hibernate.HibernateException;
import org.hibernate.event.internal.DefaultLoadEventListener;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.PostCommitDeleteEventListener;
import org.hibernate.event.spi.PostDeleteEvent;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEventListener;
import org.hibernate.persister.entity.EntityPersister;

public class LoadEventListener implements  org.hibernate.event.spi.LoadEventListener,SaveOrUpdateEventListener,PostCommitDeleteEventListener {

	@Override
	public void onLoad(LoadEvent event, LoadType loadType) throws HibernateException {

		System.out.println("ENtity loaded and ready to fire :) :) :)");
		System.out.println(event.getEntityId());
		//super.onLoad(event, loadType);
	}

	@Override
	public void onSaveOrUpdate(SaveOrUpdateEvent arg0) throws HibernateException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPostDelete(PostDeleteEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean requiresPostCommitHanding(EntityPersister arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onPostDeleteCommitFailed(PostDeleteEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
