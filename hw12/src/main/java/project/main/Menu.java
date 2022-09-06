package project.main;

public class Menu {
    public static StringBuilder menu() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("=====================================================================================================================================");
        stringBuilder.append("- 1. Fill with test data (create several families and save them in the database)\n");
        stringBuilder.append("- 2. Display the entire list of families (displays a list of all families with indexation starting with 1)\n");
        stringBuilder.append("- 3. Display a list of families where the number of people is greater than the specified number\n");
        stringBuilder.append("- 4. Display a list of families where the number of people is less than the specified number\n");
        stringBuilder.append("- 5. Calculate the number of families where the number of members is\n");
        stringBuilder.append("- 6. Create a new family\n");
        stringBuilder.append("- 7. Delete a family by its index in the general list\n");
        stringBuilder.append("- 8. Edit a family by its index in the general list\n");
        stringBuilder.append("- 9. Remove all children over the age of majority (all families remove children over the age of majority - let us assume they have grown up)\n");
        stringBuilder.append("- 10. Exit\n");
        stringBuilder.append("What is your selection? (1-10): ");
        return stringBuilder;
    }

    public static StringBuilder forEdit() {
        System.out.println("=====================================================================================================================================");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("- 1. Give birth to a baby\n");
        stringBuilder.append("- 2. Adopt a child\n");
        stringBuilder.append("- 3. Return to main menu\n");
        stringBuilder.append("What is your selection? (1-3): ");
        return stringBuilder;
    }
}
