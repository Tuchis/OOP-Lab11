package Task3;

public class ProxyImage implements MyImage {
    private String path;
    private RealImage image;

    public ProxyImage(String path){
        this.path = path;
    }

    @Override
    public void display() {
        if (image == null){
            this.image = new RealImage(this.path);
        }
        else{
            this.image.display();
        }
    }
}
