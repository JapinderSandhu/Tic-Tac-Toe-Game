
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
 public static void main(String[] args){

  int y=0;
  
  // loop until user says no to new game
  while(y==0){
   
   //Initialize game
   
   // creates an empty array with empty positions
   String[] positions = {" "," "," "," "," "," "," "," "," "};
   //user input for position
   Scanner input = new Scanner(System.in);
   System.out.print("New game started, enter your position:");
   int position =  input.nextInt();
   //initialising variable 
   String newGame;
   int computerPosition;
   
   //position must be decremented by 1 because it goes from 0-8
   positions[position - 1] = "x";

   if(positions[4] == " "){
    positions[4] = "o";
   }
   else{
    positions[0] = "o";
   }

   displayBoard(positions);

   Random rand = new Random();

   int x=0;
   //loop until game is over
   while(x==0){

    System.out.print("Enter Position:");
    position =  input.nextInt();
    
    //while position is not empty 
    while(positions[position-1]!= " "){
     System.out.print("Position already filled, enter another position:");
     position =  input.nextInt();

    }
    positions[position - 1] = "x";

    if(positions[0]=="x" && positions[1] == "x" && positions[2] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;

     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }


    }
    if(positions[0]=="x" && positions[4] == "x" && positions[8] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }

    if(positions[0]=="x" && positions[3] == "x" && positions[6] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[1]=="x" && positions[4] == "x" && positions[7] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }

    }
    if(positions[2]=="x" && positions[5] == "x" && positions[8] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[3]=="x" && positions[4] == "x" && positions[5] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game!?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[6]=="x" && positions[7] == "x" && positions[8] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[2]=="x" && positions[4] == "x" && positions[6] == "x"){
     System.out.println("x wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }


    if(positions[0]==" " || positions[1]==" " || positions[2]==" " || positions[3]==" "
      || positions[4]==" " || positions[5]==" " || positions[6]==" "
      || positions[7]==" " || positions[8]==" "){

     computerPosition = rand.nextInt(9) + 1;

     while(positions[computerPosition-1] != " "){
      computerPosition = rand.nextInt(9) + 1;

      //if(positions[0]=="x")
     }


     positions[computerPosition - 1] = "o";
    }
    
     
    
    
    //
    if(positions[0]=="o" && positions[1] == "o" && positions[2] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[0]=="o" && positions[4] == "o" && positions[8] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }

    if(positions[0]=="o" && positions[3] == "o" && positions[6] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[1]=="o" && positions[4] == "o" && positions[7] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }

    }
    if(positions[2]=="o" && positions[5] == "o" && positions[8] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[3]=="o" && positions[4] == "o" && positions[5] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[6]=="o" && positions[7] == "o" && positions[8] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }
    if(positions[2]=="o" && positions[4] == "o" && positions[6] == "o"){
     System.out.println("o wins");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
    }

    if(positions[0]!=" " && positions[1]!=" " && positions[2]!=" " && positions[3]!=" "
      && positions[4]!=" " && positions[5]!=" " && positions[6]!=" "
      && positions[7]!=" " && positions[8]!=" "){
     System.out.println("Game is a draw");
     displayBoard(positions);
     x=1;
     System.out.println("New Game?");
     newGame = input.next();
     if(newGame.equals("No") || newGame.equals("NO") || newGame.equals("no") || newGame.equals("nO")){
      y=1;
     }
     
    }
    
    if(x!=1){
     displayBoard(positions);
    }


   }



  }

 }

 public static void displayBoard(String[] positions){
  System.out.println(positions[0] + "|" + positions[1] + "|" + positions[2]);
  System.out.println("-----");
  System.out.println(positions[3] + "|" + positions[4] + "|" + positions[5]);
  System.out.println("-----");
  System.out.println(positions[6] + "|" + positions[7] + "|" + positions[8]);
 }


}
