package com.tdc.component.bean;

import java.util.HashSet;

import java.util.Set;



public class CaseFolderVO {
	
	
	private String primcableunit;
	private Set<OfferVO> offers = new HashSet<OfferVO>();
	

	public Set<OfferVO> getOffers() {
		return offers;
	}
	public void setOffers(Set<OfferVO> offers) {
		this.offers = offers;
	}
	public String getPrimcableunit() {
		return primcableunit;
	}
	public void setPrimcableunit(String primcableunit) {
		this.primcableunit = primcableunit;
	}



	
	

}
