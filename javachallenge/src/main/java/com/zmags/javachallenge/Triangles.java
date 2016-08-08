package com.zmags.javachallenge;

/**
 * Created by karun on 21 Jul 2016
 */
public class Triangles {

	// Determine triangle type based on lengths of sides
	public int getTriangleType(int side1, int side2, int side3) {
		int returnValue = 0; // 1=scalene, 2=isosceles, 3=equilateral and 4=error,
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			returnValue = 4;// 4=error,
		} else {

			if (side1 != side2 && side2 != side3 && side1 != side3) {
				returnValue = 1; // scalene
			} else if ((side1 == side2 && side2 != side3) || (side2 == side3 && side3 != side1) || (side1 == side3 && side3 != side2)) {
				returnValue = 2; // isosceles
			} else if (side1 == side2 && side2 == side3) {
				returnValue = 3; // equilateral
			}
		}
		return returnValue;
	}

}
