package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CatransCasefolder generated by hbm2java
 */
@Entity
@Table(name = "CATRANS_CASEFOLDER", schema = "PCRM")
public class CatransCasefolder implements java.io.Serializable {

	private CatransCasefolderId id;

	public CatransCasefolder() {
	}

	public CatransCasefolder(CatransCasefolderId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", length = 19)),
			@AttributeOverride(name = "crd", column = @Column(name = "CRD", length = 7)),
			@AttributeOverride(name = "impt", column = @Column(name = "IMPT", length = 7)),
			@AttributeOverride(name = "expt", column = @Column(name = "EXPT", length = 7)),
			@AttributeOverride(name = "impd", column = @Column(name = "IMPD", length = 7)),
			@AttributeOverride(name = "expd", column = @Column(name = "EXPD", length = 7)),
			@AttributeOverride(name = "modt", column = @Column(name = "MODT", length = 7)),
			@AttributeOverride(name = "cru", column = @Column(name = "CRU", length = 19)),
			@AttributeOverride(name = "delt", column = @Column(name = "DELT", length = 7)),
			@AttributeOverride(name = "modd", column = @Column(name = "MODD", length = 7)),
			@AttributeOverride(name = "impu", column = @Column(name = "IMPU", length = 19)),
			@AttributeOverride(name = "expu", column = @Column(name = "EXPU", length = 19)),
			@AttributeOverride(name = "deld", column = @Column(name = "DELD", length = 7)),
			@AttributeOverride(name = "modu", column = @Column(name = "MODU", length = 19)),
			@AttributeOverride(name = "delu", column = @Column(name = "DELU", length = 19)),
			@AttributeOverride(name = "crt", column = @Column(name = "CRT", length = 7)),
			@AttributeOverride(name = "primcontract", column = @Column(name = "PRIMCONTRACT", length = 19)),
			@AttributeOverride(name = "aendringForetaget", column = @Column(name = "AENDRING_FORETAGET", length = 1)),
			@AttributeOverride(name = "kbId", column = @Column(name = "KB_ID", length = 1)),
			@AttributeOverride(name = "salgsansv", column = @Column(name = "SALGSANSV", length = 50)),
			@AttributeOverride(name = "transferStatus", column = @Column(name = "TRANSFER_STATUS", precision = 10, scale = 0)),
			@AttributeOverride(name = "cdmNoegle", column = @Column(name = "CDM_NOEGLE", length = 19)),
			@AttributeOverride(name = "abnPrisGp", column = @Column(name = "ABN_PRIS_GP", precision = 10)),
			@AttributeOverride(name = "abnPrisMp", column = @Column(name = "ABN_PRIS_MP", precision = 10)),
			@AttributeOverride(name = "abnPrisTp", column = @Column(name = "ABN_PRIS_TP", precision = 10)),
			@AttributeOverride(name = "cdmIHusleje", column = @Column(name = "CDM_I_HUSLEJE", length = 15)),
			@AttributeOverride(name = "salgskoncGl", column = @Column(name = "SALGSKONC_GL", length = 50)),
			@AttributeOverride(name = "salgskoncNy", column = @Column(name = "SALGSKONC_NY", length = 50)),
			@AttributeOverride(name = "tilslutningsafgift", column = @Column(name = "TILSLUTNINGSAFGIFT", precision = 10)),
			@AttributeOverride(name = "noTransInst", column = @Column(name = "NO_TRANS_INST", precision = 22, scale = 0)),
			@AttributeOverride(name = "cdmPrisgruppe", column = @Column(name = "CDM_PRISGRUPPE", length = 50)),
			@AttributeOverride(name = "abnPrisFp", column = @Column(name = "ABN_PRIS_FP", precision = 10)),
			@AttributeOverride(name = "abnPrisLltp", column = @Column(name = "ABN_PRIS_LLTP", precision = 10)),
			@AttributeOverride(name = "tilslutningsafgiftNorm", column = @Column(name = "TILSLUTNINGSAFGIFT_NORM", precision = 10)),
			@AttributeOverride(name = "tilslutningsafgiftKamp", column = @Column(name = "TILSLUTNINGSAFGIFT_KAMP", precision = 10)),
			@AttributeOverride(name = "tilslutningsafgiftFor", column = @Column(name = "TILSLUTNINGSAFGIFT_FOR", precision = 10)),
			@AttributeOverride(name = "abnPrisRabat", column = @Column(name = "ABN_PRIS_RABAT", precision = 10)),
			@AttributeOverride(name = "rabatLtp", column = @Column(name = "RABAT_LTP", precision = 10)),
			@AttributeOverride(name = "rabatTp", column = @Column(name = "RABAT_TP", precision = 10)),
			@AttributeOverride(name = "rabatGp", column = @Column(name = "RABAT_GP", precision = 10)),
			@AttributeOverride(name = "rabatStp", column = @Column(name = "RABAT_STP", precision = 10)),
			@AttributeOverride(name = "rabatFp", column = @Column(name = "RABAT_FP", precision = 10)),
			@AttributeOverride(name = "rabatMp", column = @Column(name = "RABAT_MP", precision = 10)),
			@AttributeOverride(name = "etablafgiftFor", column = @Column(name = "ETABLAFGIFT_FOR", precision = 10)),
			@AttributeOverride(name = "abnPrisStp", column = @Column(name = "ABN_PRIS_STP", precision = 10)),
			@AttributeOverride(name = "transferHist", column = @Column(name = "TRANSFER_HIST")),
			@AttributeOverride(name = "osUser", column = @Column(name = "OS_USER")),
			@AttributeOverride(name = "topgroupCode", column = @Column(name = "TOPGROUP_CODE", length = 25)) })
	public CatransCasefolderId getId() {
		return this.id;
	}

	public void setId(CatransCasefolderId id) {
		this.id = id;
	}

}