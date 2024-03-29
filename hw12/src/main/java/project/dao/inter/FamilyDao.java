package project.dao.inter;

import project.model.impl.human.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    void deleteFamily(int index);

    boolean deleteFamily(Family family);

    Family saveFamily(Family family);
}
