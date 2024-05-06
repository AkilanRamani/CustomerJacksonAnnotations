package customannotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringToJsonNodeExample {

	public static void main(String[] args) {
		
		  ObjectMapper obj = new ObjectMapper();  
	        try {  
	            String jsonString = "{\"proId\":\"001\",\"proName\":\"MX Pro 20\",\"price\":\"25k\"}";   
	            System.out.println(jsonString);  
	            System.out.println();  
	            JsonNode node = obj.readTree(jsonString);  
	            System.out.println("After parsing String to JsonNode: "+node);  
	            System.out.println();  
	            JsonNode node1 = node.get("proId");  
	            System.out.println("Product Id = "+node1.textValue());  
	            JsonNode node2 = node.get("proName");  
	            System.out.println("Product Name = "+node2.textValue());  
	            JsonNode node3 = node.get("price");  
	            System.out.println("Product Price = "+node3.textValue());  
	        } catch (JsonParseException e) {  
	            e.printStackTrace();  
	        } catch (JsonMappingException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }   
	    }  
		

	}

