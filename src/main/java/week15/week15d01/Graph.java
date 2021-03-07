package week15.week15d01;

import java.util.Map;

public class Graph {

public Map.Entry<Double,Double> maxEntry(Map<Double,Double> graphOfFunction){
    if (graphOfFunction.size() == 0){
        throw new IllegalArgumentException("Wrong parm!");
    }
    Map.Entry<Double,Double> result = null;
    for (Map.Entry<Double,Double> entry : graphOfFunction.entrySet()){
        if (result.getValue()<entry.getValue()){
            result = entry;
        }
    }
    return result;
}

}
