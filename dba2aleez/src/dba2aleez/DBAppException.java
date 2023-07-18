package dba2aleez;

import java.io.*;

public class DBAppException extends IOException{
	public DBAppException() {
	}
	
	public DBAppException(String s) {
		super(s);
	}
}
