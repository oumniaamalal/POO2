package sbj;
import java.util.Date;
public class Transaction {

	private String type;       
    private double montant;     
    private Date date;

    public Transaction(String type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date =  new Date(); 
    }   
    public String getType() {
    	return type;
    }
    public double getMontant() {
    	return montant;
    }
    public void setType(String type) {
    	this.type=type;
    }
    public void setMontant(double montant) {
    	this.montant=montant;
    }
    
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                '}';
    }
   
    
}
