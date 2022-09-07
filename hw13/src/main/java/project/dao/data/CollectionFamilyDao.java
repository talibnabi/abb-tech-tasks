package project.dao.data;

import project.dao.inter.FamilyDao;
import project.datasource.DataSource;
import project.model.human.Family;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private final List<Family> families = new ArrayList<>();
    private final DataSource dataSource = new DataSource();


    @Override
    public List<Family> getAllFamilies() {
        return this.dataSource.getFamilies();
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return this.dataSource.getFamilies().get(index);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            this.dataSource.getFamilies().remove(index);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        try {
            this.dataSource.getFamilies().remove(family);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public Family saveFamily(Family family) {
        if (this.dataSource.getFamilies().contains(family)) {
            this.dataSource.getFamilies().add(this.dataSource.getFamilies().indexOf(family), family);
        } else {
            this.dataSource.getFamilies().add(family);
        }
        return family;
    }

    @Override
    public void loadData(List<Family> families) throws FileNotFoundException {
        dataSource.setFamilies(families);
        dataSource.writeFamilyToFile();
    }
}
