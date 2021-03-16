package phaseO;

public class PhaseOMatic1 {

        public static void main(String[] args) {
            String[] wordListOne = {"Kameron", "Kam", "Trenton", "New Jersey", "Java", "2013"};
            String[] wordListTwo = {"Humble", "Hungry", "Ambitious", "Profound", "Foucused"};
            String[] wordListThree = {"annoyed", "Short-tempered", "Smart", "Relaxed"};

            int oneLength = wordListOne.length;
            int twolength = wordListTwo.length;
            int threelength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twolength);
            int rand3 = (int) (Math.random() * threelength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

            System.out.println("What we need is a " + phrase);

        }
    }


