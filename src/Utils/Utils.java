package Utils;

public class Utils
{
    public static Boolean cekInput(String input)
    {
        try{
            Double.parseDouble(input);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Format input salah!");
            return false;
        }
    }
}
