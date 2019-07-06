package guru.springframework.spring5mvcrest.api.v1.mapper;

import guru.springframework.spring5mvcrest.api.v1.model.CustomerDTO;
import guru.springframework.spring5mvcrest.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adetola on 06/07/2019
 */
public class CustomerMapperTest {

    public static final String FIRSTNAME = "Bill";
    public static final String LASTNAME = "Gate";


    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception {

        //given
        Customer customer = new Customer();

        customer.setFirstname(FIRSTNAME);
        customer.setLastname(LASTNAME);


        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then

        assertEquals(FIRSTNAME, customerDTO.getFirstname());
        assertEquals(LASTNAME, customerDTO.getLastname());

    }

}