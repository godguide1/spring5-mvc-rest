package guru.springframework.spring5mvcrest.repositories;

import guru.springframework.spring5mvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adetola on 05/07/2019
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
