import java.util.Scanner;

public class datingsim
{
    public static void main(String[] args)
    { 
     System.out.println("Hello and welcome to dating sim") ;
     System.out.println("Here u will learn how to pick up all da pretty people") ;
     System.out.println("are you a dude or a dudet");
     System.out.println("");
     while(true)
        {
            Scanner scanner1 = new Scanner(System.in);
            String viki = scanner1. nextLine();
            //DO if statement here later)\
            if(viki.equalsIgnoreCase("dude")) 
            {
                System.out.println("Nice, ur a dude now lets find u a fancy girl.");
                System.out.println("Here i have put together a graph of the best dudets in LA.  ");
                System.out.println("Just choose who you would like by typing their name.");
                System.out.println("  ");
                System.out.println("          rebecka");
                System.out.println("smarts ▒▒________%21  ");
                System.out.println("strength ▒▒▒▒___%56  "); 
                System.out.println("looks  ▒▒▒▒▒▒__%91");
                System.out.println("  ");
                System.out.println("          sally   ");
                System.out.println("smarts ▒▒▒▒▒▒__%89  ");
                System.out.println("strength ▒▒______%37");
                System.out.println("looks  ▒▒________%23  ");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("dudet"))
            {
                System.out.println("Nice, ur a dudet now lets find u a hunky chunky man.");
                System.out.println("Here i have put together a graph of the best dudes in LA. ");
                System.out.println("Just choose who you would like by typing their name.  ");
                System.out.println("  ");
                System.out.println("          Carl   ");
                System.out.println("smarts ▒▒▒▒▒▒__%89  ");
                System.out.println("strength ▒▒______%37");
                System.out.println("looks  ▒▒________%23  ");
                System.out.println("  ");
                System.out.println("          chase ");
                System.out.println("smarts ▒▒________%21  ");
                System.out.println("strength ▒▒▒▒___%56  "); 
                System.out.println("looks  ▒▒▒▒▒▒__%91");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("carl"))
            {
                System.out.println("Nice a smart one.  Now for your first date.  where will you take him?  Nice or trashy.  ");
            }
            else if (viki.equalsIgnoreCase("chase"))
            {
                System.out.println("Nice a hunky one.  Now for your first date.  Where will you take him?  Nice or trashy.  ");
            }
            else if (viki.equalsIgnoreCase("Rebecka"))
            {
                System.out.println("Nice a sassy one.  Now for your first date.  Where will you take her?  Fancey or cheap.  ");
            }
             else if (viki.equalsIgnoreCase("sally"))
            {
                System.out.println("Nice a smart one.  Now for your first date.  Where will you take her?  Fancey or cheap.");
            }
            else if (viki.equalsIgnoreCase("fancey"))
            {
                System.out.println("she likes it and she takes you to here house.  A few days go by and she texts you hey come over ");
                System.out.println("go or stay home");
            }
            else if (viki.equalsIgnoreCase("cheap"))
            {
                System.out.println("she gives you a weird look when you say you guys are going to mcdonalds.  She says 5mins in she has something to do and leaves");
                System.out.println( "do you follow her home or leave in shame");
            }
            else if (viki.equalsIgnoreCase("nice"))
            {
                System.out.println("You guys talk and find out you guys have a lot incomin he asks if you want to go to his house what do you say");
                System.out.println("Yes or no");
            }
            else if (viki.equalsIgnoreCase("no"))
            {
                System.out.println("you leave and say no, you never see him ever ");
                System.out.println("You Loose");
            }
            else if (viki.equalsIgnoreCase("yes"))
            {
                System.out.println("you go to his house and find out he is a horter.  You tell him you have something to do and leaves");
                System.out.println("you never talk to him ever again.  You loose");
            }
            else if (viki.equalsIgnoreCase("stay home"))
            {
                System.out.println("you never hear from them again.  you come to the conclusion that you will be lonly forever");
                System.out.println("You are lonly forever.  You loose");
            }
             else if (viki.equalsIgnoreCase("go"))
            {
                System.out.println("You guys date for 3 months and you guys get married and have 2 babies");
                System.out.println("but you get in a car crash and die");
            }
             else if (viki.equalsIgnoreCase("trashy"))
            {
                System.out.println("when you and him get to your house for dinner and you say we will having ramen, he does not look happy he sayes he has to go.");
                System.out.println("do you grab his hand or let him go");
            }
            else if (viki.equalsIgnoreCase("follow her home"))
            {
                System.out.println("You follow her home and hide behind a bush.  She sees you and calls the cops you get arrested and you are put in jail");
                System.out.println("You Loose.  You will be lonely forever");
            }
            else if (viki.equalsIgnoreCase("end") || viki.equalsIgnoreCase("powerdown") || viki.equalsIgnoreCase("stop") || viki.equalsIgnoreCase("leave") || viki.equalsIgnoreCase("bye"))
            {
                System.out.println("sa dude");   
                System.exit(0);
            }
            else if (viki.equalsIgnoreCase("leave in shame"))
            {
                System.out.println("You drive home crying.  You get home chug a cold one while crying yourself to sleep.");
                System.out.println("You wake up and get a text from her she says she can hang out today you say yes.");
            }
            else if (viki.equalsIgnoreCase("grab his hand"))
            {
                System.out.println("You grab his hand and he pulls it away you guys stair at each other until he says he has to go  ");
                System.out.println("You eat your ramen while petting your get you relize you will be lonly forever.  You loose");
            }
            else if (viki.equalsIgnoreCase("let him go"))
            {
                System.out.println("right when he leaves you grab your phone and make a tinder.  The next day a guy says he would like to go out.");
                System.out.println("The profile pic is a picture of a homeless guy with no teeth.  You start crying.  You loose");
            }
            else
            {
                System.out.println("what dude??");
                System.out.println("  ");
            }
    }
}
}
