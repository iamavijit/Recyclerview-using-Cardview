package in.avijit.recyclerview;

public class Upload {
    private int imageId;
    private String text;

    public Upload(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public String getText() {
        return text;
    }
}
