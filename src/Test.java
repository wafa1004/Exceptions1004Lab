/**
 * Created by ismail on 2017-01-31.
 */
public class Test {
    public static void main (String[] args){
        try{
            Point point = new Point(2,9111);
            point.déplacer(1,1);
            System.out.println(point.toString());
        }
        catch (DepHorsCadreException e1){
            System.out.println("Exception de deplacement interceptée.");
        }
        catch (InitHorsCadreException e2){
            System.out.println("Exception de initialisation interceptée.");
        }
        finally {
            System.out.println("ce block est execute quel que soit la situation.");
        }
    }
}
