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
                        if (response4.equals("yes")) {
                            System.out.println("You choose to just stand there.It is awkward. Franco and Nicole talk a bit and you join in. Mr.Blackwood is too busy on his computer to notice... you idiot why are you still here? Absolute FAILURE. Get out of my sight.");
                        } else {
                            System.out.println("Good choice. You decide to return back to your seat, great job. You work on your project for a little bit, then you realize you need help again! You only have 2 friends in this class, who do you ask? Franco, or Nicole?");
                            String response5 = scan.nextLine();
                            if (response5.equals("Franco")) {
                                System.out.println("Good choice. He is someone you know, trust and have asked before. He helps you briefly and then you go away, not after having a bit of a conversation with him however and Nicole");
                                System.out.println("Well. The day has been done in this class, as you move to exit, you see Mr.Blackwood becoking you over. You feel fear, is he about to punish me for talking to Franco instead of working? Or will he praise me? Do you wish to go with him, or no? Respond with a yes or a no");
                                String response6 = scan.nextLine();
                                if (response6.equals("yes")) {
                                    System.out.println("He pulls you aside to just say \"Adolfo, goodbye\", and you walk off laughing with Franco as you exit the classroom. You got the good ending");
                                } else {
                                    System.out.println("You just lost the good ending.. you should be ashamed. If you are Franco who is reading this, I expected better. If you are somebody else, you are wise, but not wise enough. Not bad.");
                                }
                            } else {
                                System.out.println("The choice.. is unknown..... You have never asked her for help before, and doing so now, seems awkward. You end up asking Franco instead");
                                System.out.println("Good choice. He is someone you know, trust and have asked before. He helps you briefly and then you go away, not after having a bit of a conversation with him however and Nicole");
                                System.out.println("Well. The day has been done in this class, as you move to exit, you see Mr.Blackwood becoking you over. You feel fear, is he about to punish me for talking to Franco instead of working? Or will he praise me? Do you wish to go with him, or no? Respond with a yes or a no");
                                String response6 = scan.nextLine();
                                if (response6.equals("yes")) {
                                    System.out.println("He pulls you aside to just say \"Adolfo, goodbye\", and you walk off laughing with Franco as you exit the classroom. You got the good ending");
                                } else {
                                    System.out.println("You just lost the good ending.. you should be ashamed. If you are Franco who is reading this, I expected better. If you are somebody else, you are wise, but not wise enough. Not bad.");
                                }
                            }
                        }
                    }
                }

            }

        } else if (response0.equals("Scenario 3")) {
            System.out.println("Good choice traveler. You are now going to move through the most notable Blackwood moments, and maybe you will get the secret ending... the one nobody knows about. ");
            System.out.println("Multi-Universe Start 1: You enter the classroom, thinking it is going to be a good and normal day. Will it be?");
            String response1 = scan.nextLine();
            if (response1.equals("yes")) {
                System.out.println("what. of course it isn't. this is APCSP we are talking about. Why would you think this is going to be fun. Why would you think it is going to be normal???? Choose another scenario, you aren't cut out for this one.");
            } else {
                System.out.println("Good response. We have effectively weeded out the weak from our ranks. Now, go find Franco and talk with him ");
                System.out.println("You hear the bell ring.. I suppose it is time to venture back into your seat and start the work no?");
                String response2 = scan.nextLine();
                if(response2.equals("yes")) {
                    System.out.println("ewwwwww no we will sit with Franco. pathetic. go to another scenario I can't even look at this.");
                }
                else {
                    System.out.println("Good choice. You take the empty seat next to him despite knowing that Nicole will have to sit there. Eh its okay, Blackwood won't care...");
                    System.out.println("Nicole comes over and sits in another seat with her friends.. good your plan has worked");
                    System.out.println("Wait.. you see Blackwood approaching? Oh no, should you go back?");
                    String response3 = scan.nextLine();
                    if (response3.equals("yes")) {
                        System.out.println("you failed. go back. you missed a cruical Blackwood moment. Retrace your steps and find your way back here.. foolish person");
                    }
                    else {
                        System.out.println("A slow tremble overtakes you, as he calls for Nicole to come back and instructs you to exit her seat and stay standing nearby. He begins a LONG speech about discipline and how I can't just sit wherever I would like. Do you stay?");
                        String response4 = scan.nextLine();
                        if (response4.equals("yes")) {
                            System.out.println("You truly are a smart one. IF TODAY WAS AN OPPOSITE DAY WHY WOULD YOU STAY");
                        }
                        else {
                            System.out.println("You walk back to your seat, laughing slightly to yourself as you see Nicole have to bear the burden of it. You feel a twinge of pity, and then return once he has left. You get scolded by both of them while laughing all the while. You have completed the \"Discipline\" Achievement");
                            System.out.println("......................................");
                            System.out.println("Multi-Universe Secret Ending Start: You enter the classroom... what do you think will happen today??");
                            String response5 = scan.nextLine();
                            if (response5.equals("2 hour free class")) {
                                System.out.println("You are either a genius who got this on the first attempt.. or someone who peeked at the code.. or someone");
                            }
                        }
                    }
                }
            }

        }
    }
}