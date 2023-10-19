import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        DbFunctions db=new DbFunctions();
        Connection conn  =db.connect_to_db("student","postgres","chitra");
        db.createTable(conn,"employee");
        db.insert_row(conn,"employee","chitra","kovilpatti");
    }
}