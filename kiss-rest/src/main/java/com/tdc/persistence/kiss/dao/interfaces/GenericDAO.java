/**
 * 
 */
package com.tdc.persistence.kiss.dao.interfaces;

import java.io.Serializable;

/**
 * @author m54990
 *
 */
public interface GenericDAO<T, I extends Serializable>{

	public T find(I id);
	public void delete(T obj);
	public void saveOrUpdate(T obj);	
	public T save(T Obj);

}
 