public class TextStatement extends Statement {

  public String result_title(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String result_while(Rental each) {
    return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
  }

  public String result_final(Customer aCustomer){
    String result;
    result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    return result;
  }
}