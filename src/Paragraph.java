public class Paragraph implements  Element{

    private String text;
    private AlignStrategy textAlignment;
    Paragraph (String text)
    {
        this.text=text;
    }
    public void print()
    {
        System.out.print("Paragraph: " + this.text);
    }
    public void setTextAlignment(AlignStrategy textAlignment)
    {
      this.textAlignment = textAlignment;
    }
}
