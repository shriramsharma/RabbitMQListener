/**
 * 
 */
package com.ensco.training;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author shriramsharma
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDTO {

	private String name;

	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
