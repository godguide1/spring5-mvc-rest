package guru.springframework.spring5mvcrest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by Adetola on 06/07/2019
 */
@Data
public class CustomerDTO {


    private String firstname;

    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
