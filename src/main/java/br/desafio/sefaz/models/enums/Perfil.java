package br.desafio.sefaz.models.enums;

public enum Perfil {

	ADMIN(1, "ROLE_ADMIN"),
	USUARIO(2, "ROLE_USUARIO");

	private int cod;
	private String desc;

	private Perfil(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}

	public static Perfil toEnum(Integer cod) {
		if( cod == null || cod < 0) {
			return null;
		}
		
		for (Perfil x : values()) {
			if (cod.equals(x.getCod())) {
				return x; 
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
