package db;

import models.Attack;
import models.Wizard;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBWizard {

    private static Session session;
    private static Transaction transaction;

    public static void addWizardToAttack(Wizard wizard, Attack attack){
        wizard.addAttack(attack);
        attack.addWizard(wizard);
        DBHelper.update(wizard); // REMEMBER THIS WILL CASCADE UPDATE TO PROJECT
    }

    public static List<Attack> getWizardAttacks(Wizard wizard){
        List<Attack> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Attack.class);
            cr.createAlias("wizards", "wizard"); // ADDED
            cr.add(Restrictions.eq("wizard.id", wizard.getId())); // ADDED
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }

}
