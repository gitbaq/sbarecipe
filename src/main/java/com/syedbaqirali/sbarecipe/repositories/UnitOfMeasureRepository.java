/**
 * 
 */
package com.syedbaqirali.sbarecipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.syedbaqirali.sbarecipe.domain.UnitOfMeasure;

/**
 * @author rever
 *
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);
}
