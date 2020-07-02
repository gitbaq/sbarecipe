/**
 * 
 */
package com.syedbaqirali.sbarecipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.syedbaqirali.sbarecipe.domain.Category;

/**
 * @author rever
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{
	Optional<Category> findByDescription(String description);

}
