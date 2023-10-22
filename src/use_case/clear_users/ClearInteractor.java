package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void exectue(ClearInputData clearInputData) {
        String[] accounts = clearDataAccessObject.clear();


        ClearOutputData clearOutputData = new ClearOutputData(true, accounts, false);
        clearPresenter.prepareView(clearOutputData);
    }
}
