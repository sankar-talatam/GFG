class Solution:
	def isPalinSent(self, s):
	 
	    newR = ""
	    newS = ""
	    
	    for i in s:
	        if i.isalnum():
	            newS += i.lower()
	   
	    for i in range(len(s)-1,-1,-1):
	        if s[i].isalnum():
	            newR += s[i].lower()
	   
	    if newS != newR:
	        return False
	        
	    return True
		# code here