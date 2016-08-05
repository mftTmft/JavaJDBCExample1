import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by 7 on 8/5/2016.
 */
public class Main
{
    public static void main(String[] args)throws ClassNotFoundException,SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection my_connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","zeinali","admin123");
        my_connection.setAutoCommit(false);
        Statement my_statement=my_connection.createStatement();
        my_statement.executeUpdate("insert into tbl1(id,name,family)values(201,'Hassan','Moradi')");
        my_connection.commit();
        my_statement.close();
        my_connection.close();
    }
}
