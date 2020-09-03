 Simple implementation of the “Snakes and Ladders” game following the stories defined here: http://agilekatas.co.uk/katas/SnakesAndLadders-Kata
 
  
 
 Only the first feature is implemented (called “Moving your token”), that is composed by three User Stories:
 
 Feature 1 - Moving Your Token
 The first feature we want implemented is the ability to move your token across the board using dice rolls. 
 Players will need the ability to roll a die, move their token the number of squares indicated by the dice roll 
 and should win if they land on the final square.
 
 Token Can Move Across the Board
 
     Given the game is started
     When the token is placed on the board
     Then the token is on square 1
     
     Given the token is on square 1
     When the token is moved 3 spaces
     Then the token is on square 4
     
     Given the token is on square 1
     When the token is moved 3 spaces
     And then it is moved 4 spaces
     Then the token is on square 8
 
 Moves Are Determined By Dice Rolls
 
     Given the game is started
     When the player rolls a die
     Then the result should be between 1-6 inclusive
     
     Given the player rolls a 4
     When they move their token
     Then the token should move 4 spaces
 
 Player Can Win the Game
 
     Given the token is on square 97
     When the token is moved 3 spaces
     Then the token is on square 100
     And the player has won the game
     
     Given the token is on square 97
     When the token is moved 4 spaces
     Then the token is on square 97
     And the player has not won the game
 

 
 