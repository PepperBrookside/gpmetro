package gpmetro;
import java.util.ArrayList;
import java.time.*;

public class Bus {
	
	private String route;
	  private boolean outbound;
	  private ArrayList stops = new ArrayList();
	  private String[] days = new String[7];

	  public String getRoute(){
	    return route;
	  }

	  public boolean getOutbound(){
	    return outbound;
	  }

	  public ArrayList getStops(){
	    return stops;
	  }

	  public String[] getDays(){
	    return days;
	  }

}
