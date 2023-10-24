package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    public String TITLE_LABEl = "Message";
    private ClearState state = new ClearState();
    public static final String CLEAR_BUTTON_LABEL = "clear";
    private String[] usernames;
    public ClearViewModel(){super("clear");}
    public void setState(ClearState state){this.state = state;}
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void firePropertyChanged(){support.firePropertyChange("state", null, this.state);}
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState(){return state;}

    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }

    public String getUsername(int i){
        return usernames[i];
    }
}
