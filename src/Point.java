/**
 * Created by ismail on 2017-01-31.
 */
public class Point {
    private int x;
    private int y;



    public Point(int x, int y) throws InitHorsCadreException{
        if ((x<= 5) && (y<=7) && (x>0) && (y > 0)) {
            this.x = x;
            this.y = y;
        }
        else {
            throw new InitHorsCadreException();
        }

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int val1){
        x = val1;
    }

    public void déplacer(double abscisses  , double ordonnees ) throws DepHorsCadreException{
        if ((x<= 5) && (y<=7) && (x>0) && (y > 0)) {
            x += abscisses;
            y += ordonnees;
        }
        else {
            throw new DepHorsCadreException();
        }
    }

    public String toString(){
        return "abscisses : " + x + " ordonnees: "+ y;

    }
}
