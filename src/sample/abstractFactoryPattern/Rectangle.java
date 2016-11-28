package sample.abstractFactoryPattern;

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing a rctangle");
    }
}
