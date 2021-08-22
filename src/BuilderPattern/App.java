package BuilderPattern;

public class App {
    public static void main(String[] args) {
        OnlineStoreAccount johnSmith    =       new OnlineStoreAccount.Builder(1L)
                                        .withName("John Smith")
                                        .withAddress("39 Lonsdale Stree")
                                        .build();

        System.out.println(johnSmith.getName());
    }
}
