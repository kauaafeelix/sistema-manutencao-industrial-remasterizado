package Model;

public class NotaEntradaItem {

    private NotaEntrada idNotaEntrada;
    private Material idMaterial;
    private double quantidade;

    public NotaEntradaItem() {
    }

    public NotaEntradaItem(NotaEntrada idNotaEntrada, Material idMaterial, double quantidade) {
        this.idNotaEntrada = idNotaEntrada;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public NotaEntrada getIdNotaEntrada() {
        return idNotaEntrada;
    }

    public void setIdNotaEntrada(NotaEntrada idNotaEntrada) {
        this.idNotaEntrada = idNotaEntrada;
    }

    public Material getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Material idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
