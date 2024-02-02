package com.test1;

public class NavigationUIMapping {
	private Integer structureId;
	private Integer screenId;
	private String screenParent;
	private String widgetInfo;
	private String carousel;
	private String creation_date;
	private String modifiedDate;
	private String entityState;

	public NavigationUIMapping() {

	}

	public NavigationUIMapping(Integer structureId, Integer screenId, String screenParent, String widgetInfo,
			String carousel, String creation_date, String modifiedDate, String entityState) {
		super();
		this.structureId = structureId;
		this.screenId = screenId;
		this.screenParent = screenParent;
		this.widgetInfo = widgetInfo;
		this.carousel = carousel;
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

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public String getScreenParent() {
		return screenParent;
	}

	public void setScreenParent(String screenParent) {
		this.screenParent = screenParent;
	}

	public String getWidgetInfo() {
		return widgetInfo;
	}

	public void setWidgetInfo(String widgetInfo) {
		this.widgetInfo = widgetInfo;
	}

	public String getCarousel() {
		return carousel;
	}

	public void setCarousel(String carousel) {
		this.carousel = carousel;
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
