package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VActivePricesId generated by hbm2java
 */
@Embeddable
public class VActivePricesId implements java.io.Serializable {

	private String productcode;
	private String productname;
	private String anlxg;
	private BigDecimal errorcode;
	private Date calculatedon;
	private BigDecimal totalprice;
	private BigDecimal packageprice;
	private BigDecimal discount;
	private BigDecimal tvroyality;
	private BigDecimal radioroyality;
	private BigDecimal copyrights;
	private BigDecimal vat;
	private BigDecimal groupindex;

	public VActivePricesId() {
	}

	public VActivePricesId(String productcode, String productname,
			BigDecimal errorcode, Date calculatedon, BigDecimal totalprice,
			BigDecimal packageprice, BigDecimal discount,
			BigDecimal tvroyality, BigDecimal radioroyality,
			BigDecimal copyrights, BigDecimal vat) {
		this.productcode = productcode;
		this.productname = productname;
		this.errorcode = errorcode;
		this.calculatedon = calculatedon;
		this.totalprice = totalprice;
		this.packageprice = packageprice;
		this.discount = discount;
		this.tvroyality = tvroyality;
		this.radioroyality = radioroyality;
		this.copyrights = copyrights;
		this.vat = vat;
	}

	public VActivePricesId(String productcode, String productname,
			String anlxg, BigDecimal errorcode, Date calculatedon,
			BigDecimal totalprice, BigDecimal packageprice,
			BigDecimal discount, BigDecimal tvroyality,
			BigDecimal radioroyality, BigDecimal copyrights, BigDecimal vat,
			BigDecimal groupindex) {
		this.productcode = productcode;
		this.productname = productname;
		this.anlxg = anlxg;
		this.errorcode = errorcode;
		this.calculatedon = calculatedon;
		this.totalprice = totalprice;
		this.packageprice = packageprice;
		this.discount = discount;
		this.tvroyality = tvroyality;
		this.radioroyality = radioroyality;
		this.copyrights = copyrights;
		this.vat = vat;
		this.groupindex = groupindex;
	}

