
public class LimiteCredito {

    int NConta;
    int InicioMes;
    int ItensT;
    int CTotal;
    int LimiteFinal;
    int NSaldo;

    public LimiteCredito(int NConta, int InicioMes, int ItensT, int CTotal, int LimiteFinal) {
        this.NConta = NConta;
        this.InicioMes = InicioMes;
        this.ItensT = ItensT;
        this.CTotal = CTotal;
        this.LimiteFinal = LimiteFinal;
    }

    public void getNConta(int NumConta) {
        NConta = NumConta;
    }

    public int setNConta() {
        return NConta;
    }

    public void getInicioMes(int NInicioMes) {
        InicioMes = NInicioMes;
    }

    public int setInicioMes() {
        return InicioMes;
    }

    public void getItensT(int ItensTotal) {
        ItensT = ItensTotal;
    }

    public int setItensT() {
        return ItensT;
    }

    public void getCTotal(int CreditoTotal) {
        CTotal = CreditoTotal;
    }

    public int setCTotal() {
        return CTotal;
    }

    public void getLimiteFinal(int limite) {
        LimiteFinal = limite;
    }

    public int setLimiteFinal() {
        return LimiteFinal;
    }
}
