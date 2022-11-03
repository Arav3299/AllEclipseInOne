import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class JacksonMapToJson {

    public static void main(String[] args) throws JsonProcessingException  {

    
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

//        MultiValuedMap< String, String > days = new  ArrayListValuedHashMap<>();
//        days.put("MON", "y");
//        days.put("TUE", "u");
//        days.put("WED", "y");
//        days.put("THU", "u");
//        days.put("FRI", "y");
//        days.put("SAT", "u");
//        days.put("SAT", "h");
//
//        String json = mapper.writeValueAsString(days);
//        System.out.println(json)
//    	 
//       ;
//        MultiMap<String, String> map = new MultiValueMap<>();
//        map.put("key1", "value1");
//        map.put("key1", "value2");
//        System.out.println(map);
//        
//        
//        MultiMap multiMap = new MultiValueMap();
//
//        multiMap.put("ford", "Mustang Mach-E");
//        multiMap.put("ford", "GT");
//        multiMap.put("ford", "Pantera");
//
//        String json1 = mapper.writeValueAsString(multiMap);
//        System.out.println(json1);
        
        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("key1", "value2");
        map.put("key1", "value1");
        System.out.println(map);
    }
}