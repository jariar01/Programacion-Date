package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(24, 7, 2017);
			System.out.println(today.toString());
			System.out.println(today.nombreDelMes());
			System.out.println(today.estacionMes());
			System.out.println(today.mesesRestantes());
			System.out.println(today.fecha());
			System.out.println(today.diasRestantes());
			System.out.println(today.mismosDias());
			System.out.println("Han pasado desde principio de año "+today.diasPrincipio()+" dias");
			System.out.println("Se han realizado "+today.numeroIntentos()+" intentos");
			System.out.println("Se han realizado "+today.numeroIntentos2()+" intentos");
			System.out.println(today.diaSemana());

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}