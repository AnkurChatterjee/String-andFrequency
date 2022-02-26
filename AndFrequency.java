import java.io.*;
class AndFrequency
{
    static String text;
    int countand, len;
    public AndFrequency()
    {
        text="";
        countand= 0;
        len=text.length();
    }

    public void accept(String n)throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("\nEnter a string: ");
        n=input.readLine();
        text=n;
    }

    public void checkandfreq()
    {
        text=text.trim()+" ";
        String t="";            //null string created to store each word in the string
        char ch;
        int len=text.length(),i;
        for(i=0;i<len;i++)
        {
            ch=text.charAt(i);
            if(ch!=' ')
                t=t+ch;     //storing letters one by one to form a word
            else            //blank space found which indicates end of a word
            {
                if(t.equalsIgnoreCase("and"))
                    countand++;
                t="";
            }
        }
    }

    public void display()
    {
        System.out.println("\nFrequency of and = "+countand);
    }

    public static void main(String arg[])throws IOException
    {
        AndFrequency obj=new AndFrequency();
        obj.accept(text);
        obj.checkandfreq();
        obj.display();
    }
}