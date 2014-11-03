package services;

public class Balanceador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void mostrarParametros(String ip, String id, String url, String newVisit, String date, String time){
		System.out.println("Ip: " + ip);
		System.out.println("Id pagina web: " + id);
		System.out.println("Url: " + url);
		System.out.println("Nuevo visitante: " + newVisit);
		System.out.println("Fecha: "+ date);
		System.out.println("Hora: "+time);
	}

}
