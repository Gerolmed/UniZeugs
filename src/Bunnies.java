public class Bunnies {
    public static int getBunnyPopulation(int month) {
        if(month == 1)
            return 2;
        int population = getBunnyPopulation(month-1);

        System.out.println(population);

        population += (population-population%2);



        return population;
    }

    public static void main(String[] args) {
        System.out.println(getBunnyPopulation(5));
    }
}
