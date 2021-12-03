import java.util.List;

public class StringBar extends Bar{
    Boolean happyHour = false;

    StringBar(List<BarObserver> barObserverList) {
        super(barObserverList);
    }

    public StringBar() {

    }


    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
    }
}
