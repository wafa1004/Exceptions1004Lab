/**
 * Created by ismail on 2017-01-31.
 */
public class DepHorsCadreException extends Exception {
    public DepHorsCadreException (){
        System.out.println("Le point est déplacé hors du rectangle 5x7." + this.getStackTrace());
    }
}