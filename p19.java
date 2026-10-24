class p19{
    public static void main(String[] args) 
    {
        String sen1="ello";
        String sen2="hello";

        if(sen1.compareTo(sen2)==0)
        {
            System.out.println(" Equal");
        }
        else if(sen1.compareTo(sen2)>0)
        {
            System.err.println("postive");
        }
        else
        {
            System.out.println("negative");
        }
        String sen3="hello welcome to one piece world";
        String name=sen3.substring(0,sen3.length()-4);
        System.err.println(name);
    }
}