package Model;

import Model.enuns.StatusRequisicao;

import java.util.Date;

public class Requisicao {

    private int id;
    private String setor;
    private Date dataSolicitacao;
    private StatusRequisicao status;

    public Requisicao(){}

    public Requisicao(int id, String setor, Date dataSolicitacao, StatusRequisicao status) {
        this.id = id;
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }
    public Requisicao(String setor, Date dataSolicitacao, StatusRequisicao status) {
        this.setor = setor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
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

    public StatusRequisicao getStatus() {
        return status;
    }

    public void setStatus(StatusRequisicao status) {
        this.status = status;
    }
}
