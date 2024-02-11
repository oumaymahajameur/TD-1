public class Main {
    public static void main(String[] args) {
        // Création d'un objet Animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Mon zoo", "VilleZoo", 50); // Le zoo peut contenir jusqu'à 50 cages

        // Affectation des valeurs aux attributs du zoo
        myZoo.addAnimal(lion); // Ajout de l'animal au zoo

        // Affichage des informations du zoo
        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville : " + myZoo.getCity());
        System.out.println("Nombre de cages : " + myZoo.getNbrCages());
    }

}