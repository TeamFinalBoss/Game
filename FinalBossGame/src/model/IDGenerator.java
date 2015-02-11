package model;

import java.io.File;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class IDGenerator {

	private static final String FILEPATH = "../../misc/ids.xml";
	private Document doc;
	private Node root;

	private int randInt( int min, int max){
		
		Random r = new Random();
		
		int randInt = r.nextInt((max - min) + 1) + min;
		return randInt;
	}
	

	public IDGenerator(){
		
		File f = new File(FILEPATH);
		
		if (!( f.exists() && f.canRead() ) ){
			System.err.println("Error: cannot read " + FILEPATH + ". Exiting now.");
			
			System.exit(1);
		}
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		
		try {
			db = dbFactory.newDocumentBuilder();	
			doc = db.parse(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		root = doc.getFirstChild();
	}
	
	public int genID(String objectName){
		
		int id = randInt(000000, 999999);
		Node currentNode = root.getFirstChild();
		int currentNodeID = Integer.parseInt(currentNode.getNodeValue());
		
		
		return 0;
	}
	
	public void returnID(int ID){
		
	}
}
