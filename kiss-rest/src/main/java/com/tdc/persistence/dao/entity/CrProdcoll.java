package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CrProdcoll generated by hbm2java
 */
@Entity
@Table(name = "CR_PRODCOLL", schema = "PCRM")
public class CrProdcoll implements java.io.Serializable {

	private CrProdcollId id;
	private Productcollection productcollection;

	public CrProdcoll() {
	}

	public CrProdcoll(CrProdcollId id, Productcollection productcollection) {
		this.id = id;
		this.productcollection = productcollection;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "primproductcollection", column = @Column(name = "PRIMPRODUCTCOLLECTION", nullable = false, length = 19)),
			@AttributeOverride(name = "primproductspec", column = @Column(name = "PRIMPRODUCTSPEC", nullable = false, length = 50)) })
	public CrProdcollId getId() {
		return this.id;
	}

	public void setId(CrProdcollId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIMPRODUCTCOLLECTION", nullable = false, insertable = false, updatable = false)
	public Productcollection getProductcollection() {
		return this.productcollection;
	}

	public void setProductcollection(Productcollection productcollection) {
		this.productcollection = productcollection;
	}

}