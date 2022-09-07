package project.dao.inter;

import project.model.human.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    Family saveFamily(Family family);
    void loadData(List<Family> families);
}
