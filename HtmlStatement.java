import java.util.Enumeration;

public class HtmlStatement extends Statement {
  
  public String result_title(Customer aCustomer){
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }
  
  public String result_while(Rental each){
    return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
  }

  public String result_final(Customer aCustomer){
    String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    return result;
  }

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
  
}