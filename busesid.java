package model.pojo;
// Generated May 15, 2015 6:57:35 PM by Hibernate Tools 3.2.1.GA



/**
 * BusesId generated by hbm2java
 */
public class BusesId  implements java.io.Serializable {


     private String busId;
     private String point;

    public BusesId() {
    }

    public BusesId(String busId, String point) {
       this.busId = busId;
       this.point = point;
    }
   
    public String getBusId() {
        return this.busId;
    }
    
    public void setBusId(String busId) {
        this.busId = busId;
    }
    public String getPoint() {
        return this.point;
    }
    
    public void setPoint(String point) {
        this.point = point;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BusesId) ) return false;
		 BusesId castOther = ( BusesId ) other; 
         
		 return ( (this.getBusId()==castOther.getBusId()) || ( this.getBusId()!=null && castOther.getBusId()!=null && this.getBusId().equals(castOther.getBusId()) ) )
 && ( (this.getPoint()==castOther.getPoint()) || ( this.getPoint()!=null && castOther.getPoint()!=null && this.getPoint().equals(castOther.getPoint()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBusId() == null ? 0 : this.getBusId().hashCode() );
         result = 37 * result + ( getPoint() == null ? 0 : this.getPoint().hashCode() );
         return result;
   }   


}


