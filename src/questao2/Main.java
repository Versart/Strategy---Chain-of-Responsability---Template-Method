package questao2;

public class Main {
    public static void main(String[] args) {
        LaptopRenderer laptopRenderer = new LaptopRenderer();
        SmartPhoneRenderer smartPhoneRenderer = new SmartPhoneRenderer();
        TVRenderer tvRenderer = new TVRenderer();
        ImageManager imageManager = new ImageManager();

        imageManager.show(laptopRenderer);
        imageManager.show(smartPhoneRenderer);
        imageManager.show(tvRenderer);

    }
}