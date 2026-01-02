package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		double vlrCer = 5;
		double vlrRefri = 3;
		double vlrEsp = 7;
		double consumo = (vlrEsp * barbecue) + (vlrCer * beer) + (vlrRefri * softDrink);
		return consumo;
	}

	public double cover() {
		double covert = 4;

		if (feeding() > 30) {
			covert = 0;
		}
		return covert;
	}

	public double ticket() {
		double ticket;

		if (gender == 'F') {
			ticket = 8.0;
		} else if (gender == 'M') {
			ticket = 10.0;

		}

		else {
			ticket = 0;
		}

		return ticket;

	}

	public double total() {
		double total = feeding() + ticket() + cover();
		return total;

	}

	public String toString() {
		
		
		String relatorio = "RELATÓRIO\n";
		relatorio += "Consumo = R$ " + feeding() + "\n";
		if (cover() == 0) {
			relatorio += "Isento de couvert\n";
			
		}
		else {
			relatorio += "Couvert = R$ " + cover() + "\n";
		}
		
		relatorio += "Ingresso " + ticket() + "\n";
		relatorio += "\n";
		relatorio += "Valor a pagar = R$ " + total() + "\n";
		
		
		return relatorio;
		
		        
	}

}
