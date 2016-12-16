package Models;

import java.util.ArrayList;

/**
 * Created by draffe on 14/12/2016.
 */
public class Body    {

    private String modhash;

    public String getModhash() { return this.modhash; }

    public void setModhash(String modhash) { this.modhash = modhash; }

    private ArrayList<Child> children;

    public ArrayList<Child> getChildren() { return this.children; }

    public void setChildren(ArrayList<Child> children) { this.children = children; }

    private String after;

    public String getAfter() { return this.after; }

    public void setAfter(String after) { this.after = after; }

    private Object before;

    public Object getBefore() { return this.before; }

    public void setBefore(Object before) { this.before = before; }
}
