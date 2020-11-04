import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String imageName;

    String getImageName()
    {
        return imageName;
    }
    public String url()
    {
        return null;
    }
    public Dimension dim()
    {
        return null;
    }
    public PictureContent contect()
    {
        return null;
    }
    Image (String imageName)
    {
       this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void print()
    {
        System.out.print("Image : " + this.imageName);
    }
}
