class ReturnOverride{
    public static void main(String[] args) {
        System.out.println(text.show());
    }
}
class text
{
    static int show()
    {
        try{
            return 20;
        }
        catch(Exception e)
        {
            return 30;
        }
        finally{
            return 55;
        } 
    }
    }