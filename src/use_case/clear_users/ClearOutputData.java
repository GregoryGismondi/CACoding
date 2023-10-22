package use_case.clear_users;

public class ClearOutputData {

    private final boolean success;
    private final String[] accounts;
    private boolean useCaseFailed;

    public ClearOutputData(boolean success, String[] accounts, boolean useCaseFailed) {
        this.success = success;
        this.accounts = accounts;
        this.useCaseFailed = useCaseFailed;
    }

    public boolean getSuccess() {
        return success;
    }

    public String[] getAccounts() {
        return accounts;
    }
}
