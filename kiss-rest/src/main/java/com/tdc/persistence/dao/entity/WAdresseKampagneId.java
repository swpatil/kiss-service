package com.tdc.persistence.dao.entity;
// Generated 31-03-2015 11:56:29 by Hibernate Tools 4.0.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WAdresseKampagneId generated by hbm2java
 */
@Embeddable
public class WAdresseKampagneId  implements java.io.Serializable {


     private String WPk;
     private String kampemneAnlxgsnr;
     private String kampemneAdrid;
     private String kampemneVejnavn;
     private String kampemneHusnr;
     private String kampemneOpgang;
     private String kampemneEtage;
     private String kampemneSidedrnr;
     private String kampemnePostnr;
     private String kampemnePostdistrikt;
     private String kamptypeKode;
     private String kamptypeNavn;
     private String kampKode;
     private String kampNavn;
     private String kampemneStatus;
     private Date kampemneStatusdato;
     private String kampemneStilling;
     private String kampemneFornavn;
     private String kampemneEfternavn;

    public WAdresseKampagneId() {
    }

    public WAdresseKampagneId(String WPk, String kampemneAnlxgsnr, String kampemneAdrid, String kampemneVejnavn, String kampemneHusnr, String kampemneOpgang, String kampemneEtage, String kampemneSidedrnr, String kampemnePostnr, String kampemnePostdistrikt, String kamptypeKode, String kamptypeNavn, String kampKode, String kampNavn, String kampemneStatus, Date kampemneStatusdato, String kampemneStilling, String kampemneFornavn, String kampemneEfternavn) {
       this.WPk = WPk;
       this.kampemneAnlxgsnr = kampemneAnlxgsnr;
       this.kampemneAdrid = kampemneAdrid;
       this.kampemneVejnavn = kampemneVejnavn;
       this.kampemneHusnr = kampemneHusnr;
       this.kampemneOpgang = kampemneOpgang;
       this.kampemneEtage = kampemneEtage;
       this.kampemneSidedrnr = kampemneSidedrnr;
       this.kampemnePostnr = kampemnePostnr;
       this.kampemnePostdistrikt = kampemnePostdistrikt;
       this.kamptypeKode = kamptypeKode;
       this.kamptypeNavn = kamptypeNavn;
       this.kampKode = kampKode;
       this.kampNavn = kampNavn;
       this.kampemneStatus = kampemneStatus;
       this.kampemneStatusdato = kampemneStatusdato;
       this.kampemneStilling = kampemneStilling;
       this.kampemneFornavn = kampemneFornavn;
       this.kampemneEfternavn = kampemneEfternavn;
    }
   


    @Column(name="W_PK", length=19)
    public String getWPk() {
        return this.WPk;
    }
    
    public void setWPk(String WPk) {
        this.WPk = WPk;
    }


    @Column(name="KAMPEMNE_ANLXGSNR", length=19)
    public String getKampemneAnlxgsnr() {
        return this.kampemneAnlxgsnr;
    }
    
    public void setKampemneAnlxgsnr(String kampemneAnlxgsnr) {
        this.kampemneAnlxgsnr = kampemneAnlxgsnr;
    }


    @Column(name="KAMPEMNE_ADRID", length=22)
    public String getKampemneAdrid() {
        return this.kampemneAdrid;
    }
    
    public void setKampemneAdrid(String kampemneAdrid) {
        this.kampemneAdrid = kampemneAdrid;
    }


    @Column(name="KAMPEMNE_VEJNAVN", length=40)
    public String getKampemneVejnavn() {
        return this.kampemneVejnavn;
    }
    
    public void setKampemneVejnavn(String kampemneVejnavn) {
        this.kampemneVejnavn = kampemneVejnavn;
    }


    @Column(name="KAMPEMNE_HUSNR", length=3)
    public String getKampemneHusnr() {
        return this.kampemneHusnr;
    }
    
    public void setKampemneHusnr(String kampemneHusnr) {
        this.kampemneHusnr = kampemneHusnr;
    }


    @Column(name="KAMPEMNE_OPGANG", length=1)
    public String getKampemneOpgang() {
        return this.kampemneOpgang;
    }
    
    public void setKampemneOpgang(String kampemneOpgang) {
        this.kampemneOpgang = kampemneOpgang;
    }


    @Column(name="KAMPEMNE_ETAGE", length=2)
    public String getKampemneEtage() {
        return this.kampemneEtage;
    }
    
    public void setKampemneEtage(String kampemneEtage) {
        this.kampemneEtage = kampemneEtage;
    }


    @Column(name="KAMPEMNE_SIDED�RNR", length=10)
    public String getKampemneSidedrnr() {
        return this.kampemneSidedrnr;
    }
    
    public void setKampemneSidedrnr(String kampemneSidedrnr) {
        this.kampemneSidedrnr = kampemneSidedrnr;
    }


    @Column(name="KAMPEMNE_POSTNR", length=4)
    public String getKampemnePostnr() {
        return this.kampemnePostnr;
    }
    
