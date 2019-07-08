package guru.springframework.spring5mvcrest.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Adetola on 08/07/2019
 */
@Data
public class VendorDTO {

    @ApiModelProperty(value = "Vendor's name", required = true)
    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}
