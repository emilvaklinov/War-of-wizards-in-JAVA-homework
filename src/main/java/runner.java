import db.DBCodeclanner;
import db.DBHelper;
import models.*;

import java.util.List;

public class runner {

    public static void main(String[] args) {

        Wizard wizard1 = new Wizard("Aragorn", "Dark moon");
        DBHelper.save(wizard1);
        Wizard wizard2 = new Wizard("Sarahan", "North Greenich");
        DBHelper.save(wizard2);

        Master CEO = new Master("Melinda", "CEO", 10);
        DBHelper.save(CEO);
        CEO.setPower(11);
        DBHelper.update(CEO);

        Tutor tutor1 = new Tutor("Ishtvan", "Java 10", CEO);
        Tutor tutor2 = new Tutor("Mark", "Ruby", CEO);
        Tutor tutor3 = new Tutor("Halula", "JavaScript", CEO);
        DBHelper.save(tutor1);
        DBHelper.save(tutor2);
        DBHelper.save((tutor3));
        tutor3.setName("Kim");
        DBHelper.update(tutor3);



        Codeclanner codeclanner1 = new Codeclanner("Emily", "E25", 29, tutor1);
        Codeclanner codeclanner2 = new Codeclanner("Suzan", "E25", 33, tutor1);
        Codeclanner codeclanner3 = new Codeclanner("Adam", "E21", 22, tutor1);
        Codeclanner codeclanner4 = new Codeclanner("Sam", "E20", 29, tutor2);
        Codeclanner codeclanner5 = new Codeclanner("Huan", "E26", 39, tutor2);
        Codeclanner codeclanner6 = new Codeclanner("Margaret", "E11", 22, tutor2);
        Codeclanner codeclanner7 = new Codeclanner("Spiros", "E25", 29, tutor3);
        Codeclanner codeclanner8 = new Codeclanner("Martin", "E19", 33, tutor3);
        Codeclanner codeclanner9 = new Codeclanner("Kim", "E21", 22, tutor3);

        DBHelper.save(codeclanner1);
        DBHelper.save(codeclanner2);
        DBHelper.save(codeclanner3);
        DBHelper.save(codeclanner4);
        DBHelper.save(codeclanner5);
        DBHelper.save(codeclanner6);
        DBHelper.save(codeclanner7);
        DBHelper.save(codeclanner8);
        DBHelper.save(codeclanner9);


        Follower follower1 = new Follower("Ingres", 16, codeclanner1);
        Follower follower2 = new Follower("Hanna", 18, codeclanner2);
        Follower follower3 = new Follower("Jack", 25, codeclanner1);
        DBHelper.save(follower1);
        DBHelper.save(follower2);
        DBHelper.save(follower3);





        List<Follower> codclanner1 = DBCodeclanner.getFollowersForCodeclanner(codeclanner1);
        List<Follower> codclanner2 = DBCodeclanner.getFollowersForCodeclanner(codeclanner2);
        Tutor Suzanstutor = DBCodeclanner.getCodeclannersTutor(codeclanner1);
    }
}