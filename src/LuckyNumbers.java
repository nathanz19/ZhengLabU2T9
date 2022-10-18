public class LuckyNumbers {
        /* No instance variables */

        /* "empty" constructor with no parameters */
        public LuckyNumbers() { }

    public int randomIntegerBetween(int min, int max) {
            return (int) (Math.random() *(max - min + 1)) + min;
        }

        /* Generates and returns a String containing lucky numbers!

           For this lucky number game, there are 5 balls randomly drawn,
           each between 1 and 65, and one "super ball" between 1 and 30.

           In this game, the same number CAN appear more than once.

           The returned String should have the 6 numbers listed (they do not
           need to be in ascending order): 5 "lucky numbers" between 1 and 65,
           and the last one, the "super ball," between 1 and 30.
           See samples below.

           This method should call your randomIntegerBetween method above multiple times --
            don't rewrite the same code over and over to generate multiple random numbers,
            use your method!
          */
        public String getLuckyNumbers() {
            String str = "Your lucky numbers are: ";
            for (int i = 0; i<5; i++) {
                int num = randomIntegerBetween(1, 65);
                str += num + " ";
            }
            int superBall = randomIntegerBetween(1, 30);
            str += "\n" + "The super ball is: " + superBall;
            return str;
        }
}
