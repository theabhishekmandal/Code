'''
  The problem statement is that given two arrays of different sizes which are sorted in ascending order.
  Find the median of two sorted arrays.
  If
       m + n is odd then median is the middle element
       m + n is even then median is (n / 2 + n - 1 / 2) / 2
  The first approach would be creating array of size m + n and arranging the elements in ascending order.
  In that case the time taken would be O(m + n).
 
  Next approach would be to partitioning the two arrays such that, the total elements of x and y on left is
  equal to total elements of x and y on the right. For eg:
 
      x -> x1, x2, x3 | x4, x5, x6
      y -> y1, y2, y3, y4 | y5, y6, y7, y8
      x3 <= y5
      y4 <= x4
      if the above condition satisfies then we are at median of the lists,
      now
           if length of the list is odd then median would be max(x3, y4)
           if length of the list is even then median  would be avg(max(x3, y4), min(y5, x4))
 
      if the above condition does not satisfies then check if x3 > y5, if yes
      then we are too much on the right side of x and will shift to left side by reducing the partitionx by 1
 
      else if y4 > x4 then we are too much on the left side of x and will shift to right side by increasing the
      partitionx by 1
 
      there may be a condition when the partitionx and partitiony might be at a position where there might be
      no elements then at that case we can use +INF and -INF.
 '''
 


def getMedianOfTwoSortedArrays(first:list, second:list) -> int:
    if len(first) > len(second):
        return getMedianOfTwoSortedArrays(second, first)
    x, y = len(first), len(second)
    low, high = 0, x
    while low <= high:
        partitionx = low + ((high - low) >> 1)
        partitiony = ((x + y + 1) >> 1) - partitionx
        maxLeftx = int(-1e9) if partitionx == 0 else first[partitionx - 1]
        minRightx = int(1e9) if partitionx == x else first[partitionx]

        maxLefty = int(-1e9) if partitiony == 0 else second[partitiony - 1]
        minRighty = int(1e9) if partitiony == y else second[partitiony]

        if maxLeftx <= minRighty and maxLefty <= minRightx:
            if ((x + y) & 1) == 0:
                return (max(maxLeftx, maxLefty) + min(minRightx, minRighty)) / 2
            else:
                return float(max(maxLeftx, maxLefty))
        elif maxLeftx > minRighty:
            high = partitionx - 1
        elif maxLefty > minRightx:
            low = partitionx + 1
    exit(-1)

if __name__ == "__main__":
    input()
    first = [int(i) for i in input().strip().split()]
    input()
    second = [int(i) for i in input().strip().split()]

    print(getMedianOfTwoSortedArrays(first, second))
