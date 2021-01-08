package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(fremantle);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();

        hawthorne.matchResult(fremantle, 1, 0);
        hawthorne.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.showLeagueTable();
    }
}
