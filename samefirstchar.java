import java.util.*;
public class samefirstchar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words");
        String sent[]= new String[3];
        char c = ' ';
         for (int i=0;i<3;i++)
        {
            sent[i]=sc.next();
        }
        try
        {
       
        for(int i=0;i<3;i++)
        {
            if((sent[i].charAt(0)) == (sent[i+1].charAt(0)))
            {
                c=sent[i+1].charAt(0);
                                
            }
            else
            {
                System.out.println("The first character of the given words are not same");
                break;
            }
            
        }
        
        }
        catch(Exception e)
        {
            
        }
        if(c != ' ')
        {
        System.out.println("The first character of the given words is " +c);
        }
    }
}