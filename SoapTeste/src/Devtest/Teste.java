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

public class Teste {

	public static void main(String[] args) throws IOException {

		InputStream jsonFile = new FileInputStream("src\\teste.json");
		InputStreamReader isr = new InputStreamReader(jsonFile);
		BufferedReader br = new BufferedReader(isr);

		JsonNode jsonRequest = new ObjectMapper().readTree(jsonFile).get("request");
		
System.out.println(jsonRequest);
		
		
	}
}