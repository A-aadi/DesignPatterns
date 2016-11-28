package sample.abstractFactoryPattern;

class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
