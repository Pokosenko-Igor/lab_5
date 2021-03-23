public class Samsung extends Phone
{
    private String model;
    @Override
    public void toCall()
    {
        System.out.printf("Samsung call");
    }
    public Samsung(String model)
    {
        super(model);
    }
}
