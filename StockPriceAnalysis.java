import java.util.ArrayList;

public class StockPriceAnalysis {
    // Method to calculate average price for array
    public static double calculateAveragePrice(int[] stockPrices) {
        if (stockPrices == null || stockPrices.length == 0) {
            throw new IllegalArgumentException("Stock prices array cannot be empty");
        }
        
        double sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to calculate average price for ArrayList
    public static double calculateAveragePrice(ArrayList<Integer> stockPrices) {
        if (stockPrices == null || stockPrices.isEmpty()) {
            throw new IllegalArgumentException("Stock prices list cannot be empty");
        }
        
        double sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.size();
    }

    // Method to find maximum price in array
    public static int findMaximumPrice(int[] stockPrices) {
        if (stockPrices == null || stockPrices.length == 0) {
            throw new IllegalArgumentException("Stock prices array cannot be empty");
        }
        
        int maxPrice = stockPrices[0];
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to find maximum price in ArrayList
    public static int findMaximumPrice(ArrayList<Integer> stockPrices) {
        if (stockPrices == null || stockPrices.isEmpty()) {
            throw new IllegalArgumentException("Stock prices list cannot be empty");
        }
        
        int maxPrice = stockPrices.get(0);
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price in array
    public static int countOccurrences(int[] stockPrices, int targetPrice) {
        if (stockPrices == null) {
            throw new IllegalArgumentException("Stock prices array cannot be null");
        }
        
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to count occurrences of a specific price in ArrayList
    public static int countOccurrences(ArrayList<Integer> stockPrices, int targetPrice) {
        if (stockPrices == null) {
            throw new IllegalArgumentException("Stock prices list cannot be null");
        }
        
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute cumulative sum for ArrayList
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stockPrices) {
        if (stockPrices == null || stockPrices.isEmpty()) {
            throw new IllegalArgumentException("Stock prices list cannot be empty");
        }
        
        ArrayList<Integer> cumulativeSumList = new ArrayList<>();
        int cumulativeSum = 0;
        
        for (int price : stockPrices) {
            cumulativeSum += price;
            cumulativeSumList.add(cumulativeSum);
        }
        
        return cumulativeSumList;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Array example
        int[] stockPricesArray = {100, 102, 98, 105, 103, 99, 101, 106, 104, 107};
        
        // ArrayList example
        ArrayList<Integer> stockPricesList = new ArrayList<>();
        for (int price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Demonstrate method calls
        System.out.println("Array Operations:");
        System.out.println("Average Price: " + calculateAveragePrice(stockPricesArray));
        System.out.println("Maximum Price: " + findMaximumPrice(stockPricesArray));
        System.out.println("Occurrences of 101: " + countOccurrences(stockPricesArray, 101));

        System.out.println("\nArrayList Operations:");
        System.out.println("Average Price: " + calculateAveragePrice(stockPricesList));
        System.out.println("Maximum Price: " + findMaximumPrice(stockPricesList));
        System.out.println("Occurrences of 101: " + countOccurrences(stockPricesList, 101));

        System.out.println("\nCumulative Sum:");
        ArrayList<Integer> cumulativeSumList = computeCumulativeSum(stockPricesList);
        System.out.println(cumulativeSumList);
    }
}