
package risorse;

import java.util.Date;
import java.util.List;


public class JoinType {
    
    private List<String> codici;
    Date data;

    public JoinType() {
    }

    public JoinType(List<String> codici, Date data) {
        this.codici = codici;
        this.data = data;
    }

    public List<String> getCodici() {
        return codici;
    }

    public void setCodici(List<String> codici) {
        this.codici = codici;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