    public void setKampemnePostnr(String kampemnePostnr) {
        this.kampemnePostnr = kampemnePostnr;
    }


    @Column(name="KAMPEMNE_POSTDISTRIKT", length=30)
    public String getKampemnePostdistrikt() {
        return this.kampemnePostdistrikt;
    }
    
    public void setKampemnePostdistrikt(String kampemnePostdistrikt) {
        this.kampemnePostdistrikt = kampemnePostdistrikt;
    }


    @Column(name="KAMPTYPE_KODE", length=15)
    public String getKamptypeKode() {
        return this.kamptypeKode;
    }
    
    public void setKamptypeKode(String kamptypeKode) {
        this.kamptypeKode = kamptypeKode;
    }


    @Column(name="KAMPTYPE_NAVN")
    public String getKamptypeNavn() {
        return this.kamptypeNavn;
    }
    
    public void setKamptypeNavn(String kamptypeNavn) {
        this.kamptypeNavn = kamptypeNavn;
    }


    @Column(name="KAMP_KODE", length=15)
    public String getKampKode() {
        return this.kampKode;
    }
    
    public void setKampKode(String kampKode) {
        this.kampKode = kampKode;
    }


    @Column(name="KAMP_NAVN", length=50)
    public String getKampNavn() {
        return this.kampNavn;
    }
    
    public void setKampNavn(String kampNavn) {
        this.kampNavn = kampNavn;
    }


    @Column(name="KAMPEMNE_STATUS", length=7)
    public String getKampemneStatus() {
        return this.kampemneStatus;
    }
    
    public void setKampemneStatus(String kampemneStatus) {
        this.kampemneStatus = kampemneStatus;
    }


    @Column(name="KAMPEMNE_STATUSDATO", length=0)
    public Date getKampemneStatusdato() {
        return this.kampemneStatusdato;
    }
    
    public void setKampemneStatusdato(Date kampemneStatusdato) {
        this.kampemneStatusdato = kampemneStatusdato;
    }


    @Column(name="KAMPEMNE_STILLING", length=35)
    public String getKampemneStilling() {
        return this.kampemneStilling;
    }
    
    public void setKampemneStilling(String kampemneStilling) {
        this.kampemneStilling = kampemneStilling;
    }


    @Column(name="KAMPEMNE_FORNAVN", length=35)
    public String getKampemneFornavn() {
        return this.kampemneFornavn;
    }
    
    public void setKampemneFornavn(String kampemneFornavn) {
        this.kampemneFornavn = kampemneFornavn;
    }


    @Column(name="KAMPEMNE_EFTERNAVN", length=35)
    public String getKampemneEfternavn() {
        return this.kampemneEfternavn;
    }
    
