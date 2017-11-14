package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

/** 
 * 创建jdbc 连接及数据库的表，在这里要记得把数据库的 jar 加上，
 * 我用的mySql，把mysql-connector-java.jar 加到lib下。
 * */
public class Jdbc {

	// コネクトをオンに
	public static Connection connect()
		throws SQLException, ClassNotFoundException, IOException{
		
		Connection conn = null;

		ResourceBundle resource = ResourceBundle.getBundle("db/db-set");
		
		
		/**
		 * Class.forName(“”);的作用是要求JVM查找并加载指定的类
		 * 如果在类中有静态初始化器的话，JVM必然会执行该类的静态代码段
		 * class装载成功就表示执行了你的静态代码了，而且以后不会再走这段静态代码
		 * */
		/* 在web项目中，当Class.forName("om.mysql.jdbc.Driver");时eclipse是不会去查找字符串，
		 * 不会去查找驱动的。
		 * 所以只需要把mysql-connector-java-5.1.7-bin.jar拷贝到tomcat下lib目录就可以了。 */
		String className = resource.getString("driver");
		Class.forName(className);

//		StringBuffer url=new StringBuffer("jdbc:");
//		url.append(resource.getString("dbType"));
//		url.append("://");
//		url.append(resource.getString("dbHost"));
//		url.append(":");
//		url.append(resource.getString("dbPort"));
//		url.append("/");
//		url.append(resource.getString("dbName"));
		conn=(Connection)DriverManager.getConnection(resource.getString("jdbcUrl"),
				resource.getString("dbUser"), 
				resource.getString("dbPwd"));
	
		// 取得连接的url,能访问MySQL数据库的用户名,密码；user：数据库表名 
		 // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名
//		String url ="jdbc:mysql://localhost:3306/db_fcme";
//		String userName = "fcme";
//		String password = "2222";
//		conn=(Connection)DriverManager.getConnection(url, userName, password);

		return conn;
		
	}
	
	// コネクトをオフに
	public static void close(Statement stat, Connection conn) throws SQLException {
		
		if(stat != null) {
			stat.close();
		}
		
		if(conn != null) {
			conn.close();
		}
		
	}
	
	
	
	
	
	
	
}
