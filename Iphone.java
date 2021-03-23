public class Iphone extends Phone
{
    private String model;
    @Override
    public void toCall()
    {
        System.out.printf("Iphone call");
    }
    public Iphone(String model)
    {
        super(model);
    }
}
