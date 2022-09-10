package project.dao.data;

import project.dao.inter.FamilyDao;
import project.model.impl.human.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private final List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return this.families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return this.families.get(index);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteFamily(int index) {
        try {
            this.families.remove(index);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        try {
            this.families.remove(family);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public Family saveFamily(Family family) {
        if (this.families.contains(family)) {
            this.families.set(this.families.indexOf(family), family);
        } else {
            this.families.add(family);
        }
        return family;
    }
}
