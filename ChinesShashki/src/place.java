
import java.awt.*;
public class place {
    private int radius;
    private Point centre;
    private Color nowColor, homeColor;

    public nucleus n;

    public place(Point centre, int radius, Color color){
        this.centre = new Point(centre);
        this.radius = radius;
        this.nowColor = color;
    }
    public place(place p){
        radius = p.radius;
        centre = (Point) p.centre.clone();
        nowColor = p.nowColor;
        homeColor = p.homeColor;
        n = p.n;
    }


    public int getRadius() {
        return radius;
    }

    public Point getCentre() {
        return centre;
    }

    public Color getNowColor() {
        return nowColor;
    }

    public Color getHomeColor() {
        return homeColor;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }


    public void setHomeColor(Color homeColor) {
        this.homeColor = homeColor;
    }

    public nucleus getN() {
        return n;
    }

    public void chengeNucl(nucleus n) throws CloneNotSupportedException {
        this.n =n.clone();
        this.nowColor = n.getCommandColor();
    }
    public void removeNucl(){
        this.n = null;
        this.nowColor = Color.WHITE;
    }
}
