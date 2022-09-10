package project.dao.inter;

import project.model.impl.human.Family;

import java.io.FileNotFoundException;
import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    Family saveFamily(Family family) throws FileNotFoundException;

    List<Family> loadData() throws Exception;

    void saveData() throws FileNotFoundException;
}
