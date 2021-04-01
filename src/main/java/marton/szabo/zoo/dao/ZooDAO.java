package marton.szabo.zoo.dao;

import java.util.List;

public interface ZooDAO {

    List<String[]> getAllAnimalsData();

    List<String> getAllFoodsData();
}
