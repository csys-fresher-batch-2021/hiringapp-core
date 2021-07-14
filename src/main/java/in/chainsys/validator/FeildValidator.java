package in.chainsys.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.chainsys.excepiton.FeildShouldNotBeEmptyExceptions;

public class FeildValidator {

		private FeildValidator() {
			// Default Constructor
		}

		/**
		 * This method verifies whether an  id is null or empty
		 * 
		 * @param Id
		 * @return
		 */
		public static boolean isUserIdEmptyAndNull(long id) {
			boolean isAdminNull = true;
			if ((id == 0)) {
				isAdminNull = false;
			}
			return isAdminNull;
		}
		/**
		 * This method verifies whether the length of the ID(number) is valid or not
		 * 
		 * @param Id
		 * @return
		 */
		public static boolean isValidUserIdLength(long id) {
			boolean isValidUserId = false;
			if (Long.toString(id).length() == 10) {
				isValidUserId = true;
			}
			return isValidUserId;
		}
		/**
		 * This method check whether the password format is Valid or not
		 * @param password
		 * @return
		 */
		public static boolean isValidPasswordFormat(String password) {
			boolean isValidFormat = false;
			if (password != null) {
				String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,15}$";
				Pattern regexPattern = Pattern.compile(regex);
				Matcher matchCheck = regexPattern.matcher(password);
				isValidFormat = matchCheck.matches();
			}
			return isValidFormat;
		}
		public static boolean isFeildEmptyNotNull(String value) throws FeildShouldNotBeEmptyExceptions {
			boolean isValid=false;
			if(value!=null) {
				isValid= true;
			}else {
				throw new FeildShouldNotBeEmptyExceptions("Should Not Be Empty");
			}
			return isValid;
		}
}

