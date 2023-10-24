package use_case.clear_users;

import data_access.FileUserDataAccessObject;
import entity.User;
// TODO Complete me

public interface ClearUserDataAccessInterface {
    String[] getusernames();
    void delete();
}
