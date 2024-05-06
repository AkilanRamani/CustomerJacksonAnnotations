package customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JacksonAnnotationsInside  
@JsonInclude(value = Include.NON_NULL)  
@Retention(RetentionPolicy.RUNTIME)  
@JsonPropertyOrder({ "name", "proId", "expire", "price" })  
public @interface CustomAnnotation {

}
