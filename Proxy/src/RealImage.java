public class RealImage implements Image{
    private String fileName;

    public RealImage(String name){
        fileName=name;
        loadImage();
    }

    public void loadImage(){
        System.out.println("Loading image: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Diaplaying Image: "+fileName);
    }
}
