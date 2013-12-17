/**
 * 
 */
package com.ensco.training;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author shriramsharma
 * 
 */
public class Subscriber {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("rabbit-listen-context.xml");
	}

	public void listen(String json) throws JsonParseException, JsonMappingException, IOException {
		// System.out.println(json);
		ObjectMapper mapper = new ObjectMapper();
		MessageDTO mDTO = mapper.readValue(json, MessageDTO.class);
		System.out.println(mDTO.toString());
	}

}
