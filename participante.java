public class Participante extends Usuario{
    private String pagamento; 

    public Participante(String nome, int idade, String cpf, String pagamento) {
        super(nome, idade, cpf);
        this.pagamento = pagamento;
    }

    

    public String getPagamento() {
        return pagamento;
    }
}