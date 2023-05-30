public class DogOwner {
    private final String name;
    private final String sex;
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void editDogName(String name) {
        if (dog != null) {
            dog.setName(name);
        }
    }

    public void raiseDogAge() {
        if (dog != null) {
            dog.raiseAge();
        }
    }

    @Override
    public String toString() {
        return "Dogowner " + name
                + " heeft een " + dog.getSex()
                + ", deze is " + dog.getAge()
                + " jaar oud en van het soort: " + dog.getSpecies()
                + " De hond heet: " + dog.getName();
    }
}
