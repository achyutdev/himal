package com.himal.school.model;

public class Guardian extends Person{

	private Long guardianId;
	private Relation relation;
	private String otherRelationType;
	public Long getGuardianId() {
		return guardianId;
	}
	public void setGuardianId(Long guardianId) {
		this.guardianId = guardianId;
	}
	public Relation getRelation() {
		return relation;
	}
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	public String getOtherRelationType() {
		return otherRelationType;
	}
	public void setOtherRelationType(String otherRelationType) {
		this.otherRelationType = otherRelationType;
	}
	
}
