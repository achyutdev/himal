package com.himal.skul.model;

public class CourseResource {

	private Long id;
	private String name;
	private CourseResourceType resourceType;
	private String filePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(CourseResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
