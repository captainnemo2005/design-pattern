package BuilderPattern;

public class OnlineStoreAccount {

    private static Long id;
    private static String name;
    private static String address;
//    private Long id;
//    private String name;
//    private String address;

    public static class Builder{
        private Long id;
        private String name;
        private String address;

        public Builder(Long id){
            this.id         =       id;
        }

        public Builder withName(String name){
            this.name       =       name;

            return this;
        }

        public Builder withAddress(String address){
            this.address        =       address;

            return this;
        }

        public OnlineStoreAccount build(){
            OnlineStoreAccount onlineStoreAccount       =       new OnlineStoreAccount();
            OnlineStoreAccount.id                       =       this.id;
            OnlineStoreAccount.name                     =       this.name;
            OnlineStoreAccount.address                  =       this.address;

            return onlineStoreAccount;
        }
    }

    private OnlineStoreAccount(){

    }

    String getName(){
        return this.name;
    }
}
