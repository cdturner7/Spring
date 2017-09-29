package webapp;

public class LoginService {
	public boolean validateUser(String user, String password) {
		System.out.println("In validateUser");
		return user.equalsIgnoreCase("cturner1") && password.equals("Globalbooklet11540");
	}

}