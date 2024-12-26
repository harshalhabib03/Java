import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnClose{
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try{
			//Here, we can write our sql queries
			//like, select, insert, etc,..
		}
		catch (Exception e) {
			//Exception handling code
		}
		finally{
			try{
				rs.close();
			}
			catch (SQLException e) {
				
			}
			try{
				ps.close();
			}
			catch (SQLException e) {
				
			}
			try{
				con.close();
			}
			catch (SQLException e) {
				
			}
		}
	}
}