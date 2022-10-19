ef BF(s1,s2):
 2     """ BF algorithm """
 3     i = 0
 4     j = 0
 5     while(i < len(s1) and j < len(s2)):
 6         if(s1[i] ==  s2[j]):
 7             i += 1
 8             j += 1
 9         else:
10             i = i - j + 1
11             j = 0
12     if(j >= len(s2)):
13         return i - len(s2)
14     else:
15         return 0
16  
17 if __name__ == "__main__":
18     a1="abcaaaabbbbcccabcbabdbcsbbbbnnn"
19     a2='ccabcba'
20     b=BF(a1,a2)
21     print(b)
22     s1 = "ababcabcacbab"
23     s2 = "abcac"
24     print(BF(s1,s2))
