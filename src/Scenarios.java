import java.util.Scanner;
public class Scenarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome mysterious traveler! Today you will be entering into the daily class life of Mr. Blackwood. Now without further ado, let us begin!");
        System.out.println("But before you even enter the classroom, we need to discuss what you want to do here");
        System.out.println("If you want to get the rarest reward possible, type Scenario 1");
        System.out.println("If you want to get the next best thing(LOOOOOOOOOOOOOSER) type Scenario 2");
        System.out.println("Yet, if you want to survive the entire Blackwood class...and make everything worth it.. type Scenario 3.");
        String response0 = scan.nextLine();
        if (response0.equals("Scenario 1")) {
            System.out.print("You see Mr. Blackwood as you walk in, would you like to say hello? Please respond here with a yes or no without any spaces or capital letters: ");
            String response = scan.nextLine();
            if (response.equals("yes")) {
                System.out.print("Wonderful! Now, would you like to wait for Mr.Blackwood to say hello back? Please respond here with a yes or no without any spaces or capital letters: ");
                String response2 = scan.nextLine();
                if (response2.equals("yes")) {
                    System.out.println("Mr.Blackwood waved hi! Now we will go to your seat, and open up our computers as we start answering our new tedious lab");
                    System.out.println("You see your friends, Franco and Nicole, sitting across the room. Do you want to go ask them for help and salute them? Please respond here with a yes or no without any spaces or capital letters: ");
                    String response3 = scan.nextLine();
                    if (response3.equals("yes")) {
                        System.out.println("Splendid! I can see that you are quite the social butterfly! Enter the secret number for a reward!");
                        String response4 = scan.nextLine();
                        if (response4.equals("27")) {
                            System.out.println("You have just won.... the grand prize! Please come to 6E26 during 9 and 3/4ths period to collect your reward!");
                        } else {
                            System.out.println("You failed. Just give up now. I'm done with you. ");
                        }
                        {

                        }
                    }
                }
            }
        } else if (response0.equals("Scenario 2")) {
            System.out.print("You see Mr. Blackwood as you walk in, would you like to say hello? Please respond here with a yes or no without any spaces or capital letters: ");
            String response = scan.nextLine();
            if (response.equals("yes")) {
                System.out.print("Wonderful! Now, would you like to wait for Mr.Blackwood to say hello back? Please respond here with a yes or no without any spaces or capital letters: ");
                String response2 = scan.nextLine();
                if (response2.equals("yes")) {
                    System.out.println("Mr.Blackwood waved hi! Now we will go to your seat, and open up our computers as we start answering our new tedious lab");
                    System.out.println("You see your friends, Franco and Nico-.. wait a minute. Isn't that the girl you volunteered with??? Should you greet Franco and her? You guys have been talking after all ");
                    String response3 = scan.nextLine();
                    if (response3.equals("yes")) {
                        System.out.println("You are quite the social butterfly.. or so you think. They both greet you yet you are unsure what to do now. Do you just wanna stand there awkwardly for the next 39 minutes?");
                        String response4 = scan.nextLine();
                        if(response4.equals("yes")) {
                            System.out.println("You choose to just stand there.It is awkward. Franco and Nicole talk a bit and you join in. Mr.Blackwood is too busy on his computer to notice... you idiot why are you still here? Absolute FAILURE. Get out of my sight.");
                        }
                       else  {
                            System.out.println("Good choice. You decide to return back to your seat, great job. You work on your project for a little bit, then you realize you need help again! You only have 2 friends in this class, who do you ask? Franco, or Nicole?");
                            String response5 = scan.nextLine();
                            if(response5.equals("Franco")) {
                                System.out.println("Good choice. He is someone you know, trust and have asked before. He helps you briefly and then you go away, not after having a bit of a conversation with him however and Nicole");
                            }
                            else {
                                System.out.println("The choice.. has been unknown ");
                            }
                        }
                    }
                }

            }
        }
    }
}
