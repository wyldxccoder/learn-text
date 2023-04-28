package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://127.0.0.1:3306/student";
        String username="root";
        String password="asd123";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3.定义sql语句
        String sql="update course set  Cname='大学英语'  where Cno=8";
        //4.获取执行sql的对象statement
        Statement stmt= conn.createStatement();
        //5.执行sql
        long count = stmt.executeLargeUpdate(sql);
        //6.处理结果
        System.out.println(count);//受影响的行数
        //7.释放资源
        stmt.close();
        conn.close();

    }

}
