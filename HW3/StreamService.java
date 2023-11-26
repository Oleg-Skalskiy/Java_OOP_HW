import java.util.*;

public class StreamService {
    public void sortingGroup(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}