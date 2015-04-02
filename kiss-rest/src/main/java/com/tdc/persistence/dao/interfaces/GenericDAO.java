/**
 * 
 */
package com.tdc.persistence.dao.interfaces;

import java.io.Serializable;

/**
 * @author m54990
 *
 */
public interface GenericDAO<T, I extends Serializable>{

	public T find(I id);
	public void delete(T obj);
	public void saveOrUpdate(T obj); 

}
 