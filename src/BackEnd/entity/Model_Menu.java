
package BackEnd.entity;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {
    String icon;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menutype getType() {
        return type;
    }

    public void setType(Menutype type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, Menutype type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }
    String name;
    Menutype type;
   
    public static enum Menutype{
        TITLE,MENU,EMPTY
    }
}
