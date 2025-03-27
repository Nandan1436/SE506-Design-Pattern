public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String name){
        filename=name;
    }

    public void getFileName(){
        System.out.println(filename);
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }
        realImage.display();
    }
}
