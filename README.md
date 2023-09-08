# CS497-HW1


1. Loop through every index in nums from 0 to the length - 1. (O(n) complexity)
      At each index i, loop through every value in nums from 1 to the length -1. (O(n) complexity)
        At each index j, check if the sum of the values at indices ii and j is equal to the target.
          If true, create an output array containing integer indices i and j and return it
      If no value pair is found, create and return an output array containing invalid values.
This algorithm has O(n2) complexity because it has an algorithm of O(n) complexity nested within another one, multiplying their complexities.


2. Perform a binary search on the array for the target value (O(log n) complexity)
    Calculate the midpoint of the array (start + end /2)
    Check that the array exists, if not return error output array [1,1].
    Compare the midpoint to the target
      If the midpoint is greater than the target and the mid index is not equal to the start, call the function recursively on the right half of the array.
      If the midpoint is less than the target and the mid index is not equal to the end, call the function recursively on the right half of the array.
      If the midpoint is equal to the target, create an output array of length 2
        Create an iterator i equal to the midpoint index.
        Decrement i, checking until values no longer equal target.
        Increment i and store it as 0th value in array.
        Set i equal to the midpoint index.
        Increment i, checking until values no longer equal target.
        Decrement i and store it as 1st value in array.
        Return the output array.
      Else the target was not found in the array
        Return the error output array [-1, -1]
4. Initialize Node prev and cur and int count = 0
   Traverse the list starting from the head, incrementing count (Complexity O(n))
   Subtract n from the count
   Traverse the list count times, storing the previous node in prev. (Complexity O(1 to n)
   Assign the next pointer of prev to the next node after current
   Current node is now dereferenced and will be garbage collected
This algorithm has O(2n) complexity in the worst case, where the input n is 0, and O(n) complexity in the best case, where the input n equals the length of the list.

