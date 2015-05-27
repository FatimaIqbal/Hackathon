package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.BusesDao;
import model.dao.distanceDao;
import model.pojo.Buses;
import model.pojo.Distances;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//import org.jgrapht.*;
    import org.jgrapht.alg.*;
    import org.jgrapht.graph.*;
    import java.util.List;



/**
 *
 * @author It Store
 */
public class DistancesController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv=new ModelAndView("index");
        
        try{
            //<editor-fold defaultstate="collapsed" desc="comment">
            
            //</editor-fold>
            List <Distances> lst= distanceDao.Get_Distances();
            HashMap <String,List> hm=new HashMap();
            Iterator it=lst.iterator();
            
            //creating the whole graph of stops connected to each other
            
            SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>  graph = 
            new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>
            (DefaultWeightedEdge.class);
            
            
            
            while(it.hasNext()){
                Distances di = new Distances();
                di=(Distances)it.next();
                String A=di.getId().getPlaceA();
                String B=di.getId().getPlaceB();
                
                //adding verteces to graph
                graph.addVertex(A);
                graph.addVertex(B);
                graph.addEdge(A,B);
                if(hm.containsKey(A)){
                    hm.get(A).add(B);
                }else{
                    List <String> l=new ArrayList();
                    l.add(B);
                    hm.put(A,l);
                }
                //hm.put(di, lst);
            }
            
            String s=hsr.getParameter("mysrc");
            String d=hsr.getParameter("mydest");
            List shortest_path =   DijkstraShortestPath.findPathBetween(graph, s, d);
            mv.addObject("dist",lst);
            mv.addObject("mymap",hm);
            mv.addObject("mygraph",graph);
            mv.addObject("shortest",shortest_path);
        }catch(Exception e){
            e.printStackTrace();
        }
        return mv;
    
    
    }
    
}
