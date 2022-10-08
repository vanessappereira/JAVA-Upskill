package TA11.Ex4;

import java.util.ArrayList;
import java.util.List;

public class cartas {
    private final Rank rank;
    private final Suit suit;

    public enum Rank {DOIS, TRES, QUATRO, CINCO, SEIS, MANILHA, OITO, NOVE, DEZ, J, Q, K, AS}

    public enum Suit {ESPADAS, PAUS, COPAS, OUROS}

    public cartas(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

