import java.io.Serializable;

public class DoubleCheckedSingleton implements Serializable {

    private static DoubleCheckedSingleton synchronizedSingletonInstance;

    protected DoubleCheckedSingleton (){
    }

    public static DoubleCheckedSingleton getInstance() {
        if (synchronizedSingletonInstance == null) { // first time lock
            synchronized (DoubleCheckedSingleton.class) {
                if(synchronizedSingletonInstance == null){ // second time lock
                    synchronizedSingletonInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return synchronizedSingletonInstance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

