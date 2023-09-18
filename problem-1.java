

//Problem 1: Program to count occurrences of a given character in a string.

// Count character 'e' in the below string.
//	Input "geeksforgeeks". 
//	Output: 4


// JAVA program to count occurrences
// of a character
 
class GFG
{
    // Method that return count of the given
    // character in the string
    public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }
     
    // Driver method
    public static void main(String args[])
    {
        String str= "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
    }
}

//	Count character '3' in the below string.
//	Input "abccdefgaa."
//	Output : 3
