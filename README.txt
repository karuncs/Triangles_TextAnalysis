%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%#######Java Assignment Project########%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

1.Task 1 Triangles:
		Write a function to determine the type of a triangle.
		Input values: Three integers, representing the lengths of the sides of a
		triangle.
		Return value: Integer, describing the triangle type:
		1=scalene, 2=isosceles, 3=equilateral, 4=error
		
2. Task 2 Text file analysis
	Create functionality that can read an English text file and list the top 10
	words, sorted by occurrence in descending order.
	There are no requirements to the input/output format, but it must be
	possible to input a specific text file and receive a correct top 10 list in return.
	The text file is restricted to the following format:
	Words consist only of digits and characters from az(upper and lower case).
	Any other character are considered as word separation.
	Extra credit for a solution that:
	Doesn’t	read the entire input file into memory.
	Can handle UTF8 character words.
	Can handle large datasets efficiently.
	
3. Task 3 Container
	Implement a generic "bag" container class that follows the guidelines from
	the Java Collections library with the following restrictions:
	It should be possible to store several equal elements in the bag
	(different from a set)
	Implementation must correctly support generics.



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%#######Project Creation########%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

1. Crete a maven project with a groupId and artifactId in Eclipse/NetBeans/IntelliJ. Maven is a project management tool,
   which can build a tool with many features including, pre-processing, compilation, packaging, 
	testing, distribution, and many more. For instance, Maven creates a test package for unit testing while
	it creates a project along main src, resources, dependencies.
2.	Modify the pom.xml file for required dependencies and versions.
3. Individual classes(3) handle individual tasks.
4. Individual test classes handle corresponding tasks classes, for instance, TrianglesTest class tests Triangles class.

%%%%%****Tasks****%%%%%%%%

%#Task 1: Triangles

1. Write test cases to make sure to get expected values and input values.
2. TrianglesTest class in testpackage tests Triangles class functionality for triangle type which is based on input values including error message.
3. Implements traingle type functionality in Triangle class to determine types of triangles as return value as a integer 

	
%#Task 2:Text file analysis
1. Create test casees to test file existance/extension, readData, sortData in the text file
2. Implement the functionality in step by step: 2a. Verify the file existance, extension of the file and data of the file.
   2b. Read text file line by line 2c. hashmap and text occurances 2d. sorting.

  
%#Task 3: Bag
1. Write test cases for add, remove,etc. for generic data, for instance, String, integer, etc
2. Write generic functionality to satisfy the test cases including parallel values.



%%%%%%%%%Test Data%%%%
Two test files are added with names text.txt and text1.txt
Before testing them you need tochnage the path of those files in testing system 