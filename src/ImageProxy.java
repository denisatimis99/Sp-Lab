public class ImageProxy implements Picture, Element{
    String url;
    Dimension dim;
    Image realImage;

    ImageProxy(String name)
    {
        this.realImage=new Image(name);
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
    public void print()
    {
        System.out.print("Image : " + this.realImage.getImageName());
    }
    Image loadImage()
    {
        if(realImage == null)
            realImage=new Image(url);
        return realImage;
    }
}
