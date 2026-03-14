#User function Template for python3

class Solution:
    
    #Function to return a list containing the union of the two arrays.
    def findUnion(self,arr1,arr2):
        s=[]
        for i in arr1:
            s.append(i)
        for j in arr2:
            s.append(j)
        return sorted(set(s))
        
        
                
        '''
        :param a: given sorted array a
        :param n: size of sorted array a
        :param b: given sorted array b
        :param m: size of sorted array b
        :return:  The union of both arrays as a list
        '''
        # code here 








