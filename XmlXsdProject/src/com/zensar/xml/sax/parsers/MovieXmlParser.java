package com.zensar.xml.sax.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MovieXmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		
		
		try {
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(new File("./src/moviedetails.xml"), new MovieXmlHandler());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

	}

}
