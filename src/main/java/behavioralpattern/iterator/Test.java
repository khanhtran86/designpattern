package behavioralpattern.iterator;

public class Test {
    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add(new Item("Item 1"));
        collection.add(new Item("Item 2"));
        collection.add(new Item("Item 3"));
        collection.add(new Item("Item 4"));
        collection.add(new Item("Item 5"));
        collection.add(new Item("Item 6"));
        collection.add(new Item("Item 7"));
        collection.add(new Item("Item 8"));
        collection.add(new Item("Item 9"));
        collection.add(new Item("Item 10"));

        //Create Iterator
        AbtractIterator iterator = collection.createIterator();

        iterator.setStep(2);
        for(Item item = iterator.First(); !iterator.IsDone(); item =iterator.Next())
        {
            System.out.println(item.Name);
        }
    }
}
