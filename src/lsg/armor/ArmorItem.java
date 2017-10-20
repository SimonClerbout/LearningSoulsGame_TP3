package lsg.armor;

/**
 * Created by sclerbou on 19/10/17.
 */
public class ArmorItem {

    private String name;
    private float armorValue;


    public String getName(){

        return name;

    }

    public float getArmorValue(){

        return armorValue;

    }


    public ArmorItem(String name, float armorValue){

        this.name = name;
        this.armorValue = armorValue;

    }

    @Override
    public String toString() {

        return(name + "(" + armorValue + ")");

    }
}
