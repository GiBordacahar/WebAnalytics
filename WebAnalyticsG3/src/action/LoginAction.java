package action;

public class LoginAction {
	public String execute(){
		System.out.println("Hello from execute");
		return "failure"; //El String que devuelve la función es el core para desplegar el .jsp luego
	}

}
