
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        if ((this.cents + addition.cents) <= 100) {
            Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
            return newMoney;// create a new Money object that has the correct worth
        } else {
            Money newMoney = new Money((this.euros + addition.euros + 1), (this.cents + addition.cents - 100));
            return newMoney;
        }

    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if ((this.euros == compared.euros) && (this.cents < compared.cents)) {
            return true;

        }
        return false;
    }

    public Money minus(Money decreaser) {
        if ((this.euros >= decreaser.euros) && (this.cents >= decreaser.cents)) {
            Money newMoney = new Money((this.euros - decreaser.euros), (this.cents - decreaser.cents));

            return newMoney;
        } else if ((this.euros > decreaser.euros) && (this.cents < decreaser.cents)) {
            Money newMoney = new Money(((this.euros - decreaser.euros) - 1), ((this.cents + 100) - decreaser.cents));
            return newMoney;
        } else {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }

    }

}
