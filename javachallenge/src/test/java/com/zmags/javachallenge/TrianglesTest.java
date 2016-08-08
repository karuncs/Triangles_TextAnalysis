
package com.zmags.javachallenge;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Created by karun on 21 Jul 2016
 */
public class TrianglesTest extends TestCase {

	private static Triangles triangle;

	@Test
	public void testTriangleType() throws Exception {
		triangle = new Triangles();
		assertEquals("scalene", 1, triangle.getTriangleType(1, 2, 3));
		assertEquals("isosceles", 2, triangle.getTriangleType(2, 2, 1));
		assertEquals("equilateral", 3, triangle.getTriangleType(2, 2, 2));
		assertEquals("error", 4, triangle.getTriangleType(-1, 0, 1));
	}
}
