package com.protienTracker.Utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.metamodel.source.MetadataImplementor;
import org.hibernate.service.spi.SessionFactoryServiceRegistry;

public class DefaultIntegrater implements Integrator {

	@Override
	public void disintegrate(SessionFactoryImplementor arg0, SessionFactoryServiceRegistry arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void integrate(Configuration arg0, SessionFactoryImplementor arg1, SessionFactoryServiceRegistry sessionFactoryServiceRegistry) {
		// TODO Auto-generated method stub
		EventListenerRegistry reg=sessionFactoryServiceRegistry.getService(EventListenerRegistry.class);
		reg.prependListeners(EventType.LOAD, new LoadEventListener());
		reg.prependListeners(EventType.SAVE_UPDATE, new LoadEventListener());
	}

	@Override
	public void integrate(MetadataImplementor arg0, SessionFactoryImplementor arg1,
			SessionFactoryServiceRegistry arg2) {
		// TODO Auto-generated method stub
		
	}

}
