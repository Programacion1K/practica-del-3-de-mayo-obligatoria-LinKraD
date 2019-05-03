public enum TiposNumero {
    FAX("fax"), FIJO("telefono fijo"), MOVIL("telefono movil");

    private final String tipo;

    TiposNumero(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
