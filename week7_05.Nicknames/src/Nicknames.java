
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        
        HashMap<String,String> mapa = new HashMap<String,String>();
        mapa.put("matti", "mage");
        mapa.put("mikael", "mixu");
        mapa.put("arto", "arppa");
        
        mapa.get("mikael");
    }

}
