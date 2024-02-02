package com.test1;

public class NavigationStructureTree {
	private Integer structureId;
	private String navId;
	private String name;
	private Integer treeSize;
	private String nodeName;
	private Integer nodeId;
	private Integer nodeLevel;
	private Integer parentId;
	private String creation_date;
	private String modifiedDate;
	private String entityState;

	public NavigationStructureTree() {

	}

	public NavigationStructureTree(Integer structureId, String navId, String name, Integer treeSize, String nodeName,
			Integer nodeId, Integer nodeLevel, Integer parentId, String creation_date, String modifiedDate,
			String entityState) {
		super();
		this.structureId = structureId;
		this.navId = navId;
		this.name = name;
		this.treeSize = treeSize;
		this.nodeName = nodeName;
		this.nodeId = nodeId;
		this.nodeLevel = nodeLevel;
		this.parentId = parentId;
		this.creation_date = creation_date;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getStructureId() {
		return structureId;
	}

	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

	public String getNavId() {
		return navId;
	}

	public void setNavId(String navId) {
		this.navId = navId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTreeSize() {
		return treeSize;
	}

	public void setTreeSize(Integer treeSize) {
		this.treeSize = treeSize;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getNodeLevel() {
		return nodeLevel;
	}

	public void setNodeLevel(Integer nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