	@Column(name = "PRODUCTCODE", nullable = false, length = 20)
	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	@Column(name = "PRODUCTNAME", nullable = false, length = 40)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "ANLXG", length = 10)
	public String getAnlxg() {
		return this.anlxg;
	}

	public void setAnlxg(String anlxg) {
		this.anlxg = anlxg;
	}

	@Column(name = "ERRORCODE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getErrorcode() {
		return this.errorcode;
	}

	public void setErrorcode(BigDecimal errorcode) {
		this.errorcode = errorcode;
	}

	@Column(name = "CALCULATEDON", nullable = false, length = 7)
	public Date getCalculatedon() {
		return this.calculatedon;
	}

	public void setCalculatedon(Date calculatedon) {
		this.calculatedon = calculatedon;
	}

	@Column(name = "TOTALPRICE", nullable = false, precision = 32, scale = 16)
	public BigDecimal getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	@Column(name = "PACKAGEPRICE", nullable = false, precision = 32, scale = 16)
	public BigDecimal getPackageprice() {
		return this.packageprice;
	}

	public void setPackageprice(BigDecimal packageprice) {
		this.packageprice = packageprice;
	}

	@Column(name = "DISCOUNT", nullable = false, precision = 32, scale = 16)
	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Column(name = "TVROYALITY", nullable = false, precision = 32, scale = 16)
	public BigDecimal getTvroyality() {
		return this.tvroyality;
	}

	public void setTvroyality(BigDecimal tvroyality) {
		this.tvroyality = tvroyality;
	}

	@Column(name = "RADIOROYALITY", nullable = false, precision = 32, scale = 16)
	public BigDecimal getRadioroyality() {
		return this.radioroyality;
	}

	public void setRadioroyality(BigDecimal radioroyality) {
		this.radioroyality = radioroyality;
	}

	@Column(name = "COPYRIGHTS", nullable = false, precision = 32, scale = 16)
	public BigDecimal getCopyrights() {
		return this.copyrights;
	}

	public void setCopyrights(BigDecimal copyrights) {
		this.copyrights = copyrights;
	}

	@Column(name = "VAT", nullable = false, precision = 32, scale = 16)
	public BigDecimal getVat() {
		return this.vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	@Column(name = "GROUPINDEX", precision = 22, scale = 0)
	public BigDecimal getGroupindex() {
		return this.groupindex;
	}

	public void setGroupindex(BigDecimal groupindex) {
		this.groupindex = groupindex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VActivePricesId))
			return false;
		VActivePricesId castOther = (VActivePricesId) other;

		return ((this.getProductcode() == castOther.getProductcode()) || (this
				.getProductcode() != null && castOther.getProductcode() != null && this
				.getProductcode().equals(castOther.getProductcode())))
				&& ((this.getProductname() == castOther.getProductname()) || (this
						.getProductname() != null
						&& castOther.getProductname() != null && this
						.getProductname().equals(castOther.getProductname())))
				&& ((this.getAnlxg() == castOther.getAnlxg()) || (this
						.getAnlxg() != null && castOther.getAnlxg() != null && this
						.getAnlxg().equals(castOther.getAnlxg())))
				&& ((this.getErrorcode() == castOther.getErrorcode()) || (this
						.getErrorcode() != null
						&& castOther.getErrorcode() != null && this
						.getErrorcode().equals(castOther.getErrorcode())))
				&& ((this.getCalculatedon() == castOther.getCalculatedon()) || (this
						.getCalculatedon() != null
						&& castOther.getCalculatedon() != null && this
						.getCalculatedon().equals(castOther.getCalculatedon())))
				&& ((this.getTotalprice() == castOther.getTotalprice()) || (this
						.getTotalprice() != null
						&& castOther.getTotalprice() != null && this
						.getTotalprice().equals(castOther.getTotalprice())))
				&& ((this.getPackageprice() == castOther.getPackageprice()) || (this
						.getPackageprice() != null
						&& castOther.getPackageprice() != null && this
						.getPackageprice().equals(castOther.getPackageprice())))
				&& ((this.getDiscount() == castOther.getDiscount()) || (this
						.getDiscount() != null
						&& castOther.getDiscount() != null && this
						.getDiscount().equals(castOther.getDiscount())))
				&& ((this.getTvroyality() == castOther.getTvroyality()) || (this
						.getTvroyality() != null
						&& castOther.getTvroyality() != null && this
						.getTvroyality().equals(castOther.getTvroyality())))
				&& ((this.getRadioroyality() == castOther.getRadioroyality()) || (this
						.getRadioroyality() != null
						&& castOther.getRadioroyality() != null && this
						.getRadioroyality()
						.equals(castOther.getRadioroyality())))
				&& ((this.getCopyrights() == castOther.getCopyrights()) || (this
						.getCopyrights() != null
						&& castOther.getCopyrights() != null && this
						.getCopyrights().equals(castOther.getCopyrights())))
				&& ((this.getVat() == castOther.getVat()) || (this.getVat() != null
						&& castOther.getVat() != null && this.getVat().equals(
						castOther.getVat())))
				&& ((this.getGroupindex() == castOther.getGroupindex()) || (this
						.getGroupindex() != null
						&& castOther.getGroupindex() != null && this
						.getGroupindex().equals(castOther.getGroupindex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProductcode() == null ? 0 : this.getProductcode()
						.hashCode());
		result = 37
				* result
				+ (getProductname() == null ? 0 : this.getProductname()
						.hashCode());
		result = 37 * result
				+ (getAnlxg() == null ? 0 : this.getAnlxg().hashCode());
		result = 37 * result
				+ (getErrorcode() == null ? 0 : this.getErrorcode().hashCode());
		result = 37
				* result
				+ (getCalculatedon() == null ? 0 : this.getCalculatedon()
						.hashCode());
		result = 37
				* result
				+ (getTotalprice() == null ? 0 : this.getTotalprice()
						.hashCode());
		result = 37
				* result
				+ (getPackageprice() == null ? 0 : this.getPackageprice()
						.hashCode());
		result = 37 * result
				+ (getDiscount() == null ? 0 : this.getDiscount().hashCode());
		result = 37
				* result
				+ (getTvroyality() == null ? 0 : this.getTvroyality()
						.hashCode());
		result = 37
				* result
				+ (getRadioroyality() == null ? 0 : this.getRadioroyality()
						.hashCode());
		result = 37
				* result
				+ (getCopyrights() == null ? 0 : this.getCopyrights()
						.hashCode());
		result = 37 * result
				+ (getVat() == null ? 0 : this.getVat().hashCode());
		result = 37
				* result
				+ (getGroupindex() == null ? 0 : this.getGroupindex()
						.hashCode());
		return result;
	}

}
