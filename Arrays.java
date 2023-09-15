public class Arrays
{
    public static void main(String[] args)
    {
        System.out.println(" ") ;
        int iterate;
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        for (iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
        }
        System.out.println(" ");
        for (iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            System.out.print("-");
        }
    }
}