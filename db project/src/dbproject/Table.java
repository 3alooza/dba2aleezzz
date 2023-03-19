package dbproject;

import java.util.*;

public class Table {
	private String tableName;
	private Hashtable<String, String> columns;
	private Hashtable<String, String> max;
	private Hashtable<String, String> min;
	private int numberOfPages;
	private int maxSizeOfPage;
	private String clusteringColumn;
	
	public Table(String strTableName, String strClusteringKeyColumn, Hashtable<String,String> htblColNameType, 
			Hashtable<String,String> htblColNameMin, Hashtable<String,String> htblColNameMax) {
		tableName = strTableName;
		clusteringColumn = strClusteringKeyColumn;
		numberOfPages = 1;
		maxSizeOfPage = 200;
		
		Hashtable<String,String> tmp = new Hashtable<String,String>();
	    Iterator<String> a = htblColNameType.keySet().iterator();
	    while(a.hasNext()) {
	      String curr = a.next();
	      tmp.put(curr, htblColNameType.get(curr));
	    }
	    this.columns = tmp;
	    
	    Hashtable<String,String> tmp1 = new Hashtable<String,String>();
	    Iterator<String> b = htblColNameMax.keySet().iterator();
	    while(b.hasNext()) {
	      String curr = b.next();
	      tmp.put(curr, htblColNameMax.get(curr));
	    }
	    this.max = tmp1;
	    
	    Hashtable<String,String> tmp2 = new Hashtable<String,String>();
	    Iterator<String> c = htblColNameMin.keySet().iterator();
	    while(a.hasNext()) {
	      String curr = c.next();
	      tmp.put(curr, htblColNameMin.get(curr));
	    }
	    this.min = tmp2;
	}
	
	public static void main(String[] args) {
		Hashtable<String, Integer> a = new Hashtable<>();
		a.put("nour", 1);
		a.put("mo", 2);
		a.put("nagy", 3);
		a.put("ali", 4);
		
		for (Map.Entry<String, Integer> bo2loz : a.entrySet()) {
			System.out.println(bo2loz.getKey() + " " + bo2loz.getValue());
		}
	}
}
