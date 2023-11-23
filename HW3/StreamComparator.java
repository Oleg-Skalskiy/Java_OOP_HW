import java.util.*;

public class StreamComparator {

    private Integer id;
    private String name;

    public StreamComparator(String name) {
        this.name = name;
    }

    public StreamComparator(Integer id) {
        this.id = id;

    }

    @Override
    public String toString() {
        return "StreamComparator{"+"id="+id+",name='"+name+'}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}