In Java also an array is:

a. A collection of similar types of data elements

b. A data structure which is stored at continuous location

c. An indexed data structure

But in Java an array is internally an OBJECT

a. Since array is an object, it is always created
dynamically

b. Since arrays are created at runtime, Java stores them
in heap area.

c. They are created using the keyword new.






###
Sharma Computer A...
Creating An Array
===========
int [ ] arr; // arr is a ref to an integer array
1. Declare reference to the array Rec heap
arr=new int[10];
===========
<data type> [ ] <arr_ref>;
OR Ref to an int array
<data type> <arr_ref>[ ];
01 2 3
2. Declaring the actual array 。。。。
=========: ======= Bow
<arr_ref>=new <data type>[ size ];
༦༠༠
arr
OR
<data type> [] <arr_ref>=new <data type> [size];
OR
<data type> <arr_ref>[ ]=new <data type> [size]; Actual array object
<2> C

