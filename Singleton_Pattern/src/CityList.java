
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityList {
    public List<City> getCities(){
        
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH,mm,ss");
        String timeString = dateFormat.format(now);
       
        System.out.println("Data Loading, please wait...");
        System.out.println(timeString);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
            
        }
        
        
        List<City> cities = new ArrayList<>();
        
        cities.add(new City( "istanbul"));
        cities.add(new City( "Hatay"));
        cities.add(new City( "Anakara"));
        
        return cities;
    }
}
