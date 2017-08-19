package com.javarush.task.task03.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {

    public static final class Constants {
        private static final String SERVER_NOT_ACCESS = "Server is not accessible for now.";
        private static final String UNAUTHORIZED_USERS = "User is not authorized.";
        private static final String BANNED_USER = "User is banned.";
        private static final String RESTRICTION = "Access is denied.";
    }

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.SERVER_NOT_ACCESS);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.SERVER_NOT_ACCESS, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.UNAUTHORIZED_USERS);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.UNAUTHORIZED_USERS, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.BANNED_USER);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.BANNED_USER, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.RESTRICTION);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.RESTRICTION, cause);
        }
    }
}