    public void setKampemneEfternavn(String kampemneEfternavn) {
        this.kampemneEfternavn = kampemneEfternavn;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof WAdresseKampagneId) ) return false;
		 WAdresseKampagneId castOther = ( WAdresseKampagneId ) other; 
         
		 return ( (this.getWPk()==castOther.getWPk()) || ( this.getWPk()!=null && castOther.getWPk()!=null && this.getWPk().equals(castOther.getWPk()) ) )
 && ( (this.getKampemneAnlxgsnr()==castOther.getKampemneAnlxgsnr()) || ( this.getKampemneAnlxgsnr()!=null && castOther.getKampemneAnlxgsnr()!=null && this.getKampemneAnlxgsnr().equals(castOther.getKampemneAnlxgsnr()) ) )
 && ( (this.getKampemneAdrid()==castOther.getKampemneAdrid()) || ( this.getKampemneAdrid()!=null && castOther.getKampemneAdrid()!=null && this.getKampemneAdrid().equals(castOther.getKampemneAdrid()) ) )
 && ( (this.getKampemneVejnavn()==castOther.getKampemneVejnavn()) || ( this.getKampemneVejnavn()!=null && castOther.getKampemneVejnavn()!=null && this.getKampemneVejnavn().equals(castOther.getKampemneVejnavn()) ) )
 && ( (this.getKampemneHusnr()==castOther.getKampemneHusnr()) || ( this.getKampemneHusnr()!=null && castOther.getKampemneHusnr()!=null && this.getKampemneHusnr().equals(castOther.getKampemneHusnr()) ) )
 && ( (this.getKampemneOpgang()==castOther.getKampemneOpgang()) || ( this.getKampemneOpgang()!=null && castOther.getKampemneOpgang()!=null && this.getKampemneOpgang().equals(castOther.getKampemneOpgang()) ) )
 && ( (this.getKampemneEtage()==castOther.getKampemneEtage()) || ( this.getKampemneEtage()!=null && castOther.getKampemneEtage()!=null && this.getKampemneEtage().equals(castOther.getKampemneEtage()) ) )
 && ( (this.getKampemneSidedrnr()==castOther.getKampemneSidedrnr()) || ( this.getKampemneSidedrnr()!=null && castOther.getKampemneSidedrnr()!=null && this.getKampemneSidedrnr().equals(castOther.getKampemneSidedrnr()) ) )
 && ( (this.getKampemnePostnr()==castOther.getKampemnePostnr()) || ( this.getKampemnePostnr()!=null && castOther.getKampemnePostnr()!=null && this.getKampemnePostnr().equals(castOther.getKampemnePostnr()) ) )
 && ( (this.getKampemnePostdistrikt()==castOther.getKampemnePostdistrikt()) || ( this.getKampemnePostdistrikt()!=null && castOther.getKampemnePostdistrikt()!=null && this.getKampemnePostdistrikt().equals(castOther.getKampemnePostdistrikt()) ) )
 && ( (this.getKamptypeKode()==castOther.getKamptypeKode()) || ( this.getKamptypeKode()!=null && castOther.getKamptypeKode()!=null && this.getKamptypeKode().equals(castOther.getKamptypeKode()) ) )
 && ( (this.getKamptypeNavn()==castOther.getKamptypeNavn()) || ( this.getKamptypeNavn()!=null && castOther.getKamptypeNavn()!=null && this.getKamptypeNavn().equals(castOther.getKamptypeNavn()) ) )
 && ( (this.getKampKode()==castOther.getKampKode()) || ( this.getKampKode()!=null && castOther.getKampKode()!=null && this.getKampKode().equals(castOther.getKampKode()) ) )
 && ( (this.getKampNavn()==castOther.getKampNavn()) || ( this.getKampNavn()!=null && castOther.getKampNavn()!=null && this.getKampNavn().equals(castOther.getKampNavn()) ) )
 && ( (this.getKampemneStatus()==castOther.getKampemneStatus()) || ( this.getKampemneStatus()!=null && castOther.getKampemneStatus()!=null && this.getKampemneStatus().equals(castOther.getKampemneStatus()) ) )
 && ( (this.getKampemneStatusdato()==castOther.getKampemneStatusdato()) || ( this.getKampemneStatusdato()!=null && castOther.getKampemneStatusdato()!=null && this.getKampemneStatusdato().equals(castOther.getKampemneStatusdato()) ) )
 && ( (this.getKampemneStilling()==castOther.getKampemneStilling()) || ( this.getKampemneStilling()!=null && castOther.getKampemneStilling()!=null && this.getKampemneStilling().equals(castOther.getKampemneStilling()) ) )
 && ( (this.getKampemneFornavn()==castOther.getKampemneFornavn()) || ( this.getKampemneFornavn()!=null && castOther.getKampemneFornavn()!=null && this.getKampemneFornavn().equals(castOther.getKampemneFornavn()) ) )
 && ( (this.getKampemneEfternavn()==castOther.getKampemneEfternavn()) || ( this.getKampemneEfternavn()!=null && castOther.getKampemneEfternavn()!=null && this.getKampemneEfternavn().equals(castOther.getKampemneEfternavn()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getWPk() == null ? 0 : this.getWPk().hashCode() );
         result = 37 * result + ( getKampemneAnlxgsnr() == null ? 0 : this.getKampemneAnlxgsnr().hashCode() );
         result = 37 * result + ( getKampemneAdrid() == null ? 0 : this.getKampemneAdrid().hashCode() );
         result = 37 * result + ( getKampemneVejnavn() == null ? 0 : this.getKampemneVejnavn().hashCode() );
         result = 37 * result + ( getKampemneHusnr() == null ? 0 : this.getKampemneHusnr().hashCode() );
         result = 37 * result + ( getKampemneOpgang() == null ? 0 : this.getKampemneOpgang().hashCode() );
         result = 37 * result + ( getKampemneEtage() == null ? 0 : this.getKampemneEtage().hashCode() );
         result = 37 * result + ( getKampemneSidedrnr() == null ? 0 : this.getKampemneSidedrnr().hashCode() );
         result = 37 * result + ( getKampemnePostnr() == null ? 0 : this.getKampemnePostnr().hashCode() );
         result = 37 * result + ( getKampemnePostdistrikt() == null ? 0 : this.getKampemnePostdistrikt().hashCode() );
         result = 37 * result + ( getKamptypeKode() == null ? 0 : this.getKamptypeKode().hashCode() );
         result = 37 * result + ( getKamptypeNavn() == null ? 0 : this.getKamptypeNavn().hashCode() );
         result = 37 * result + ( getKampKode() == null ? 0 : this.getKampKode().hashCode() );
         result = 37 * result + ( getKampNavn() == null ? 0 : this.getKampNavn().hashCode() );
         result = 37 * result + ( getKampemneStatus() == null ? 0 : this.getKampemneStatus().hashCode() );
         result = 37 * result + ( getKampemneStatusdato() == null ? 0 : this.getKampemneStatusdato().hashCode() );
         result = 37 * result + ( getKampemneStilling() == null ? 0 : this.getKampemneStilling().hashCode() );
         result = 37 * result + ( getKampemneFornavn() == null ? 0 : this.getKampemneFornavn().hashCode() );
         result = 37 * result + ( getKampemneEfternavn() == null ? 0 : this.getKampemneEfternavn().hashCode() );
         return result;
   }   


}

