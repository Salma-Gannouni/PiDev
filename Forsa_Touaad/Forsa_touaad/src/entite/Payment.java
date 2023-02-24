package entite;
import java.util.List;
import service.IServiceBid;
import java.sql.Date;
import java.sql.Time;



public class Payment {
    private int payment_id;
    private String payment_type;
    private int payment_amount;
    private Date payment_date;
    private Time payment_time;

    public Payment() {
    }

    public Payment(int payment_id, String payment_type, int payment_amount, Date payment_date, Time payment_time) {
        this.payment_id = payment_id;
        this.payment_type = payment_type;
        this.payment_amount = payment_amount;
        this.payment_date = payment_date;
        this.payment_time = payment_time;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public int getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(int payment_amount) {
        this.payment_amount = payment_amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Time getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(Time payment_time) {
        this.payment_time = payment_time;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Payment{" +
                "payment_id=" + payment_id +
                ", payment_type='" + payment_type + '\'' +
                ", payment_amount=" + payment_amount +
                ", payment_date=" + payment_date +
                ", payment_time=" + payment_time +
                '}';
    }
}
