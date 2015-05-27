package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BusesDao;
import model.pojo.Buses;
import model.pojo.Vertex_with_order;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;




public class BusesController implements Controller{

    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        System.out.println("ive been called!!!!!!!!!!!!!!!!!!!!!!");
        hsr1.getWriter().println("hahaahahaha man!!!!!!!");
        ModelAndView mv=new ModelAndView("Buses");
        
        try{
            
            List <Buses> lst= BusesDao.Get_Buses();
            
            Iterator it=lst.iterator();
            //to store bus routes with order!!!
            HashMap <String,List<Vertex_with_order>> hm=new HashMap();
            while(it.hasNext()){
                Buses b=(Buses)it.next();
                String myid=b.getId().getBusId();
                String myvertex=b.getId().getPoint();
                int myorder=b.getFare();
                Vertex_with_order vx=new Vertex_with_order(myvertex,myorder);
                
                if(hm.containsKey(myid)){
                    hm.get(myid).add(vx);
                   //List <Vertex_with_order> w= Collections.sort(hm.get(myid),MyComparable.fare);
                   //hm.put(myid,w);
                }else{
                    List <Vertex_with_order> l=new ArrayList();
                    l.add(vx);
                    hm.put(myid,l);
                }
            }
            
            
            String src=hsr.getParameter("mysource");
            String dst=hsr.getParameter("mydest");
            System.out.println("backman!!");
            System.out.println("chk this !! " +hsr.getAttributeNames());
            mv.addObject("users",lst);
            mv.addObject("mysrc",src);
            mv.addObject("mydest",dst);
        }catch(Exception e){
            e.printStackTrace();
        }
        return mv;
    
    
    }
    
}
