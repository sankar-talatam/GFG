# User function Template for python3

class Solution:
    # Function to check if two arrays are equal or not.
    def checkEqual(self, a, b) -> bool:
        #code here
        a = sorted(a)
        b = sorted(b)
        return a==b


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for tc in range(t):
        arr1 = [int(x) for x in input().replace('  ', ' ').strip().split(' ')]
        arr2 = [int(x) for x in input().replace('  ', ' ').strip().split(' ')]
        ob = Solution()
        if ob.checkEqual(arr1, arr2):
            print("true")
        else:
            print("false")
        print("~")
# } Driver Code Ends