import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    List<BarObserver> observers;

    Bar(List<BarObserver> barObserverList) {
        this.observers = barObserverList;
    }

    Bar() {
        this.observers = new ArrayList<>();
    }

    public boolean isHappyHour() {return false;}
    public void startHappyHour() {
    }
    public void endHappyHour() {
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour())
                observer.happyHourStarted(this);
            else
                observer.happyHourEnded(this);
    }

}
