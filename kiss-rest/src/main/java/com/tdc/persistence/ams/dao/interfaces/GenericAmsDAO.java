/**
 * 
 */
package com.tdc.persistence.ams.dao.interfaces;

import java.io.Serializable;

/**
 * @author m54990
 *
 */
public interface GenericAmsDAO<T, I extends Serializable>{

	public T find(I id);
	public void delete(T obj);
	public void saveOrUpdate(T obj); 

}
 