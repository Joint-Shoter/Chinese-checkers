import java.awt.*;
import java.util.ArrayList;

public class nucleus implements Cloneable{
    private Color commandColor;
    public nucleus(Color commandColor){
        this.commandColor = commandColor;
    }

    public Color getCommandColor() {
        return commandColor;
    }

    public void setCommandColor(Color commandColor) {
        this.commandColor = commandColor;
    }

    @Override
    public nucleus clone(){
        nucleus e = new nucleus(this.commandColor);
        return e;
    }

}
