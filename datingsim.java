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
             else if (viki.equalsIgnoreCase("trashy"))
            {
                System.out.println("when you and him get to your house for dinner and you say we will have 3 mounhth old romin he does not look happy he sayes he has to go.");
                System.out.println("do you grab his hand or let him go");
            }
            else
            {
                System.out.println("what dude??");
                System.out.println("  ");
            }
    }
}
}