import db.DBHelper;
import models.Codeclanner;
import models.Wizard;

public class runner {

    public static void main(String[] args) {


        Wizard wizard1 = new Wizard("Aragorn", "Dark moon");
        DBHelper.save(wizard1);
        Wizard wizard2 = new Wizard("Sarahan", "North Greenich");
        DBHelper.save(wizard2);

        Codeclanner codeclanner1 = new Codeclanner("Emily", "E25", 29);
        Codeclanner codeclanner2 = new Codeclanner("Suzan", "E25", 33);
        Codeclanner codeclanner3 = new Codeclanner("Adam", "E21", 22);
        DBHelper.save(codeclanner1);
        DBHelper.save(codeclanner2);
        DBHelper.save(codeclanner3);

    }
}