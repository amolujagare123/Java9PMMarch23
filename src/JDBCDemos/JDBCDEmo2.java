package JDBCDemos;

import java.sql.*;

public class JDBCDEmo2 {

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

        String sql = "select * from student";


        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }



    }
}
