package entite;
import java.util.List;
import service.IServiceBid;
import java.sql.Date;
import java.sql.Time;


public class Debit_Card {

    private int card_number;
    private String card_type;
    private String name;
    private int cvv;
    private Date exp_date;

    public Debit_Card() {
    }

    public Debit_Card(int card_number, String card_type, String name, int cvv, Date exp_date) {
        this.card_number = card_number;
        this.card_type = card_type;
        this.name = name;
        this.cvv = cvv;
        this.exp_date = exp_date;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Debit_Card{" +
                "card_number=" + card_number +
                ", card_type='" + card_type + '\'' +
                ", name='" + name + '\'' +
                ", cvv=" + cvv +
                ", exp_date=" + exp_date +
                '}';
    }
}
