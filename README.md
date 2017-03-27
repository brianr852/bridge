# bridge
This program simulate the card game Bridge. </br>
</br>
Bridge is a very challenging card game in which two teams of two players each compete for tricks.</br>
The actual game is preceded by bidding, so it is important to know the value of a player's hand, </br>
the estimated strength of the thirteen cards that a player gets during the deal. </br>
Write a program that sorts and evaluates bridge hands. The input is a stream of character pairs </br>
that represent playing cards. Each pair consists of a rank followed by a suit, where: </br>
•	rank is 2, 3, … , 9, T (ten), J (jack), Q (queen), K (king), or A (ace). HINT: Internally you </br>
can represent rank as 2, 3, … , 9, 10, 11 (jack), 12 (queen), 13 (king), and 14 (ace).</br>
•	suit is C (club), D (diamond), H (heart), or S (spade). </br>
</br>
You can assume that each input line represents exactly 13 cards and is error-free. For example,</br>
</br>
2C QD TC AD 6C 3D TD 3H 5H 7H AS JH KH</br>
</br>
represent a hand of  2 of clubs, queen of diamonds, 10 of clubs, ace of diamonds, and so on.</br>
</br>
The input is provided in the file called hands.txt, where each line consists of one hand of 13 cards obtained </br>
from the card dealer. </br>
Your program should form a hand of 13 cards and display it arranged by suits followed by the hand strength </br>
calculated by using the following standard bridge values:</br>
</br>
•	Aces count 4
•	Kings count 3
•	Queens count 2
•	Jacks count 1
•	Voids (no cards in a suit) count 3
•	Singletons (one card in a suit) count 2
•	Doubletons (two cards in a suit) count 1
•	Long suits with more than 5 cards in a suit count 1 for each card over the count of 5. 
For example in the sample run below there are 7 cards in the suit of Hearts, </br>
so there will be 2 points added for the “long suit” </br>
Analyzing hand: 2C QC TC AC 6C 3C TH 3H 5H 7H AH JH KH</br>
Clubs: 	2 Q T A 6 3 </br>
Hearts: 	T 3 5 7 A J K </br>
Total points: 23</br>
</br>
Analyzing hand: 2C QD TC AD 6C 3D TD 3H 5H 7H AS JH KH</br>
Clubs: 	2 T 6 </br>
Diamonds: 	Q A 3 T </br>
Hearts: 	3 5 7 J K </br>
Spades: 	A </br>
Total points: 16</br>
</br>
Analyzing hand: 2C QD TC AD 6H 3D TD 3H 5H 7H AS JH KH</br>
Clubs: 	2 T </br>
Diamonds: 	Q A 3 T </br>
Hearts: 	6 3 5 7 J K </br>
Spades: 	A </br>
Total points: 18</br>
</br>
Analyzing hand: 2C QD TC AD 6S 3D TD 3H 5C 7H AS JH KS</br>
Clubs: 	2 T 5 </br>
Diamonds: 	Q A 3 T </br>
Hearts: 	3 7 J </br>
Spades: 	6 A K </br>
Total points: 14</br>
