import db.DBHelper;
import models.Wizard;

public class runner {

    public static void main(String[] args) {


        Wizard wizard1 = new Wizard("Aragorn", "Dark moon");
        DBHelper.save(wizard1);
        Wizard wizard2 = new Wizard("Sarahan", "North Greenich");
        DBHelper.save(wizard2);


    }
}