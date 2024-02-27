/* Aim:- PracticalNo4
   Author:-Khushi.V.Dhomane
   Version:-4.0
   Date:- 20-02-2024
*/
public class  PracticalNo4
    {

      public static void main(String[] args) 
      {
        
        printName("Khushi Dhomane");
      }

      public static void printName(String name) 
      {
        
        name = name.trim();

        
        String[] parts = name.split(" ");

        
        if (parts.length >= 2) 
        {
            
            String firstName = parts[0];
            String lastName = parts[parts.length - 1];

           
            System.out.println(lastName + ", " + firstName);
        } else
        {
            System.out.println("Invalid name format");
        }
      }
    }