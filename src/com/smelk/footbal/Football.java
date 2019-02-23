package com.smelk.footbal;

public class Football {

    public static void main(String[] args) {

        System.out.println(footbalMatch(2, 2, 1, 1));

    }

    public static int footbalMatch(int firstTeamResult, int secondTeamResult, int userPredictionForFirstTeam, int userPredictionForSecondTeam) {
        int result, result1, result2;

        result1 = firstTeamResult == userPredictionForFirstTeam & secondTeamResult == userPredictionForSecondTeam ? 2 : 0;
        result2 = firstTeamResult > secondTeamResult & userPredictionForFirstTeam > userPredictionForSecondTeam || firstTeamResult < secondTeamResult & userPredictionForFirstTeam < userPredictionForSecondTeam | firstTeamResult == secondTeamResult & userPredictionForFirstTeam == userPredictionForSecondTeam ? 1 : 0;

        result = result1 != 0 ? result1 : result2;
        return result;
    }
}