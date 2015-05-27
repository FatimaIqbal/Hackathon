/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojo.Distances;
import model.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
/**
 *
 * @author It Store
 */
public class distanceDao {
    public static List<Distances> Get_Distances(){
    
        List<Distances> lst=null;
        
        try{
            Session session=HibernateUtil.getSessionFactory().openSession();
            
            String hql="from Distances";
            Query query=session.createQuery(hql);
            lst=query.list();
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst; 
    }
}
