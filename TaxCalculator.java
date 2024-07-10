public class TaxCalculator {


  public double calculateTax(double income) {
  
      
      double tax =0;
      if(income <= 30_000){
        tax = income *0.15;
        }else{
        
        tax = income * 0.15;}
        
        return tax;

}
}
