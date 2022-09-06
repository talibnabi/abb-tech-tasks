package project.util;

import project.controller.FamilyController;
import project.dao.data.CollectionFamilyDao;
import project.service.FamilyService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class FamilyUtil {
    public static final Random random = new Random();
    public static final Date date = new Date();
    public static final Scanner scanner = new Scanner(System.in);

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static final FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));


}
