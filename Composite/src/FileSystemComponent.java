import java.util.ArrayList;
import java.util.List;

public interface FileSystemComponent {
    List<String> searchContent(String keyword, String currPath);
}
