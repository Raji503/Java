//Check whether the first character of words in the given sentence is an vowel

import java.util.*;

public class vowfirstchar 
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String lttr = sc.nextLine();
        String sent[] = lttr.split(" ");
        char vow[] = {'a','e','i','o','u'};
        for(int i=0; i<sent.length;i++)
        {
            int flag=0;
            for(int j=0;j<vow.length;j++)
            {
                if(sent[i].charAt(0)==vow[j])
                {
                    System.out.println("The vowel is  "  +vow[j]);
                    flag=1;
                       
                }  
                else if(sent[i].charAt(0)!=vow[j])
                    continue;                       
            }
                if(flag==0)
                System.out.println("The consonant is  " +sent[i].charAt(0));         

        }

    }
 
}
