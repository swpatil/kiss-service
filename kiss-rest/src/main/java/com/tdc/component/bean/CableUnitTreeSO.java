package com.tdc.component.bean;

import java.util.HashSet;
import java.util.Set;

public class CableUnitTreeSO {
	
	private String id;
	private String title;
	private String type;
	
	private Set<CaseFolderTreeSO> nodes = new HashSet<CaseFolderTreeSO>();

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
	public Set<CaseFolderTreeSO> getNodes() {
		return nodes;
	}
	public void setNodes(Set<CaseFolderTreeSO> nodes) {
		this.nodes = nodes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
