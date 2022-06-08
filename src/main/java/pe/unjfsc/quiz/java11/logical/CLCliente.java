package pe.unjfsc.quiz.java11.logical;

import java.util.HashSet;
import pe.unjfsc.quiz.java11.entity.CECliente;

public class CLCliente {

    public Object[][] convertHashSetArray(HashSet<CECliente> poHsData) {

        String[][] aDataResponse = new String[poHsData.size()][9];
        int iRow = 0;
        for (CECliente oItem : poHsData) {
            aDataResponse[iRow][0] = oItem.getOrdenP();
            aDataResponse[iRow][1] = oItem.getOrden();
            aDataResponse[iRow][2] = oItem.getNombre();
            aDataResponse[iRow][3] = String.valueOf(oItem.getImpPedido());
            aDataResponse[iRow][4] = String.valueOf(oItem.getImpuesto());
            aDataResponse[iRow][5] = String.valueOf(oItem.getTotalProy());
            aDataResponse[iRow][6] = String.valueOf(oItem.getRetencion20());
            aDataResponse[iRow][7] = String.valueOf(oItem.getRetencion30());
            aDataResponse[iRow][8] = String.valueOf(oItem.getRetencion40());

            iRow++;
        }
        return aDataResponse;
    }
}
