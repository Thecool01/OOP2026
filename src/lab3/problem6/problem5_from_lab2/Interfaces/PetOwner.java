package lab3.problem6.problem5_from_lab2.Interfaces;

import lab3.problem6.problem5_from_lab2.Abstract.Animal;

public interface PetOwner {
    void assignPet(Animal pet);
    void removePet();
    boolean hasPet();
}
