package Exercices.factory;

import Exercices.models.IShape;
import Exercices.models.Quadrado;

import java.util.HashMap;

public class ShapeFactory {

    private HashMap<String, IShape> shapes;
    public IShape createShape(String type){
        IShape shape = null;

        switch (type){
            case("Quadrado"):
                shape = new Quadrado();

        }

    return null;
    }
}
