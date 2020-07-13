/**
 * 
 */
package com.syedbaqirali.sbarecipe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.syedbaqirali.sbarecipe.domain.Category;

/**
 * @author SBA on 07/05/2020
 *
 */
class CategoryTest {
	Category category;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		category = new Category();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#hashCode()}.
	 */
	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#getRecipes()}.
	 */
	@Test
	void testGetRecipes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#setRecipes(java.util.Set)}.
	 */
	@Test
	void testSetRecipes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#getId()}.
	 */
	@Test
	void testGetId() {
		Long idValue = 4l;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#getDescription()}.
	 */
	@Test
	void testGetDescription() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#setId(Long)}.
	 */
	@Test
	void testSetId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#setDescription(String)}.
	 */
	@Test
	void testSetDescription() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#Category()}.
	 */
	@Test
	void testCategory() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#equals(java.lang.Object)}.
	 */
	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.domain.Category#canEqual(java.lang.Object)}.
	 */
	@Test
	void testCanEqual() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

}
