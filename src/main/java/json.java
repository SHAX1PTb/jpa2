import com.mysql.cj.xdevapi.JsonValue;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class json {

  public static void main(String[] args) {
    //

      Map map = new HashMap();

      map.put("Name","Shankar");
      map.put("age",new Integer(27));
      map.put("Salary",new Double(600000));
      map.put("zipcode",85027);

      JSONObject obj = new JSONObject();

      String jsonText = JSONValue.toJSONString(map);

    System.out.println(jsonText);
  }
}
