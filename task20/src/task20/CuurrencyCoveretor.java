package task20;
import java.math.*;
import java.util.*;

	public class CuurrencyCoveretor {

		private static final Map<String, BigDecimal> exchangeRate = new HashMap<>();
		
		static {
			exchangeRate.put("USD", BigDecimal.valueOf(1.0));
			
			exchangeRate.put("EUR", BigDecimal.valueOf(0.85));

			exchangeRate.put("USD", BigDecimal.valueOf(0.75));

			exchangeRate.put("USD", BigDecimal.valueOf(83.0));

		}
		
		public static BigDecimal convert(BigDecimal amount, String fromCurrency, String toCurrency) {
			
			if(!exchangeRate.containsKey(fromCurrency) || ! exchangeRate.containsKey(toCurrency)) {
				
				throw new IllegalArgumentException("invalid id currency type. ");
			}
			
			BigDecimal amountInUSD = amount.divide(exchangeRate.get(fromCurrency),4,BigDecimal.ROUND_HALF_UP);
			return amountInUSD.multiply(exchangeRate.get(toCurrency));
		}
		
		
		
		public static void main(String[] args) {
			
			
			BigDecimal amount = new BigDecimal(100);
			
			System.out.println("100 EUR  to  USD : "+ convert(amount, "EUR", "USD") );
			
			amount = BigDecimal.valueOf(100);
			
			System.out.println("100 USD  to  GBP : "+ convert(amount, "USD", "GBP") );
			
			amount = BigDecimal.valueOf(100);
			
			System.out.println("100 GBP  to  INR : "+ convert(amount, "GBP", "INR") );


		}

	}


