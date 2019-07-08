package guru.springframework.spring5mvcrest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Adetola on 06/07/2019
 */
@Data
public class CustomerDTO {


    @ApiModelProperty(value = "Customer's first name", required = true)
    private String firstname;

    @ApiModelProperty(value = "Customer's last name", required = true)
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}
