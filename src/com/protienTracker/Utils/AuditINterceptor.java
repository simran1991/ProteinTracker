package com.protienTracker.Utils;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class AuditINterceptor extends EmptyInterceptor{

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
	System.out.println("updating data");
	//return true if we update state variable	
	return false;
	//	return super.onSave(entity, id, state, propertyNames, types);
	}

	@Override
	public void postFlush(Iterator entities) {
		// TODO Auto-generated method stub
		//super.postFlush(entities);
		System.out.println("flushing data");
	}

}
