
package model.dao;

import java.util.List;
import model.pojo.Buses;
import model.pojo.Distances;
import model.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;


public class BusesDao {

    public static List<Buses> Get_Buses(){
    
        List<Buses> lst=null;
        
        try{
            Session session=HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Buses.class).setProjection(Projections.groupProperty("id"));        
            //criteria.addOrder(Order.asc("id"));
            
            
            String hql="from Buses order by 'bus_id','fare' asc ";
            
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
