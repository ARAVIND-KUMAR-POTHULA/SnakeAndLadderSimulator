public class snakeAndLadder {

                public static void main(String[] args) {
                        //constants
                         int NO_PLAY = 0;
                         int IS_LADDER = 1;
                         int IS_SNAKE = 2;
                        //variables
                        int player_Position = 0;
                                while (player_Position < 100) {
                                        //computation of rolling die
                                        int rolling_Die = (int) Math.floor(Math.random() * 10) % 6;
                                         rolling_Die += 1;

                                         //computation for option check
                                         int option_Check = (int) Math.floor(Math.random() * 10) % 3;
                                        if (option_Check == IS_LADDER)
                                                player_Position += rolling_Die;
							    if (player_Position > 100)
                                                                  player_Position -= rolling_Die;
                                        else if (option_Check == IS_SNAKE)
                                              player_Position -= rolling_Die;
                                                                 if (player_Position < 0)
                                                                  player_Position = 0;
                                        else if (option_Check == NO_PLAY)
                                                player_Position = player_Position;

                         System.out.println("player position  = " + player_Position);
                        }
        }
}
