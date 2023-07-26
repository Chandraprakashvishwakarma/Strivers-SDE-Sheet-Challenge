# Allocate Books
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">
  Chess tournament is going to be organized in Ninjaland.
There will be C chess players going to attend the tournament. All the players will be staying in a hotel. The hotel has N free rooms available for the players, where one player will choose one room to live in. The ith room is at position [il in the hotel. All rooms are in distinct positions.
Focus level of a chess player is defined as the minimum distance between his room and the room of another player.
The overall focus of a tournament is defined as the minimum focus level among all players. You as an organizer obviously want the overall focus as high as possible so you assign the rooms to players such that the overall focus is as high as possible.
For Example,
let say we have 3 players and 5 rooms available and the rooms are at positions:
2 3 4 6
Here the optimal allocation is in rooms 1 3
6 and the overall focus level is 2.

</span><br>
&nbsp;</p>
<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>
rooms: 6   players: 4
arr = [ 6 7 9 13 15 11 ]

<strong>Output: </strong> 2
  
<strong>Explanation: </strong>
  
There is no way by which we can allocate rooms such that every player will have the 3 or more as its least distance to other players. So the answer is 2 and one possible allocation of rooms is as follows.
    Player1 = 6
    Player2 = 9
    Player3 = 11
    Player4 = 13 
</pre>

</div>
