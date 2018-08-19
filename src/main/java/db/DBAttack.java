package db;

import models.Attack;
import models.Wizard;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBAttack {

    private static Session session;

    public static List<Wizard> getAttackWizards(Attack attack){
        List<Wizard> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Wizard.class);
            cr.createAlias("attacks", "attack"); // ADDED
            cr.add(Restrictions.eq("attack.id", attack.getId())); // ADDED
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }
}
