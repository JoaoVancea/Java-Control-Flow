public class Reservation {
    int guestCount, restaurantCapacity;
    boolean isRestaurantOpen, isConfirmed;

    public Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        } else {
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
        }
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed!");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (isConfirmed) {
            System.out.println("Please enjoy your meal!");
        } else {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        }
    }

    public static void main(String[] args) {
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 3, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}