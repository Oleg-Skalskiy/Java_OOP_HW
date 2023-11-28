

public class Box<GB> {
    private GB things;
    private String magic;

    public Box(GB things, String magic) {
        this.things = things;
        this.magic = magic;
    }

    public GB getThings() {
        return things;
    }

    public void setThings(GB things) {
        this.things = things;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public static <GB> void printBoxContents(Box<GB> box) {
        GB things = box.getThings();
        String magic = box.getMagic();
        System.out.println("Test");
    }
}