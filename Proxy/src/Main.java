import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> imageList = new ArrayList<>();
        imageList.add(new ProxyImage("idk.jpg"));
        imageList.add(new ProxyImage("example.jpg"));

        imageList.get(0).display();
        imageList.get(1).display();
    }
}