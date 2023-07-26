# Longest String with All Prefixes
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">
  Ninja developed a love for arrays and strings so this time his teacher gave him an array of strings, 'A' of size 'N'. Each element of this array is a string. The teacher taught Ninja about prefixes in the past, so he wants to test his knowledge.
A string is called a complete string if every prefix of this string is also present in the array 'A. Ninja is challenged to find the longest complete string in the array 'A'.lf there are multiple strings with the same length, return the lexicographically smallest one and if no string exists, return
"None".
Note:
String 'P' is lexicographically smaller than string 'Q', if:
1. There exists some index 'i' such that for
all 'j' < 'i' , 'P[jJ = Q[jj' and 'Pli] <
Qli]'. E.g. "ninja" < "noder".
2. If 'p' is a prefix of string 'Q', e.g.
"code" < "coder"

Example:
N = 4
A = [ "ab"
, "abc" , "a" , , "bp" ]
Explanation:
Only prefix of the string "a" is "a" which is present in array 'A'. So, it is one of the possible strings.
Prefixes of the string "ab" are "a" and "ab" both of which are present in array 'A'. So, it is one of the possible strings.
Prefixes of the string "bp" are "b" and
"bp". "b" is not present in array 'A'. So, it cannot be a valid string.
Prefixes of the string "abc" are "a","ab" and "abc" all of which are present in array
'A'. So, it is one of the possible strings.
We need to find the maximum length string, so "abc" is the required string.

</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
6
n ni nin ninj ninja ninga

<strong>Output: </strong> ninja
  
<strong>Explanation: </strong>

For test case 1 we have, 

All the prefixes of “ninja” -> “n”, “ni”, “nin”, “ninj” and “ninja” are present in array ‘A’. So, “ninja” is a valid answer whereas for “ninga” , the prefix “ning” is not present in array ‘A’.

So we output “ninja”.

</pre>

</div>
