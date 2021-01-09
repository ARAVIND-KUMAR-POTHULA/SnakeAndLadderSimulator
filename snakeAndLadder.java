public class snakeAndLadder {
        public static void main(String[] args) {
                        //variables
                        int player_Position = 0;
                        //computation of rolling die
                        double rolling_Die = Math.floor(Math.random() * 10) % 6;
                        rolling_Die += 1;
                        System.out.println("OUTCOME OF ROLLED DIE = " + rolling_Die);
        }
}
