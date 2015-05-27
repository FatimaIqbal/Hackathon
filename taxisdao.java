
package model.dao;

import java.util.List;
import model.pojo.Buses;
import model.pojo.Distances;
import model.pojo.Taxis;
import model.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;


public class TaxisDao {

    public static List<Taxis> Get_Taxis(){
    
        List<Taxis> lst=null;
        
        try{
            Session session=HibernateUtil.getSessionFactory().openSession();
            //Criteria criteria = session.createCriteria(Buses.class).setProjection(Projections.groupProperty("id"));        
            //criteria.addOrder(Order.asc("id"));
            
            
            String hql="from Taxis";
            
            Query query=session.createQuery(hql);
            lst=query.list();
            System.out.println("hkhfdsufhd dsfdshfds fdhfds buses size is : "+lst.size()+ lst.toString());            
            session.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst; 
    }
    
    
}
