package dbproject;

import java.util.*;

public class Main {
	
	public void init() { //initialization	
	}
	
	public void createTable(String strTableName, String strClusteringKeyColumn, Hashtable<String,String> htblColNameType,
			Hashtable<String,String> htblColNameMin,
			Hashtable<String,String> htblColNameMax) throws DBAppException {
		Hashtable<String, String> bo2loz = new Hashtable<String, String>();
	}
	
	public void createIndex(String strTableName, String strColName) throws DBAppException {
		
	}
	
	public void insertIntoTable(String strTableName, Hashtable<String,Object> htblColNameValue) throws DBAppException {
		
	}

}
