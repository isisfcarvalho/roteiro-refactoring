import java.util.Enumeration;

public abstract class Statement{

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = result_title(aCustomer);
    while (rentals.hasMoreElements()) {
       Rental each = (Rental) rentals.nextElement();
       //show figures for each rental
       result += result_while(each);
    }
    //add footer lines
    result += result_final(aCustomer);
    return result;
  }
  
  public abstract String result_title(Customer aCustomer);
  public abstract String result_while(Rental each);
  public abstract String result_final(Customer aCustomer);
  
}
