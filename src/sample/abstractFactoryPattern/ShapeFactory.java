package sample.abstractFactoryPattern;

class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null ;
    }
}
