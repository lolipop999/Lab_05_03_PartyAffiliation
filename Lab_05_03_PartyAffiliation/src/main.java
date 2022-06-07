public class main {
    public static void main(String[] args) {
        String partyAffiliation = "g";

        if (partyAffiliation == "D")
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (partyAffiliation == "R")
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (partyAffiliation == "I")
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("Please choose a party: " + partyAffiliation);
        }
    }
}
