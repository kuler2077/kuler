//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Test01 {
//
//    public static void main(String[] args) {
//        String Url = "jdbc:mysql://localhost/test01";//参数参考MySql连接数据库常用参数及代码示例
//        String name = "root";//数据库用户名
//        String psd = "psd";//数据库密码
//        String jdbcName = "com.mysql.jdbc.Driver";//连接MySql数据库
//        String sql = "insert into test values(?,?)";//数据库操作语句（插入）
//        try {
//            Class.forName(jdbcName);//向DriverManager注册自己
//            Connection con = DriverManager.getConnection(Url, name, psd);//与数据库建立连接
//            PreparedStatement pst = con.prepareStatement(sql);//用来执行SQL语句查询，对sql语句进行预编译处理
//            pst.setString(1, "nonono");
//            pst.setInt(2, 123123213);
//            pst.executeUpdate();//解释在下
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {//执行与数据库建立连接需要抛出SQL异常
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}
