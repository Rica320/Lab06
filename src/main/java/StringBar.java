import java.util.List;

public class StringBar extends Bar{
    Boolean happyHour = false;

    StringBar(List<BarObserver> barObserverList) {
        super(barObserverList);
    }

    public StringBar() {
        super();
    }


    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }
}
