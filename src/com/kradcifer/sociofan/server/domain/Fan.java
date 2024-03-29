package com.kradcifer.sociofan.server.domain;

import java.util.List;

import javax.persistence.Embedded;

import com.googlecode.objectify.annotation.Entity;
import com.kradcifer.sociofan.shared.FanModality;

@SuppressWarnings("serial")
@Entity
public class Fan extends Armazenavel {
	
	@Embedded private Documentation docs;
	@Embedded private List<Fine> fines;
	@Embedded private FanInfo fanInfo;
	
	private FanModality fanModality;
	
	public Documentation getDocs() {
		return docs;
	}

	public void setDocs(Documentation docs) {
		this.docs = docs;
	}

	public FanModality getFanModality() {
		return fanModality;
	}

	public void setFanModality(FanModality fanModality) {
		this.fanModality = fanModality;
	}

	public List<Fine> getFines() {
		return fines;
	}

	public void setFines(List<Fine> fines) {
		this.fines = fines;
	}

	public FanInfo getFanInfo() {
		return fanInfo;
	}

	public void setFanInfo(FanInfo fanInfo) {
		this.fanInfo = fanInfo;
	}

}
