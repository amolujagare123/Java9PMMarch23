package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteBatchDemo {

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
         String sql1 = "insert into student value(12,'Nisha','IT',90)";
         String sql2 = "update student set branch='comp',marks=100 where rno=12 ";
         String sql3 = "delete from student where rno =  3";

        st.addBatch(sql1);
        st.addBatch(sql2);
        st.addBatch(sql3);

        st.executeBatch();



    }
}
