package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }


    public void execute(){
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.getusernames());
        clearPresenter.prepareSuccessView(clearOutputData);
        userDataAccessObject.delete();
    }
}


