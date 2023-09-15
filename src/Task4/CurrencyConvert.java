package Task4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** WELCOME TO CURRENCY CONVERTER ***\n1:Rupees\n2:Doller\n3:Pound\n4:Euro\n5:Kuwaiti dinar\nEnter The Currency Code");
        code = sc.nextInt();
        if (code == 1)
        {
            System.out.println("Enter Amount In rupees: ");
            rupee = sc.nextDouble();
            dollar = rupee / 77.34;
            System.out.println("Dollar :"+f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("Pound :"+f.format(pound));
            euro = rupee / 80.36;
            System.out.println("Euro :"+f.format(euro));
            KWD = rupee / 251.92;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 2)
        {
            System.out.println("Enter Amount In Dollar");
            dollar = sc.nextDouble();
            rupee = dollar * 77.34;
            System.out.println("Rupees :"+f.format(rupee));
            pound = dollar * 0.82;
            System.out.println("Pound :"+f.format(pound));
            euro = dollar * 0.96;
            System.out.println("Euro :"+f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 3)
        {
            System.out.println("Enter Amount In Pound");
            pound = sc.nextDouble();
            rupee = pound * 94.43;
            System.out.println("Rupees :"+f.format(rupee));
            dollar = pound * 1.22;
            System.out.println("Dollar :"+f.format(dollar));
            euro = pound * 1.17;
            System.out.println("Euro :"+f.format(euro));
            KWD = pound * 0.3748;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 4)
        {
            System.out.println("Enter Amount In Euro");
            euro = sc.nextDouble();
            rupee = euro * 80.43;
            System.out.println("Rupees :"+f.format(rupee));
            pound = euro * 0.85;
            System.out.println("Pound :"+f.format(pound));
            dollar = euro * 1.04;
            System.out.println("Dollar :"+f.format(dollar));
            KWD = euro * 0.318949;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        } else if (code == 5)
        {
            System.out.println("Enter Amount In Kuwaiti Dinar");
            KWD = sc.nextDouble();
            rupee = KWD * 251.96;
            System.out.println("Rupees :"+f.format(rupee));
            pound = KWD * 2.67;
            System.out.println("Pound :"+f.format(pound));
            euro = KWD * 3.13;
            System.out.println("Euro :"+f.format(euro));
            dollar = KWD * 3.26;
            System.out.println("Kuwaiti dinar :"+f.format(KWD));
        }
        else
            System.out.println("Enter Invalid Code!");
    }
}