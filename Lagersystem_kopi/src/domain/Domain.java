package domain;

import Interface.*;


public class Domain implements Interface.DomainI
{
    private Object Inventory;
    private String filename;

    public Domain(String filename)
    {
        this.filename = filename;
        Inventory inventory = new Inventory();
        inventory.load(filename);
        
    }


    @Override
    public void load(String filename)
    {

    }

    @Override
    public void store() {

    }

    @Override
    public void addNonFoodItem(String name, double price, String[] materials) {

    }
}
