public class stringy
{
    public static void main(String[] args)
    {
        String idk = "mnomnomno";

        for(int i = 0; i < idk.length(); i++)
        {
            System.out.println(String.valueOf(i) + " : " + idk.substring(i, i+1));
            if(idk.substring(i, i+1).equals("m"))
            {
                System.out.println(String.valueOf(i) + ".1 " + idk);
                idk = idk.substring(0, i) + idk.substring(i + 1, idk.length());
                System.out.println(String.valueOf(i) + ".2 " + idk);
            }
        }
        System.out.println(idk);
    }
}