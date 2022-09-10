package project.dao.data;

import project.dao.inter.FamilyDao;
import project.model.impl.human.Family;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

//import static project.db.DataSource.families;
//import static project.db.read.ReadFamilyFromFile.*;
//import static project.db.write.WriteFamilyToFile.writeFamilyToFile;

public class CollectionFamilyDao implements FamilyDao {
    public static List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return families.get(index);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            families.remove(index);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        try {
            families.remove(family);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public Family saveFamily(Family family) throws FileNotFoundException {
        if (families.contains(family)) {
            families.set(families.indexOf(family), family);
        } else {
            families.add(family);
        }
        return family;
    }

    @Override
    public void loadData() throws Exception {
        FileInputStream fin = new FileInputStream("families.bin");
        ObjectInputStream ois = new ObjectInputStream(fin);
        families = (List<Family>) ois.readObject();
        System.out.println(families);
        ois.close();
        fin.close();
    }

    @Override
    public void saveData() throws IOException {
        FileOutputStream fout = new FileOutputStream("families.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(families);
        oos.close();
        fout.close();
    }

}
