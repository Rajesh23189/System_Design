package DesignBird.Version_1;

public class Penguin extends Bird{
    @Override
    public String fly()  //This is Not A Wrong  Method BCZ Penguin Can't fly
            
    {
        return "I Am Not Fly";
    }
    @Override
    public String make_sound(){
        return "I Am Pigeon";
    }
}
