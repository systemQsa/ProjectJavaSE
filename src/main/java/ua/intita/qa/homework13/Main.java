package ua.intita.qa.homework13;

import ua.intita.qa.homework13.entiity.User;
import ua.intita.qa.homework13.exception.AgeException;
import ua.intita.qa.homework13.exception.EmailException;
import ua.intita.qa.homework13.exception.NameException;
import ua.intita.qa.homework13.exception.PasswordException;
import ua.intita.qa.homework13.logic.UserSetData;

public class Main {
    public static void main(String[] args) {
        UserSetData userSetData = new UserSetData();
        User user = null;
        boolean interrupt = false;
        try {
            user = userSetData.setDataForUser();
        } catch (PasswordException | NameException | AgeException | EmailException e) {
            interrupt = true;
            System.out.println(e.getMessage());
        }
        if (!interrupt) {
            System.out.println(user);
        }
    }
}
