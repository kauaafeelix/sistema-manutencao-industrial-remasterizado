package Model;

import java.util.Date;

public class Requisicao {

    private int id;
    private String setor;
    private Date dataSolicitacao;

    public Requisicao(){}

    public Requisicao(int id, String setor, Date dataSolicitacao) {
        this.id = id;
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
    }
    public Requisicao(String setor, Date dataSolicitacao) {
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
