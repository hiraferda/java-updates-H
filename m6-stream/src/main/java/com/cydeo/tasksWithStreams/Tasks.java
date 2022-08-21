package com.cydeo.tasksWithStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Tasks {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011,300),
                new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012,710), new Transaction(mario, 2012,700),
                new Transaction(alan, 2012, 950));

        System.out.println("Find all transactions in the year 2011 and sort them by value(small to high)");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("What are all the unique cities where the traders work?");
        transactions.stream()
                .map(trader->trader.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("Find all traders from Cambridge and sort them by name.");
        transactions.stream()
                .filter(trader->trader.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getName()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .forEach(System.out::println);

        System.out.println("Return a string of all traders’ names sorted alphabetically.");
        String names = " ";
        List<String> traderNames = transactions.stream()
                .sorted(comparing(transaction -> transaction.getTrader().getName()))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
        names = traderNames.stream()
                .collect(Collectors.joining(","));
        System.out.println(names);

        System.out.println("Are any traders based in Milan?");
        boolean trueOrFalse = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(trueOrFalse);

        System.out.println("Print the values of all transactions from the traders living in Cambridge.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::toString)
                .forEach(System.out::println);

        System.out.println("What is the highest value of all the transactions?");
        transactions.stream()
                .sorted(comparing(Transaction::getValue).reversed())
                .map(Transaction::getValue)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Find the transaction with the smallest value.");
        transactions.stream()
                .sorted(comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .limit(1)
                .forEach(System.out::println);
    }
}
