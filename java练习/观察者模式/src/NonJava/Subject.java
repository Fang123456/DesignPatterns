package NonJava;

/**
 * Created by AAAAA on 2016/6/30.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
