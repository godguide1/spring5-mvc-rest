package guru.springframework.spring5mvcrest.repositories;

import guru.springframework.spring5mvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adetola on 06/07/2019
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
