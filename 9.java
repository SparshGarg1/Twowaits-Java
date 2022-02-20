public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
         
        System.out.println(namesList);  
         
        
        namesList.remove(1);
         
        System.out.println(namesList); 
    }
}