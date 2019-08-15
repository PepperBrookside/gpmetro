package gpmetro;
import java.time.*;
import java.util.ArrayList;


public class Stop {
	private String stopName;
	  private ArrayList times = new ArrayList();
	  private ArrayList<String> transfers = new ArrayList();
	  private boolean outbound;
	  private long lat;
	  private long lon;
}
