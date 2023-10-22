package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel {
    private ClearState clearState = new ClearState();
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearState getState() {
        return clearState;
    }

    public void setClearState(ClearState clearState) {
        this.clearState = clearState;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("clearState", null, this.clearState);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
