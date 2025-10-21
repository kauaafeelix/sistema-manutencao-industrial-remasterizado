package Model;

import java.util.Date;

public class NotaEntrada {

    private int id;
    private Fornecedor idFornecedor;
    private Date dataEntrada;

    public NotaEntrada(){}

    public NotaEntrada(int id, Fornecedor idFornecedor, Date dataEntrada) {
        this.id = id;
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }
    public NotaEntrada(Fornecedor idFornecedor, Date dataEntrada) {
        this.idFornecedor = idFornecedor;
        this.dataEntrada = dataEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fornecedor getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Fornecedor idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
