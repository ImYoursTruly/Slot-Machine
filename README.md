# Slot-Machine
A java program made by me when I practiced Random import. 

| | | | | - 2 / 17 / 26 - | | | | |

| | - So what does my program do? - | |

The program simulates a slot machine where you get rewarded if three sets of numbers outputs the same.
First, the program asks for the money you will enter:
  Example output:
  Enter how much money hou have: 10

Then, you will choose if you'd "pull the lever" or not using 1 for "Yes", 0 for "No". The Program's function
was made using Random import, declaring an integer for a random number ranging from 1 to 3, and checks if the 
sets were the same.
  Example output:
  1 2 3
  ----- You Lost! -----
  Current attempts: 30
  Money: 2. Pull the lever? 1
  
  2 2 2
  ----- YOU WON! ------
  Attempts: 31
  Reward: 1 pesos
  Money: 2. Pull the lever? 1

For one coin, you pull for a chance to match three sets of number to get a reward that is also randomized
from 1 to 10 using the following syntax: reward = random.nextInt(10) + 1; and is added to the current money(+=)
you have.

What if you ran out of money to use? The program will simply ask if you'd like to enter money once more, and 
the cycle starts again.
  Example output:
  You've got 0 money left. Continue? 0
  Thanks for playing!

Though, once entering 0, the program thanks the user, thus, ending the program.

| | | | | | | | | | - README and program made by yours truly - | | | | | | | | | |
