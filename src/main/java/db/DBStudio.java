package db;

import models.Film;
import models.Studio;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBStudio {

    private static Session session;


    public static List<Film> getFilmsForStudio(Studio studio) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> results = null;
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("studio", studio));
            results = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}

//    DBSHIP
//    public static List<Pirate> getCrewForShip(Ship ship) {
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<Pirate> results = null;
//        try {
//            Criteria cr = session.createCriteria(Pirate.class);
//            cr.add(Restrictions.eq("ship", ship));
//            results =  cr.list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return results;
//    }

