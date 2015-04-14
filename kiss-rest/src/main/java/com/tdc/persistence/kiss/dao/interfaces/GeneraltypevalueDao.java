package com.tdc.persistence.kiss.dao.interfaces;

import com.tdc.persistence.kiss.dao.entity.Generaltypevalue;

public interface GeneraltypevalueDao extends GenericDAO<Generaltypevalue, String>{

	public Generaltypevalue findByValuCode(String gtvCode);
}
