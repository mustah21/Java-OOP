import java.io.*;
import java.net.*;


public class Task1 {
    public static void main(String[] args) {
        URL myUrl;
        String line;
        String DELIMITER = ";";
        double temperature = 0;
        int count = 0;
        String firstDay = null;
        double average;


        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println("Malformed URL" + e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader rdr = new InputStreamReader(istream);

            BufferedReader bfReader = new BufferedReader(rdr);
            bfReader.readLine();

            while ((line = bfReader.readLine()) != null) {
                String[] columns = line.split(DELIMITER);
                String currentDate = columns[0].trim();
                String dateTime = currentDate.substring(0, 8);


                if (firstDay == null) {
                    firstDay = dateTime;
                }
                if (!dateTime.equals(firstDay)) {
                    System.out.println("Date has changed from " + firstDay + " to " + dateTime);
                    break;
                }
                temperature += Double.parseDouble(columns[1].replace(",", "."));
                count++;

            }


            average = temperature / count;
            System.out.println("Average: " + average);
            bfReader.close();

        } catch (IOException e) {
            System.err.println("Error opening URL" + e);
        }
    }
}
