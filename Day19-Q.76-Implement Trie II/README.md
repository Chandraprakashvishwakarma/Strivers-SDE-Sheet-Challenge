# Implement Trie II
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">
  Ninja has to implement a data structure "TRIE" from scratch.
Nina has to complete some functions.
1) Trie (): Ninja has to initialize the object of this "TRIE" data structure.
2) insert ("WORD"): Ninja has to insert the string "WORD" into this "TRIE" data structure.
3) countWordsEqualTo ( "WORD" ): Ninja has to return how many times this "WORD" is present in this "TRIE".
4) countWordsStartingWith("PREFIX"): Ninjas have to return how many words are there in this "TRIE" that have the string "PREFIX" as a prefix.
5) erase ( "WORD"): Ninja has to delete one occurrence of the string "WORD" from the
"TRIE".

Note:
1. If erase ("WORD') function is called then it is guaranteed that the "WORD" is present in the "TRIE"
2. If you are going to use variables with dynamic memory allocation then you need to release the memory associated with them at the end of your solution.
Can you help Ninja implement the "TRIE" data structure?

</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
1
6
insert samsung
insert samsung
insert vivo
erase vivo
countWordsEqualTo samsung
countWordsStartingWith vi

<strong>Output: </strong> 2 0
  
<strong>Explanation: </strong>
insert “samsung”: we are going to insert the word “samsung” into the “TRIE”.

insert “samsung”: we are going to insert another “samsung” word into the “TRIE”.

insert “vivo”: we are going to insert the word “vivo” into the “TRIE”.

erase “vivo”: we are going to delete the word “vivo” from the “TRIE”.

countWordsEqualTo “samsung”: There are two instances of “sumsung” is present in “TRIE”.

countWordsStartingWith “vi”: There is not a single word in the “TRIE” that starts from the prefix “vi”.
  
</pre>

</div>
