package customannotation;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomAnnotationExample {
	 public static void main(String args[]) {  
	ObjectMapper mapper = new ObjectMapper();  
    
    // create Scanner class object  
    Scanner sc= new Scanner(System.in);       
      
    // using try-catch for serializing Product  
    try {  
          
        Product product;  
          
        String proId, proName, proPrice, proExpiry;  
          
        System.out.println("Enter Product Id:");  
        proId = sc.nextLine();  
          
        System.out.println("Enter Product Name");  
        proName = sc.nextLine();  
          
        System.out.println("Enter Product Price");  
        proPrice = sc.nextLine();  
          
        System.out.println("Enter Product Expiry in dd-mm-yyyy format");  
        proExpiry = sc.nextLine();  
          
        // set values to Student object by using constructor  
        product = new Product(proId, proName, proPrice, proExpiry);     
          
        String jsonString = mapper  
            .writerWithDefaultPrettyPrinter()  
            .writeValueAsString(product);  
          
        System.out.println(jsonString);  
    }  
    catch (IOException e) {   
        e.printStackTrace();  
    }  
      
    //close Scanner class object  
    sc.close();  
      
}  

}
