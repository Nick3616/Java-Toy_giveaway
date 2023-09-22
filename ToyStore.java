import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class ToyStore {
    private List<Toy> toys = new ArrayList();
    private List<Toy> prizeToys = new ArrayList();

    ToyStore() {
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
    }

    public void changeWeight(int toyId, double newWeight) {
        Iterator var4 = this.toys.iterator();

        while(var4.hasNext()) {
            Toy toy = (Toy)var4.next();
            if (toy.getId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }

    }

    public void drawPrize() {
        double totalWeight = this.toys.stream().mapToDouble(Toy::getWeight).sum();
        double randomValue = (new Random()).nextDouble() * totalWeight;

        Toy toy;
        for(Iterator var5 = this.toys.iterator(); var5.hasNext(); randomValue -= toy.getWeight()) {
            toy = (Toy)var5.next();
            if (randomValue < toy.getWeight() && toy.getQuantity() > 0) {
                this.prizeToys.add(toy);
                toy.setQuantity(toy.getQuantity() - 1);
                break;
            }
        }

    }

    public Toy getPrize() {
        if (this.prizeToys.isEmpty()) {
            return null;
        } else {
            Toy toy = (Toy)this.prizeToys.remove(0);
            PrizeFile.writeToFile(toy.toString());
            return toy;
        }
    }
}