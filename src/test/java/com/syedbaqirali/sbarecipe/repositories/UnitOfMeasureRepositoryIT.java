/**
 * 
 */
package com.syedbaqirali.sbarecipe.repositories;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.syedbaqirali.sbarecipe.domain.UnitOfMeasure;

/**
 * @author rever
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
	
	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.repositories.UnitOfMeasureRepository#findByDescription(java.lang.String)}.
	 */
	@Test
	@DirtiesContext //This reloads the context after this test is done
	public void testFindByDescription() {
		Optional<UnitOfMeasure> uomOPtional = unitOfMeasureRepository.findByDescription("Teaspoon");
		assertEquals("Teaspoon",uomOPtional.get().getDescription());
	}
	
	@Test
	public void testFindByDescriptionCup() {
		Optional<UnitOfMeasure> uomOPtional = unitOfMeasureRepository.findByDescription("Cup");
		assertEquals("Cup",uomOPtional.get().getDescription());
	}

}
