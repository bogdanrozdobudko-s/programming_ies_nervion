public class ReverseName
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("; [ ERR ] No arguments. Exiting...");
            System.exit(1);
        }

        if (args.length > 1)
        {
            System.out.print("; [ ERR ] Too many arguments.");
            System.exit(1);
        }

        String name = args[0];
        int nameLength = name.length();

        for (int i = nameLength - 1 ; i >= 0; i--)
        {
            String nchar;
            nchar = Character.toString(name.charAt(i));
            if (i == (nameLength - 1))
            {
                System.out.print(nchar.toUpperCase());
            } else
            {
                System.out.print(nchar.toLowerCase());
            }
        }
        System.out.println();
    }
}
