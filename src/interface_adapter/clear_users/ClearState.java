package interface_adapter.clear_users;

public class ClearState {
    private boolean success = false;
    private String[] accounts = null;

    public boolean getSuccess() {
        return success;
    }

    public String[] getAccounts() {
        return accounts;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setAccounts(String[] accounts) {
        this.accounts = accounts;
    }
}
