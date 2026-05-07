abstract class Animal {

    // Shared behavior
    public void eat() {

        System.out.println(
                getClass().getSimpleName()
                        + " is eating"
        );
    }

    public void sleep() {

        System.out.println(
                getClass().getSimpleName()
                        + " is sleeping"
        );
    }
}