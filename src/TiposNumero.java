public enum TiposNumero {
    FAX("Fax"), FIJO("Telefono fijo"), MOVIL("Telefono movil");

    private final String tipo;

    TiposNumero(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
