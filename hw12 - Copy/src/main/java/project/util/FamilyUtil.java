package project.util;

import project.controller.FamilyController;
import project.dao.data.CollectionFamilyDao;
import project.exception.FamilyOverflowException;
import project.model.impl.human.Family;
import project.service.FamilyService;

import java.text.SimpleDateFormat;
import java.util.*;

public class FamilyUtil {
    private static final int familySize = 5;
    public static final Random random = new Random();
    public static final Date date = new Date();
    public static final Scanner scanner = new Scanner(System.in);

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static final FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));


    public static void checkFamily(Family family) {
        if (family.countFamily() >= familySize) {
            throw new FamilyOverflowException("Family count is bigger.");
        }
    }


}
