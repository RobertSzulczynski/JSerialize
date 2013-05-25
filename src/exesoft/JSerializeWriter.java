package exesoft;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;


public interface JSerializeWriter{
	
	Map<String, List<Map<String,Object>>> toMap(Object ob) ;
	boolean writeObject(OutputStream os);
	void printMap(); //FOR TESTING ONLY. WILL BE REMOVED
}
