package Engine;

import java.util.ArrayList;

import Models.Child;

/**
 * Created by draffe on 14/12/2016.
 */
public class EngineData {

    private static ArrayList<Child> children;

    public EngineData()
    {
        if(EngineData.children==null)
        {

            children = new ArrayList<Child>();
        }

    }

    public void setChildren(ArrayList<Child> hijos)
    {

        children = hijos;
    }

    public ArrayList<Child> getChildren()
    {

        return  children;
    }
}
