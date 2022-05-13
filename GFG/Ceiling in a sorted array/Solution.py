class Solution:
    def ceilSearch(self,arr, low, high, x):
        if x <= arr[low]:
            return low
    
        if x > arr[high]:
            return -1 
    
        mid = (low + high)/2; 
    
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            if mid + 1 <= high and x <= arr[mid+1]:
                return mid + 1
            else:
                return ceilSearch(arr, mid+1, high, x)
    
        else:
            if mid - 1 >= low and x > arr[mid-1]:
                return mid
            else:
                return ceilSearch(arr, low, mid - 1, x)