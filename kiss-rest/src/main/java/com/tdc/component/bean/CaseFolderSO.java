package com.tdc.component.bean;

import java.util.HashSet;
import java.util.Set;

import com.tdc.persistence.dao.entity.Casetype;
import com.tdc.persistence.dao.entity.Salestype;



public class CaseFolderSO {
	
	private String id;
	private String primcableunit;
	/** Case Number 
	private CaseTypeSO casetype; **/
	private String sagsnr;
	private SalesTypeSO salestype;
	
	

	
	
	

	
	
	private Set<OfferSO> offers = new HashSet<OfferSO>();
	

	public Set<OfferSO> getOffers() {
		return offers;
	}
	public void setOffers(Set<OfferSO> offers) {
		this.offers = offers;
	}
	public String getPrimcableunit() {
		return primcableunit;
	}
	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public SalesTypeSO getSalestype() {
		return salestype;
	}
	public void setSalestype(SalesTypeSO salestype) {
		this.salestype = salestype;
	}
//	public CaseTypeSO getCasetype() {
//		return casetype;
//	}
//	public void setCasetype(CaseTypeSO casetype) {
//		this.casetype = casetype;
//	}
	public String getSagsnr() {
		return sagsnr;
	}
	public void setSagsnr(String sagsnr) {
		this.sagsnr = sagsnr;
	}


	





	
	

}
