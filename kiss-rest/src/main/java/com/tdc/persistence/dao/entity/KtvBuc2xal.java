package com.tdc.persistence.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * KtvBuc2xal generated by hbm2java
 */
@Entity
@Table(name = "KTV_BUC2XAL", schema = "PCRM", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class KtvBuc2xal implements java.io.Serializable {

	private KtvBuc2xalId id;

	public KtvBuc2xal() {
	}

	public KtvBuc2xal(KtvBuc2xalId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, length = 19)),
			@AttributeOverride(name = "dataset", column = @Column(name = "DATASET", nullable = false, length = 3)),
			@AttributeOverride(name = "lxbenummer", column = @Column(name = "LXBENUMMER", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "sidstrettet", column = @Column(name = "SIDSTRETTET", nullable = false, length = 7)),
			@AttributeOverride(name = "transaktionstype", column = @Column(name = "TRANSAKTIONSTYPE", nullable = false, length = 4)),
			@AttributeOverride(name = "afsendtdato", column = @Column(name = "AFSENDTDATO", nullable = false, length = 7)),
			@AttributeOverride(name = "afsendtklokken", column = @Column(name = "AFSENDTKLOKKEN", nullable = false, length = 8)),
			@AttributeOverride(name = "terminalid", column = @Column(name = "TERMINALID", nullable = false, length = 10)),
			@AttributeOverride(name = "behandletdato", column = @Column(name = "BEHANDLETDATO", nullable = false, length = 7)),
			@AttributeOverride(name = "behandletklokken", column = @Column(name = "BEHANDLETKLOKKEN", nullable = false, length = 8)),
			@AttributeOverride(name = "behandletstatus", column = @Column(name = "BEHANDLETSTATUS", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "xrsagskode", column = @Column(name = "XRSAGSKODE", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "kundeemneId", column = @Column(name = "KUNDEEMNE_ID", nullable = false, length = 10)),
			@AttributeOverride(name = "adresseId", column = @Column(name = "ADRESSE_ID", nullable = false, length = 10)),
			@AttributeOverride(name = "instLbnr", column = @Column(name = "INST_LBNR", nullable = false, length = 10)),
			@AttributeOverride(name = "adresseIdny", column = @Column(name = "ADRESSE_IDNY", nullable = false, length = 10)),
			@AttributeOverride(name = "instLbnrny", column = @Column(name = "INST_LBNRNY", nullable = false, length = 10)),
			@AttributeOverride(name = "grundpakkekode", column = @Column(name = "GRUNDPAKKEKODE", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "tillxgspakkekode", column = @Column(name = "TILLXGSPAKKEKODE", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "anlxg", column = @Column(name = "ANLXG", nullable = false, length = 10)),
			@AttributeOverride(name = "fradato", column = @Column(name = "FRADATO", nullable = false, length = 7)),
			@AttributeOverride(name = "anlxgny", column = @Column(name = "ANLXGNY", nullable = false, length = 10)),
			@AttributeOverride(name = "installation", column = @Column(name = "INSTALLATION", nullable = false, length = 19)) })
	public KtvBuc2xalId getId() {
		return this.id;
	}

	public void setId(KtvBuc2xalId id) {
		this.id = id;
	}

}
