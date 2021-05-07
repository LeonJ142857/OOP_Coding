package com.company.Inheritance;
import java.util.Arrays;
import java.util.LinkedList;
public class Driver {
    public static void main(String[] args) {
    }
    public int countSpecimens(Specimen[] animals, Species s){
        int count = 0;
        for(Specimen animal: animals)
            if(animal.getTOA().getSpeciesName().equals(s.getSpeciesName())) ++count;
        return count;
    }
    public LinkedList<String> listSpecies(Specimen[] animals){
        LinkedList<String> specieses = new LinkedList<String>();
        for(Specimen animal : animals){
            String animal_sp = animal.getTOA().getSpeciesName();
            boolean found = false;
            for(String species : specieses) {
                if (animal_sp.equals(species)) {
                    found = true;
                    break;
                }
            }
            if(!found) specieses.add(animal_sp);
        }
        return specieses;
    }
    public LinkedList<Specimen> makeList(Specimen[] animals){
        return new LinkedList<Specimen>(Arrays.asList(animals));
    }
    public LinkedList<Species> makeSpeciesList(Specimen[] animals){
        LinkedList<Species> speciesList = new LinkedList<Species>();
        for(Specimen animal: animals)
            speciesList.add(animal.getTOA());
        return speciesList;
    }
    public LinkedList<Species> makeSpeciesListUnique(LinkedList<Species> allSpecies){
        LinkedList<Species> uniqueSpeciesList = new LinkedList<Species>();
        for(Species species : allSpecies){
            boolean found = false;
            for(Species sp : uniqueSpeciesList){
                if(species.getSpeciesName().equals(sp.getSpeciesName())){
                    found = true;
                    break;
                }
            }
            if(!found) uniqueSpeciesList.add(species);
        }
        return uniqueSpeciesList;
    }
}
