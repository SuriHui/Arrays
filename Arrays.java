public class Arrays
{
    public static void main(String[] args)
    {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i = 1; i < strArray.length; i++) {
            strArray[i] = strArray[i] + strArray[i-1];
        }
    }
}