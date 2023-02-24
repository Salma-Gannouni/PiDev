
package entite;
import java.util.List;
import service.IServiceBid;
import java.sql.Date;
import java.sql.Time;


public class Bid  {
    private int id_bid;
    private int bid_amount;
    private Date entry_date;
    private Time entry_time;
    private int active_duration;
    private String type;

    public Bid() {
    }

    public Bid( int bid_amount, int active_duration, String type) {
        this.bid_amount = bid_amount;
        this.active_duration = active_duration;
        this.type = type;
    }
    

    public int getId_bid() {
        return id_bid;
    }

    public int getBid_amount() {
        return bid_amount;
    }

    public int getActive_duration() {
        return active_duration;
    }

    public String getType() {
        return type;
    }

    public void setId_bid(int id_bid) {
        this.id_bid = id_bid;
    }

    public void setBid_amount(int bid_amount) {
        this.bid_amount = bid_amount;
    }
    
  public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public Time getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Time entry_time) {
        this.entry_time = entry_time;
    }

    public void setActive_duration(int active_duration) {
        this.active_duration = active_duration;
    }

    public void setType(String type) {
        this.type = type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bid{" +
                "id_bid=" + id_bid +
                ", bid_amount=" + bid_amount +
                ", active_duration=" + active_duration +
                ", type='" + type + '\'' +
                '}';
    }


}
