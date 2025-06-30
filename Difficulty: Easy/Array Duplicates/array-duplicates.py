from typing import List


class Solution:
    def findDuplicates(self, arr):
        # code here
        d= {}
        for i in range(len(arr)):
            if arr[i] in d:
                d[arr[i]]+=1
            else:
                d[arr[i]] = 1
        a = []
        for k,v in d.items():
            if v > 1 :
                a.append(k)
        return sorted(a) if a else []


