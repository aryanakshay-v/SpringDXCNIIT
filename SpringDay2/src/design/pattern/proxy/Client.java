package design.pattern.proxy;
public class Client
{
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("mypc.com");
            internet.connectTo("any.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}