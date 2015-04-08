package com.tdc.component.bean;

import java.util.HashSet;
import java.util.Set;
import com.tdc.component.bean.OfferTreeSO;

public class CaseFolderTreeSO {
	
	private String id;
	private String title;
	private SalesTypeSO salestype;
	private String casetype="Tillægsaftale";
	private String casenumber;
	private String type;
	
	private Set<OfferTreeSO> nodes = new HashSet<OfferTreeSO>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<OfferTreeSO> getNodes() {
		return nodes;
	}
	public void setNodes(Set<OfferTreeSO> nodes) {
		this.nodes = nodes;
	}
	public SalesTypeSO getSalestype() {
		return salestype;
	}
	public void setSalestype(SalesTypeSO salestype) {
		this.salestype = salestype;
	}
	public String getCasetype() {
		return casetype;
	}
	public void setCasetype(String casetype) {
		this.casetype = casetype;
	}
	public String getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(String casenumber) {
		this.casenumber = casenumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	

}
