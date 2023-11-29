

public class Box<GB> {
    private GB things; // Принцип 'Open-Closed' Программа открыта для расширений, но закрыта для изменений.
    private String magic; // Принцип 'Open-Closed' Программа открыта для расширений, но закрыта для изменений.

    public Box(GB things, String magic) {
        this.things = things;
        this.magic = magic;
    }
    @Override
    public String toString() {
        return "Box{" +
                "content=" + things +
                ", description='" + magic + '\'' +
                '}';
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