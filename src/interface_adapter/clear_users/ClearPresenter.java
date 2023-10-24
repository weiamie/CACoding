package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
    ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response){
        ClearState clearstate = clearViewModel.getState();
        clearstate.SetUsernames(response.getUsernames());
        this.clearViewModel.setState(clearstate);
        this.clearViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();

    }
    //final ClearInputBoundary cleanInput
}
