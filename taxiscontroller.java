package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BusesDao;
import model.dao.TaxisDao;
import model.pojo.Buses;
import model.pojo.Taxis;
import model.pojo.Vertex_with_order;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;




public class TaxisController implements Controller{

    
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        System.out.println("ive been called!!!!!!!!!!!!!!!!!!!!!!");
        hsr1.getWriter().println("hahaahahaha man!!!!!!!");
        ModelAndView mv=new ModelAndView("Taxis");
        
        try{
            
            List <Taxis> lst= TaxisDao.Get_Taxis();
            
            Iterator it=lst.iterator();
            //to store bus routes with order!!!
            //HashMap <String,List<Vertex_with_order>> hm=new HashMap();
             //String src=hsr.getParameter("mysource");
            //String dst=hsr.getParameter("mydest");
            while(it.hasNext()){
                Taxis b=(Taxis)it.next();
                
//                if(b.getLocation()!=src){
//                    it.remove();
//                }
                //String myid=b.getId().getBusId();
                //String myvertex=b.getId().getPoint();
                //int myorder=b.getFare();
                //Vertex_with_order vx=new Vertex_with_order(myvertex,myorder);
                
                
            }
            
            
           
           
            mv.addObject("taxis",lst);
           
        }catch(Exception e){
            e.printStackTrace();
        }
        return mv;
    
    
    }
    
}
