package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {

        List<String> stations = new ArrayList<>();
        String line;
        String station = null;

        while((line = reader.readLine()) !=null){
            if (line.contains("allomas")) {
                station = line.substring(line.indexOf(": \"") + 3, line.lastIndexOf("\""));
            }
            if (line.contains("\"level\": 3,")){
                stations.add(station);
            }
        }
        stations.sort(Collator.getInstance(new Locale("hu", "HU")));
        return stations;
    }
}
