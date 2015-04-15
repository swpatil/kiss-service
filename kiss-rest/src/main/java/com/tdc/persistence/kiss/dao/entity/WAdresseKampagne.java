package com.tdc.persistence.kiss.dao.entity;

// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * WAdresseKampagne generated by hbm2java
 */
@Entity
@Table(name = "W_ADRESSE_KAMPAGNE", schema = "PCRM")
public class WAdresseKampagne implements java.io.Serializable {

	private WAdresseKampagneId id;

	public WAdresseKampagne() {
	}

	public WAdresseKampagne(WAdresseKampagneId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "WPk", column = @Column(name = "W_PK", length = 19)),
			@AttributeOverride(name = "kampemneAnlxgsnr", column = @Column(name = "KAMPEMNE_ANLXGSNR", length = 19)),
			@AttributeOverride(name = "kampemneAdrid", column = @Column(name = "KAMPEMNE_ADRID", length = 22)),
			@AttributeOverride(name = "kampemneVejnavn", column = @Column(name = "KAMPEMNE_VEJNAVN", length = 40)),
			@AttributeOverride(name = "kampemneHusnr", column = @Column(name = "KAMPEMNE_HUSNR", length = 3)),
			@AttributeOverride(name = "kampemneOpgang", column = @Column(name = "KAMPEMNE_OPGANG", length = 1)),
			@AttributeOverride(name = "kampemneEtage", column = @Column(name = "KAMPEMNE_ETAGE", length = 2)),
			@AttributeOverride(name = "kampemneSided�rnr", column = @Column(name = "KAMPEMNE_SIDED�RNR", length = 10)),
			@AttributeOverride(name = "kampemnePostnr", column = @Column(name = "KAMPEMNE_POSTNR", length = 4)),
			@AttributeOverride(name = "kampemnePostdistrikt", column = @Column(name = "KAMPEMNE_POSTDISTRIKT", length = 30)),
			@AttributeOverride(name = "kamptypeKode", column = @Column(name = "KAMPTYPE_KODE", length = 15)),
			@AttributeOverride(name = "kamptypeNavn", column = @Column(name = "KAMPTYPE_NAVN")),
			@AttributeOverride(name = "kampKode", column = @Column(name = "KAMP_KODE", length = 15)),
			@AttributeOverride(name = "kampNavn", column = @Column(name = "KAMP_NAVN", length = 50)),
			@AttributeOverride(name = "kampemneStatus", column = @Column(name = "KAMPEMNE_STATUS", length = 7)),
			@AttributeOverride(name = "kampemneStatusdato", column = @Column(name = "KAMPEMNE_STATUSDATO", length = 0)),
			@AttributeOverride(name = "kampemneStilling", column = @Column(name = "KAMPEMNE_STILLING", length = 35)),
			@AttributeOverride(name = "kampemneFornavn", column = @Column(name = "KAMPEMNE_FORNAVN", length = 35)),
			@AttributeOverride(name = "kampemneEfternavn", column = @Column(name = "KAMPEMNE_EFTERNAVN", length = 35)) })
	public WAdresseKampagneId getId() {
		return this.id;
	}

	public void setId(WAdresseKampagneId id) {
		this.id = id;
	}

}