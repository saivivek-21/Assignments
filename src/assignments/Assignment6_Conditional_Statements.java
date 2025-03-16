package assignments;

public class Assignment6_Conditional_Statements {

	public static void main(String[] args) {
		String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        
        if (creditScore > 750) {
            System.out.println(customerName + " is eligible for the loan.");
        } else if (creditScore >= 650) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40) {
                        System.out.println(customerName + " is eligible for the loan.");
                    } else {
                        System.out.println(customerName + " is not eligible for the loan due to high DTI ratio.");
                    }
                } else {
                    System.out.println(customerName + " is not eligible for the loan due to unemployment.");
                }
            } else {
                System.out.println(customerName + " is not eligible for the loan due to insufficient income.");
            }
        } else {
            System.out.println(customerName + " is not eligible for the loan due to low credit score.");
        }
    }

	}


