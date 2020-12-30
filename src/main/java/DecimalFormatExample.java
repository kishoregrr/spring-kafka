import java.text.DecimalFormat;

public class DecimalFormatExample {


    public static void main(String[] args) {

        Double d = 0.9745586809603693;
        DecimalFormat df = new DecimalFormat("0.00");
        Double scorePercentage = Double.valueOf(df.format(d));
        System.out.println("scorePercentage ::"+scorePercentage);

    }
}
