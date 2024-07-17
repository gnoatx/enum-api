package com.api.enumclasse;

public enum UF {
    AC("Acre", "Rio Branco"),
    AL("Alagoas", "Maceió"),
    AP("Amapá", "Macapá"),
    AM("Amazonas", "Manaus"),
    BA("Bahia", "Salvador"),
    CE("Ceara", "Fortaleza"),
    DF("Distrito Federal", "Brasília"),
    ES("Espirito Santo", "Vitória"),
    GO("Goiás", "Goiânia"),
    MA("Maranhão", "São Luís"),
    MT("Mato Grosso", "Cuiabá"),
    MS("Mato Grosso do Sul", "Campo Grande"),
    MG("Minas Gerais", "Belo Horizonte"),
    PA("Pará", "Belém"),
    PB("Paraíba", "João Pessoa"),
    PR("Paraná", "Curitiba"),
    PE("Pernambuco", "Recife"),
    PI("Piauí", "Teresina"),
    RJ("Rio de Janeiro", "Rio de Janeiro"),
    RN("Rio Grande do Norte", "Natal"),
    RS("Rio Grande do Sul", "Porto Alegre"),
    RO("Rondônia", "Porto Velho"),
    RR("Roraima", "Boa Vista"),
    SC("Santa Catarina", "Florianópolis"),
    SP("São Paulo", "São Paulo"),
    SE("Sergipe", "Aracaju"),
    TO("Tocantins", "Palmas");

    private final String nome;
    private final String capital;

    UF(String nome, String capital) {
        this.nome = nome;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public static void lista() {
        for (UF uf : UF.values()) {
            System.out.print(uf.name());
            if (uf.ordinal() < UF.values().length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static boolean existe(String codigo) {
        for (UF uf : values()) {
            if (uf.name().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
}
