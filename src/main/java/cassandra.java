import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class cassandra {
  public static void main(String[] args) {

    Cluster cluster;
    Session session;

    cluster = Cluster.builder().addContactPoint("localhost").build();

    session = cluster.connect("ecommerce");
    session.execute(
        "INSERT INTO products (pdt_id,cat_id,pdt_desc,pdt_name,price,shippingaddress) VALUES (002,105,'candy','capacity',10,'20808')");

    ResultSet resultSet = session.execute("select * from products");
    String pdt_id = null;
    for (Row row : resultSet) {

      pdt_id = Integer.toString(row.getInt("pdt_id"));
      System.out.println("Product Id:" + pdt_id);
    }
    cluster.close();
  }
}
