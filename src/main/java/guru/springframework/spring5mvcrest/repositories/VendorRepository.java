package guru.springframework.spring5mvcrest.repositories;

import guru.springframework.spring5mvcrest.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adetola on 08/07/2019
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
