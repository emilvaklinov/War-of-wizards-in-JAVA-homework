package db;

import models.Codeclanner;
import models.Follower;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCodeclanner {

    private static Session session;

    public static List<Follower> getFollowersForCodeclanner(Codeclanner codeclanner) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Follower> results = null;
        try {
            Criteria cr = session.createCriteria(Follower.class);
            cr.add(Restrictions.eq("codeclanner", codeclanner));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }

}
