package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDEmo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //  1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

       //  2. Creating a connection
        String username="root";
        String password="root";
        String connectionUrl = "jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(connectionUrl,username,password);

        // 3. Creating statement
        Statement st = con.createStatement();

        //  4. Execute query
       // String sql = "insert into student value(11,'Pooja','IT',90)";
       //  String sql = "update student set branch='comp',marks=100 where rno=11 ";
        String sql = "delete from student where rno =  1";
        st.executeUpdate(sql); // for DML queries

    }
}
