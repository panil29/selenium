
//Solution.java
import java.lang.*;
class Solution{
    public String solution(String message, int K)
    {
        //Checking message non-empty condition, K value and
        //message length
        if(message==""|| message.length()>500 || K>500|| message.substring(0)==" " || message.charAt(message.length()-1) == ' ')
        {
            System.out.println("Message is non-empty and K should have value between 1-500");
            System.exit(0);
        }
        String crop;

        //Length of message
        int len=message.length();

        //if K value greater than length return message
        if(K>=len)
            return message;

        //Crop message until given value
        crop=message.substring(0,K);

        //Checking middle value or not
        if((message.substring(K+1)==" ")&&(message.substring(K-1)!=" "))
            return crop;

        //Checking crop message with actual length
        if(crop.length()==K)
            return crop;

        //Remove last character
        while(crop.length() >0 && crop.charAt(crop.length()-1) != ' '){
            crop=crop.substring(0,crop.length()- 1);
        }

        //Remove space
        while(crop.length() >0 && crop.charAt(crop.length()-1) == ' '){
            crop=crop.substring(0, crop.length() - 1);
        }
        return crop;
    }
}

//Main.java
//Driver code
class Main{

    //Defining main()
    public static void main(String[] args) {

        //Creating object
        Solution s=new Solution();

        //Test conditions
        String message="Codility We test coders";
        System.out.println(s.solution(message,14));
        String message1="why not";
        System.out.println(s.solution(message1,100));
        String message2="The quick brown fox jumps over the lazy dog";
        System.out.println(s.solution(message2,39));
    }
}

