package Devtest;

//import com.itko.lisa.vse.stateful.model.Request;
import com.itko.util.ParameterList;
import com.itko.util.Parameter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Iterator;
import java.util.Map.Entry;
public class BuildRequestObject {

	public static void main(String[] args) throws IOException {
//		File jsonFile = testExec.getStateObject("src\teste.json");
//		testExec.setStateObject("jsonFilePath", jsonFile);
	
		InputStream jsonFile = new FileInputStream("src\\teste.json");
		InputStreamReader isr = new InputStreamReader(jsonFile);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		System.out.println(linha);
		
		
		File jsonFile1 = new File("src\\teste.json");
		System.out.println(jsonFile);
//		Request scenarioReq = new Request();
//		ParameterList pl = new ParameterList();
				
		JsonNode jsonRequest = new ObjectMapper().readTree(jsonFile).get("request");
		System.out.println(jsonRequest);
		Iterator header = jsonRequest.get("header").fields();
//		while(header.hasNext()){
//		    Entry field = header.next();
//		    testExec.setStateObject("header_" + field.getKey(), field.getValue().asText());    
//		}
//	
//		Iterator queryString = jsonRequest.get("query_string").fields();
//		while(queryString.hasNext()){
//		    Entry field = queryString.next();
//		    pl.addParameter(new Parameter("query_string_" + field.getKey(), field.getValue().asText()));
//		    //testExec.setStateObject("query_string_" + field.getKey(), field.getValue().asText());  
//		}
//	
//		Iterator parameters = jsonRequest.get("parameters").fields();
//		while(parameters.hasNext()){
//		    Entry field = parameters.next();
//		    pl.addParameter(new Parameter("parameters_" + field.getKey(), field.getValue().asText()));
//		}
//	
//		if(!testExec.getStateString("methodSent", "").equals("get")){
//		    scenarioReq.setBody(jsonRequest.get("body").toString());
//		    testExec.setStateObject("testeBody", jsonRequest.get("body").toString());
//		}
//	
//		scenarioReq.setOperation(testExec.getStateObject("currentOperation"));
//		scenarioReq.setArguments(pl);
//	
//		testExec.setStateObject("scenarioRequest", scenarioReq);

	}
	}