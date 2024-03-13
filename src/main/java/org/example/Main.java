package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      String型のListです。
        Score score1 = new Score("kimura", "itiro", 98);
        Score score2 = new Score("tanaka", "taro", 90);
        Score score3 = new Score("takahashi", "masato", 88);

        List<Score> scoreList = new ArrayList<>();

        scoreList.add(score1);
        scoreList.add(score2);
        scoreList.add(score3);

        for (Score score : scoreList) {
            if (score.getResult() > 95) {
                System.out.println(score.getFirstName() + " is genius!");
            } else if (score.getResult() >= 90) {
                System.out.println(score.getFirstName() + " is intelligent");
            } else {
                System.out.println(score.getFirstName() + " is average");
            }
        }
//      String型のMapです。try-catch文で例外処理をしています。
            Map<String, String> userMap = new HashMap<>();

            userMap.put("kimura", "Shiga");
            userMap.put("tanaka", "osaka");
            userMap.put("takahashi", "hyougo");
            userMap.put("yokogi", "kyouto");

            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter your name");
            String name = scanner.nextLine();

            try {
                if (userMap.containsKey(name)) {
                    System.out.println(name + " lives in " + userMap.get(name));
                } else {
                    throw new UserNotFoundException("User not found");

                }
            } catch (UserNotFoundException e) {
                System.out.println("This user is not found. please enter your name again!");
            }
    }
}