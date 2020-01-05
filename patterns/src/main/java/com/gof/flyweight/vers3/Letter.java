package com.gof.flyweight.vers3;

public class Letter {

    private TypeParameters parameters;

    //if standard word - set of parameters on default
    public Letter() {
        this.parameters = TypeParameters.DEFAULT;
    }

    //if other typeName -> create with new parameters
    public Letter(String typeName) {
        if (typeName.equals(TypeParameters.DEFAULT.getName())) {
            parameters = TypeParameters.DEFAULT;
        } else {
            parameters = new TypeParameters();
            parameters.setName(typeName);
        }
    }
}
