package com.tdc.persistence.ams.dao.entity;

// Generated 09-04-2015 18:59:20 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PostnummerfilId generated by hbm2java
 */
@Embeddable
public class PostnummerfilId implements java.io.Serializable {

	private String postnr;
	private String bynavn;
	private String gade;
	private String firma;
	private String provins;
	private String land;

	public PostnummerfilId() {
	}

	public PostnummerfilId(String postnr, String bynavn, String gade,
			String firma, String provins, String land) {
		this.postnr = postnr;
		this.bynavn = bynavn;
		this.gade = gade;
		this.firma = firma;
		this.provins = provins;
		this.land = land;
	}

	@Column(name = "POSTNR", length = 4)
	public String getPostnr() {
		return this.postnr;
	}

	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}

	@Column(name = "BYNAVN", length = 40)
	public String getBynavn() {
		return this.bynavn;
	}

	public void setBynavn(String bynavn) {
		this.bynavn = bynavn;
	}

	@Column(name = "GADE", length = 40)
	public String getGade() {
		return this.gade;
	}

	public void setGade(String gade) {
		this.gade = gade;
	}

	@Column(name = "FIRMA", length = 100)
	public String getFirma() {
		return this.firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	@Column(name = "PROVINS", length = 5)
	public String getProvins() {
		return this.provins;
	}

	public void setProvins(String provins) {
		this.provins = provins;
	}

	@Column(name = "LAND", length = 1)
	public String getLand() {
		return this.land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PostnummerfilId))
			return false;
		PostnummerfilId castOther = (PostnummerfilId) other;

		return ((this.getPostnr() == castOther.getPostnr()) || (this
				.getPostnr() != null && castOther.getPostnr() != null && this
				.getPostnr().equals(castOther.getPostnr())))
				&& ((this.getBynavn() == castOther.getBynavn()) || (this
						.getBynavn() != null && castOther.getBynavn() != null && this
						.getBynavn().equals(castOther.getBynavn())))
				&& ((this.getGade() == castOther.getGade()) || (this.getGade() != null
						&& castOther.getGade() != null && this.getGade()
						.equals(castOther.getGade())))
				&& ((this.getFirma() == castOther.getFirma()) || (this
						.getFirma() != null && castOther.getFirma() != null && this
						.getFirma().equals(castOther.getFirma())))
				&& ((this.getProvins() == castOther.getProvins()) || (this
						.getProvins() != null && castOther.getProvins() != null && this
						.getProvins().equals(castOther.getProvins())))
				&& ((this.getLand() == castOther.getLand()) || (this.getLand() != null
						&& castOther.getLand() != null && this.getLand()
						.equals(castOther.getLand())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPostnr() == null ? 0 : this.getPostnr().hashCode());
		result = 37 * result
				+ (getBynavn() == null ? 0 : this.getBynavn().hashCode());
		result = 37 * result
				+ (getGade() == null ? 0 : this.getGade().hashCode());
		result = 37 * result
				+ (getFirma() == null ? 0 : this.getFirma().hashCode());
		result = 37 * result
				+ (getProvins() == null ? 0 : this.getProvins().hashCode());
		result = 37 * result
				+ (getLand() == null ? 0 : this.getLand().hashCode());
		return result;
	}

}
