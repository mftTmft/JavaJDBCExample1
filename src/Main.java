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
        Class.forName("oracle.jdbc.Driver.OracleDriver");
        Connection my_connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","zeinali","admin123");
        Statement my_statement=my_connection.createStatement();
        my_statement.executeUpdate("insert into tbl1(id,name,family)values(200,'Hassan','Moradi')");
        my_statement.close();
        my_connection.close();
    }
}
