import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates for some currencies
        double usdToEurRate = 0.93;
        double usdToInrRate = 82.55;
        double usdToMyrRate = 4.64;
        double usdToBdtRate = 109.31;
        double usdToBrlRate = 4.87;
        double usdToLkrRate = 324.20;
        double usdToGbpRate = 0.73;
        double usdToJpyRate = 110.28;
        

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.println("Select a currency to convert to:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. Rupee (INR)");
        System.out.println("3. Malaysian Ringgit (MYR)");
        System.out.println("4. Bangladeshi Taka (BDT)");
        System.out.println("5. Brazilian Real (BRL)");
        System.out.println("6. Sri Lankan Rupee (LKR)");
        System.out.println("7. British Pound (GBP)");
        System.out.println("8. Japanese Yen (JPY)");
        int choice = scanner.nextInt();

        double convertedAmount = 0.0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
              convertedAmount = usdAmount * usdToEurRate;
                targetCurrency = "EUR";
                break;  
            case 2:
               convertedAmount = usdAmount * usdToInrRate;
                targetCurrency = "INR";
                break;
            case 3:
                convertedAmount = usdAmount * usdToMyrRate;
                targetCurrency = "MYR";
                break;
            case 4:
                convertedAmount = usdAmount * usdToBdtRate;
                targetCurrency = "BDT";
                break;
            case 5:
                convertedAmount = usdAmount * usdToBrlRate;
                targetCurrency = "BRL";
                break;
            case 6:
                convertedAmount = usdAmount * usdToLkrRate;
                targetCurrency = "LKR";
                break;
            case 7:
                convertedAmount = usdAmount * usdToGbpRate;
                targetCurrency = "GBP";
                break;
            case 8:
                convertedAmount = usdAmount * usdToJpyRate;
                targetCurrency = "JPY";
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        scanner.close();
    }
}