import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForm extends JFrame {

    private List<place> places = new ArrayList<>();
    private boolean takeNucl = false;
    private boolean gameIsStart = false;
    private Color turnMove = Color.RED;
    private JPanel MainPanel;
    private JButton CreateButton;
    private JLabel LabelTurn;
    private int numPlayers;
    private JButton Players2Button;
    private JButton Players4Button;
    private JButton Players6Button;

    private List<Color> commands = new ArrayList<Color>(Arrays.asList(Color.red, Color.YELLOW, Color.PINK, Color.BLUE, Color.ORANGE, Color.GREEN));
    private List<Color> winers = new ArrayList<Color>();
    private int[] score = new int[6];
    private place p1,p2;
    private void createPole() throws CloneNotSupportedException {
        Point centre = new Point(300, 100);
        Point strStart = (Point) centre.clone();
        int radius = 15;
        Color nowColor = Color.WHITE;
        place pl = new place(centre, radius,nowColor);
        nucleus n = new nucleus(Color.RED);
        for (int i = 1; i <= 17; i++){
            pl.setCentre(strStart);
            centre = new Point(strStart);
            if(i == 1) {
                pl.setCentre(centre);
                pl.chengeNucl(n);
                pl.setHomeColor(Color.BLUE);
                places.add(new place(pl));
                strStart.setLocation(strStart.x - radius, strStart.y);
            }else if(i==2){
                pl.setCentre(centre);
                pl.chengeNucl(n);
                pl.setHomeColor(Color.BLUE);
                places.add(new place(pl));
                centre.setLocation(centre.x+radius*2, centre.y);

                pl.setCentre(centre);
                pl.chengeNucl(n);
                pl.setHomeColor(Color.BLUE);
                places.add(new place(pl));
                strStart.setLocation(strStart.x - radius, strStart.y);
            } else if (i == 3) {
                for(int j = 0; j < 3; j++){
                    pl.setCentre(centre);
                    pl.chengeNucl(n);
                    pl.setHomeColor(Color.BLUE);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - radius, strStart.y);
            }else if(i==4){
                for(int j = 0; j < 4; j++){
                    pl.setCentre(centre);
                    pl.chengeNucl(n);
                    pl.setHomeColor(Color.BLUE);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - 9*radius, strStart.y);
            }else if(i == 5){
                for(int j = 0; j < 13; j++){
                    if (j<4){
                        n.setCommandColor(Color.GREEN);
                        pl.setHomeColor(Color.PINK);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.YELLOW);
                        pl.setHomeColor(Color.ORANGE);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i == 6) {
                for(int j = 0; j < 12; j++){
                    if (j<3){
                        n.setCommandColor(Color.GREEN);
                        pl.setHomeColor(Color.PINK);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.YELLOW);
                        pl.setHomeColor(Color.ORANGE);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i == 7) {
                for(int j = 0; j < 11; j++){
                    if (j<2){
                        n.setCommandColor(Color.GREEN);
                        pl.setHomeColor(Color.PINK);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.YELLOW);
                        pl.setHomeColor(Color.ORANGE);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            }else if(i == 8){
                for(int j = 0; j < 10; j++){
                    if (j<1){
                        n.setCommandColor(Color.GREEN);
                        pl.setHomeColor(Color.PINK);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.YELLOW);
                        pl.setHomeColor(Color.ORANGE);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i == 9) {
                for(int j = 0; j < 9; j++){
                    pl.removeNucl();
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - radius, strStart.y);
            } else if (i == 10) {
                for(int j = 0; j < 10; j++){
                    if (j<1){
                        n.setCommandColor(Color.ORANGE);
                        pl.setHomeColor(Color.YELLOW);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.pink);
                        pl.setHomeColor(Color.GREEN);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - radius, strStart.y);
            } else if (i==11) {
                for(int j = 0; j < 11; j++){
                    if (j<2){
                        n.setCommandColor(Color.ORANGE);
                        pl.setHomeColor(Color.YELLOW);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.pink);
                        pl.setHomeColor(Color.GREEN);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - radius, strStart.y);
            } else if (i == 12) {
                for(int j = 0; j < 12; j++){
                    if (j<3){
                        n.setCommandColor(Color.ORANGE);
                        pl.setHomeColor(Color.YELLOW);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.pink);
                        pl.setHomeColor(Color.GREEN);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x - radius, strStart.y);
            } else if (i ==13) {
                for(int j = 0; j < 13; j++){
                    if (j<4){
                        n.setCommandColor(Color.ORANGE);
                        pl.setHomeColor(Color.YELLOW);
                        pl.chengeNucl(n);
                    }else if(j > 8){
                        n.setCommandColor(Color.pink);
                        pl.setHomeColor(Color.GREEN);
                        pl.chengeNucl(n);
                    } else{
                        pl.removeNucl();
                    }
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + 9*radius, strStart.y);
            } else if (i==14) {
                for(int j = 0; j < 4; j++){
                    n.setCommandColor(Color.BLUE);
                    pl.setHomeColor(Color.RED);
                    pl.chengeNucl(n);
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i == 15) {
                for(int j = 0; j < 3; j++){
                    n.setCommandColor(Color.BLUE);
                    pl.setHomeColor(Color.RED);
                    pl.chengeNucl(n);
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i==16) {
                for(int j = 0; j < 2; j++){
                    n.setCommandColor(Color.BLUE);
                    pl.setHomeColor(Color.RED);
                    pl.chengeNucl(n);
                    pl.setCentre(centre);
                    places.add(new place(pl));
                    centre.setLocation(centre.x+radius*2, centre.y);
                }
                strStart.setLocation(strStart.x + radius, strStart.y);
            } else if (i == 17) {
                n.setCommandColor(Color.BLUE);
                pl.setHomeColor(Color.RED);
                pl.chengeNucl(n);
                pl.setCentre(centre);
                places.add(new place(pl));
                strStart.setLocation(strStart.x - radius, strStart.y);
            }


            int y = strStart.y;
            strStart.setLocation(strStart.x  , y + radius*2);

        }
    }

    public MainForm() {
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!takeNucl){
                    p1 = wherePoint(e.getPoint());
                    if (p1 != null && p1.getNowColor() == turnMove && gameIsStart){
                        nucleus n = new nucleus(turnMove.darker());
                        try {
                            p1.chengeNucl(n);
                            takeNucl = true;
                        } catch (CloneNotSupportedException ex) {
                            throw new RuntimeException(ex);
                        }
                        repaint();
                    }
                }else{
                    p2 = wherePoint(e.getPoint());
                    if (p2 != null && p2.getNowColor() == Color.white && gameIsStart){
                        if(Math.abs(p1.getCentre().x - p2.getCentre().x) < 3*p1.getRadius() && Math.abs(p1.getCentre().y - p2.getCentre().y) < 3*p1.getRadius()){
                            nucleus n = new nucleus(turnMove);
                            try {
                                p2.chengeNucl(n);
                                p1.removeNucl();
                                takeNucl = false;
                                nextStep();
                            } catch (CloneNotSupportedException ex) {
                                throw new RuntimeException(ex);
                            }
                            repaint();
                        }else if(Math.abs(p1.getCentre().x - p2.getCentre().x) < 5*p1.getRadius() && Math.abs(p1.getCentre().y - p2.getCentre().y) < 5*p1.getRadius()){
                            place p3 = wherePoint(new Point(Math.abs(p1.getCentre().x + p2.getCentre().x)/2, Math.abs(p1.getCentre().y + p2.getCentre().y)/2));
                            if(p3 != null){
                                if (p3.getNowColor() != Color.white){
                                    nucleus n = new nucleus(turnMove);
                                    try {
                                        p2.chengeNucl(n);
                                        p1.removeNucl();
                                        takeNucl = false;
                                        nextStep();
                                    } catch (CloneNotSupportedException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                    repaint();
                                }
                            }


                        }

                    } else if (p2 != null && p2.getNowColor() == turnMove && gameIsStart) {
                        nucleus n = new nucleus(turnMove);
                        try {
                            p1.chengeNucl(n);
                        } catch (CloneNotSupportedException ex) {
                            throw new RuntimeException(ex);
                        }

                        p1 = p2;
                        n = new nucleus(turnMove.darker());
                        try {
                            p1.chengeNucl(n);
                            takeNucl = true;
                        } catch (CloneNotSupportedException ex) {
                            throw new RuntimeException(ex);
                        }
                        repaint();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.LabelTurn.setForeground(Color.BLACK);
        this.setMinimumSize(new Dimension(700,700));
        this.pack();
        try {
            createPole();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Players6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPlayers = 6;
                gameIsStart = true;
                takeNucl = false;
                turnMove = Color.RED;
                winers = new ArrayList<>();
                places = new ArrayList<>();
                LabelTurn.setForeground(Color.RED);
                LabelTurn.setText("ХОД КРАСНЫХ");
                try {
                    createPole();
                } catch (CloneNotSupportedException h) {
                    throw new RuntimeException(h);
                }
                repaint();
            }
        });
        Players4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPlayers = 4;
                gameIsStart = true;
                takeNucl = false;
                winers = new ArrayList<>();
                turnMove = Color.YELLOW;
                places = new ArrayList<>();
                LabelTurn.setForeground(Color.YELLOW);
                LabelTurn.setText("ХОД ЖЕЛТЫХ");
                try {
                    createPole();
                } catch (CloneNotSupportedException h) {
                    throw new RuntimeException(h);
                }
                for (place p : places){
                    if(p.getNowColor()==Color.RED || p.getNowColor()==Color.BLUE){
                        p.removeNucl();
                    }
                }
                repaint();
            }
        });
        Players2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numPlayers = 2;
                gameIsStart = true;
                takeNucl = false;
                winers = new ArrayList<>();
                turnMove = Color.RED;
                places = new ArrayList<>();
                LabelTurn.setForeground(Color.RED);
                LabelTurn.setText("ХОД КРАСНЫХ");
                try {
                    createPole();
                } catch (CloneNotSupportedException h) {
                    throw new RuntimeException(h);
                }
                for (place p : places){
                    if(!(p.getNowColor()==Color.RED || p.getNowColor()==Color.BLUE)){
                        p.removeNucl();
                    }
                }
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);

        drawAllPole(g);

    }
    private place wherePoint(Point point){
        for (place p:places) {
            if(p.getCentre().x - p.getRadius() < point.x && point.x < p.getCentre().x + p.getRadius()){
                if(p.getCentre().y - p.getRadius() < point.y && point.y < p.getCentre().y + p.getRadius()){
                    return p;
                }
            }
        }
        return null;
    }

    private void drawAllPole(Graphics g){
        for(place p : this.places){
            drawPlace(g, p);
        }
    }

    private void nextStep(){
        if(numPlayers == 6){
            if (turnMove == Color.RED){
                turnMove = Color.YELLOW;
                LabelTurn.setText("ХОД ЖЕЛТЫХ");
                LabelTurn.setForeground(Color.YELLOW);
            }else if(turnMove == Color.YELLOW){
                turnMove = Color.PINK;
                LabelTurn.setText("ХОД РОЗОВЫХ");
                LabelTurn.setForeground(Color.PINK);
            }else if(turnMove == Color.PINK){
                LabelTurn.setText("ХОД СИНИХ");
                LabelTurn.setForeground(Color.BLUE);
                turnMove = Color.BLUE;
            }else if(turnMove == Color.BLUE){
                LabelTurn.setText("ХОД ОРАНЖЕВЫХ");
                LabelTurn.setForeground(Color.ORANGE);
                turnMove = Color.ORANGE;
            }else if(turnMove == Color.ORANGE){
                LabelTurn.setText("ХОД ЗЕЛЕНЫХ");
                LabelTurn.setForeground(Color.GREEN);
                turnMove = Color.GREEN;
            }else if(turnMove == Color.GREEN){
                //Проверка на окончание игры (предполагается возможность нескольких победителей при условии что они потратили одинаковое колличество ходов)
                for (place p : places){
                    for (int i = 0; i < 6; i++){
                        if(p.getNowColor() == commands.get(i) && p.getNowColor()==p.getHomeColor()){
                            score[i]++;
                            if(score[i] == 10){
                                winers.add(commands.get(i));
                                gameIsStart = false;
                            }
                        }
                    }
                }
                if (winers.size()!=0){
                    String s = "Победу одержали: ";
                    for(Color c : winers){
                        if(c == Color.RED){
                            s = s + "Красные";
                        }else if(c==Color.BLUE){
                            s = s + "Синие";
                        }else if(c==Color.YELLOW){
                            s = s + "Желтые";
                        }else if(c==Color.PINK){
                            s = s + "Розовые";
                        }else if(c==Color.ORANGE){
                            s = s + "Оранжевые";
                        }else if(c==Color.GREEN){
                            s = s + "Зеленые";
                        }

                    }
                    LabelTurn.setText(s);
                    LabelTurn.setForeground(Color.BLACK);
                }else{
                    score = new int[6];
                    LabelTurn.setText("ХОД КРАСНЫХ");
                    LabelTurn.setForeground(Color.RED);
                    turnMove = Color.RED;
                }

            }
        }else if (numPlayers == 4){
            if(turnMove == Color.YELLOW){
                turnMove = Color.PINK;
                LabelTurn.setText("ХОД РОЗОВЫХ");
                LabelTurn.setForeground(Color.PINK);
            }else if(turnMove == Color.PINK){
                LabelTurn.setText("ХОД ОРАНЖЕВЫХ");
                LabelTurn.setForeground(Color.ORANGE);
                turnMove = Color.ORANGE;
            }else if(turnMove == Color.ORANGE){
                LabelTurn.setText("ХОД ЗЕЛЕНЫХ");
                LabelTurn.setForeground(Color.GREEN);
                turnMove = Color.GREEN;
            }else if(turnMove == Color.GREEN) {
                //Проверка на окончание игры (предполагается возможность нескольких победителей при условии что они потратили одинаковое колличество ходов)
                for (place p : places) {
                    for (int i = 0; i < 6; i++) {
                        if (p.getNowColor() == commands.get(i) && p.getNowColor() == p.getHomeColor()) {
                            score[i]++;
                            if (score[i] == 10) {
                                winers.add(commands.get(i));
                                gameIsStart = false;
                            }
                        }
                    }
                }
                if (winers.size()!=0){
                    String s = "Победу одержали: ";
                    for(Color c : winers){
                        if(c == Color.RED){
                            s = s + "Красные";
                        }else if(c==Color.BLUE){
                            s = s + "Синие";
                        }else if(c==Color.YELLOW){
                            s = s + "Желтые";
                        }else if(c==Color.PINK){
                            s = s + "Розовые";
                        }else if(c==Color.ORANGE){
                            s = s + "Оранжевые";
                        }else if(c==Color.GREEN){
                            s = s + "Зеленые";
                        }

                    }
                    LabelTurn.setText(s);
                    LabelTurn.setForeground(Color.BLACK);
                }else {
                    score = new int[6];
                    LabelTurn.setText("ХОД ЖЕЛТЫХ");
                    LabelTurn.setForeground(Color.yellow);
                    turnMove = Color.yellow;
                }

            }
        } else if (numPlayers == 2) {
            if (turnMove == Color.RED){
                turnMove = Color.BLUE;
                LabelTurn.setText("ХОД СИНИХ");
                LabelTurn.setForeground(Color.BLUE);
            }else if(turnMove == Color.BLUE) {
                //Проверка на окончание игры (предполагается возможность нескольких победителей при условии что они потратили одинаковое колличество ходов)
                for (place p : places) {
                    for (int i = 0; i < 6; i++) {
                        if (p.getNowColor() == commands.get(i) && p.getNowColor() == p.getHomeColor()) {
                            score[i]++;
                            if (score[i] == 10) {
                                winers.add(commands.get(i));
                                gameIsStart = false;
                            }
                        }
                    }
                }
                if (winers.size()!=0){
                    String s = "Победу одержали: ";
                    for(Color c : winers){
                        if(c == Color.RED){
                            s = s + "Красные";
                        }else if(c==Color.BLUE){
                            s = s + "Синие";
                        }else if(c==Color.YELLOW){
                            s = s + "Желтые";
                        }else if(c==Color.PINK){
                            s = s + "Розовые";
                        }else if(c==Color.ORANGE){
                            s = s + "Оранжевые";
                        }else if(c==Color.GREEN){
                            s = s + "Зеленые";
                        }

                    }
                    LabelTurn.setText(s);
                    LabelTurn.setForeground(Color.BLACK);
                }else {
                    score = new int[6];
                    LabelTurn.setText("ХОД КРАСНЫХ");
                    LabelTurn.setForeground(Color.RED);
                    turnMove = Color.RED;
                }
            }
        }

    }

    private void drawPlace(Graphics g, place p){
        g.setColor(Color.black);
        g.drawOval(p.getCentre().x - p.getRadius(), p.getCentre().y - p.getRadius(), p.getRadius()*2, p.getRadius()*2);
        if(p.getN() != null){
            g.setColor(p.getNowColor());
            g.fillOval(p.getCentre().x - p.getRadius(), p.getCentre().y - p.getRadius() , p.getRadius()*2, p.getRadius()*2);
        }

    }
}
