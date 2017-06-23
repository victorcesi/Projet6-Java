package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.CallableStatement;


/**
 * This class must call the stored procedure which store the map in a String attribute
 * @author Alexandre DASSONVILLE
 *@version 4.6.3
 */
public class MapDAO extends AbstractDAO {
	
	public MapDAO(){
		
	}
	
	/**
	 * This method call the stored procedure to access to the map. Then, it store this map in a String attribute
	 * @param id This is the id of the map which is in the Database 
	 * @return This returns a String attribute whih contains the map
	 * @throws SQLException
	 */
	public static String readInDB(int id) throws SQLException{

	        final CallableStatement callStatementMapCode = (CallableStatement) prepareCall("{call callMap(?)}");
	        String mapCode = "";
	        callStatementMapCode.setInt(1, id);
	        if (callStatementMapCode.execute()) {
	            final ResultSet result = callStatementMapCode.getResultSet(); //retrives the result of the query 

	            if (result.first()) {
	                mapCode = result.getString(1);
	            }
	            result.close();
	        }

	        return mapCode;
	    }

}
