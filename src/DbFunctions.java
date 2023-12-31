import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbFunctions {
    public Connection  connect_to_db(String dbname,String user,String pass){
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection( "jdbc:postgresql://localhost:5433/"+dbname,user,pass);
            if(conn!=null){
                System.out.println("Connection done");
            }
            else{
                System.out.println("Connection failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
    public void createTable(Connection conn,String table_name){
        Statement statement;
        try{
            String query="create table "+table_name+"(empid SERIAL,name varchar(200),address varchar(200),primary key(empid));";
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void insert_row(Connection conn,String table_name,String name,String address){
        Statement statement;
        try{
            String query=String.format("insert into %s(name,address) values('%s','%s');",table_name,name,address);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
