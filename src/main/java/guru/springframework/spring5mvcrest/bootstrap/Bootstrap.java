package guru.springframework.spring5mvcrest.bootstrap;

import guru.springframework.spring5mvcrest.domain.Category;
import guru.springframework.spring5mvcrest.domain.Customer;
import guru.springframework.spring5mvcrest.domain.Vendor;
import guru.springframework.spring5mvcrest.repositories.CategoryRepository;
import guru.springframework.spring5mvcrest.repositories.CustomerRepository;
import guru.springframework.spring5mvcrest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Adetola on 06/07/2019
 */
@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;
    private VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();

        loadCustomers();

        loadVendors();
    }

    private void loadCustomers() {
        Customer david = new Customer();
        david.setId(1L);
        david.setFirstname("David");
        david.setLastname("Winter");


        Customer anne = new Customer();
        anne.setId(2L);
        anne.setFirstname("Anne");
        anne.setLastname("Hine");


        Customer liza = new Customer();
        liza.setId(3L);
        liza.setFirstname("Liza");
        liza.setLastname("Eastman");


        Customer freddy = new Customer();
        freddy.setId(4L);
        freddy.setFirstname("Freddy");
        freddy.setLastname("Meyers");


        Customer bill = new Customer();
        bill.setId(5L);
        bill.setFirstname("Bill");
        bill.setLastname("Gates");


        customerRepository.save(david);
        customerRepository.save(anne);
        customerRepository.save(liza);
        customerRepository.save(freddy);
        customerRepository.save(bill);

        System.out.println("Customer Data Loaded = " + customerRepository.count() );
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        System.out.println("Data Loaded = " + categoryRepository.count() );
    }

    private void loadVendors() {

        Vendor westernTasty = new Vendor();
        westernTasty.setId(1L);
        westernTasty.setName("Western Tasty Fruits Ltd.");
        vendorRepository.save(westernTasty);

        Vendor exoticFruits = new Vendor();
        exoticFruits.setId(2L);
        exoticFruits.setName("Exotic Fruits Company");
        vendorRepository.save(exoticFruits);

        Vendor homeFruits = new Vendor();
        homeFruits.setId(3L);
        homeFruits.setName("Home Fruits");
        vendorRepository.save(homeFruits);

        Vendor funFresh = new Vendor();
        funFresh.setId(4L);
        funFresh.setName("Fun Fresh Fruits Ltd.");
        vendorRepository.save(funFresh);

        Vendor nutsCompany = new Vendor();
        nutsCompany.setId(5L);
        nutsCompany.setName("Nuts for Nuts Company");
        vendorRepository.save(nutsCompany);


    }
}